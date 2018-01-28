/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author Rum
 */
public class ChartModel implements ModelInterface {    
    
    private final ArrayList<Double>[] arrayOfListsCoordinate,copyArrayOfCoordinateLists;    
    private final ArrayList<AnnotationObserver> annotObservers;
    private final XYSeries[] arraySeries;
    private String[] arrNamesChannels;
    private final int LINE_NUMBER_CHANNELS_NAMES = 19;
    private final int LINE_NUMBER_START_DATA = 21;
    private final int MAX_CHANNELS = 11;
    private int amountChannels, numberAxis_X, numberCursor;
    private final XYSeriesCollection dataSet;        
    
    
    public ChartModel(){        
        arrayOfListsCoordinate = new ArrayList[MAX_CHANNELS];
        copyArrayOfCoordinateLists = new ArrayList[MAX_CHANNELS];
        arraySeries = new XYSeries[MAX_CHANNELS];
        dataSet = new XYSeriesCollection(); 
        annotObservers = new ArrayList<>();
    }    
    
    @Override
    public void readFile(String path){       //Передаем в параметрах путь к файлу         
        ArrayList<String> allDataList = new ArrayList<>();         
        try(BufferedReader reader = new BufferedReader(new InputStreamReader
                                                      (new FileInputStream(path)
                                                              ,"windows-1251")))
        {                        
            String str1;
            while ((str1 = reader.readLine()) != null){                                       
                allDataList.add(str1);                                             
            }
        }catch(IOException oe) {
            System.out.println("Ошибка ввода вывода" + oe);                                         
        } 
        initArrayOfCoordinateLists(allDataList);        
        createDataset();       
    }

    private void initArrayOfCoordinateLists(ArrayList<String> allDataList){          
        arrNamesChannels = allDataList.get(LINE_NUMBER_CHANNELS_NAMES)
                                    .replace(" ","")
                                    .split(",");    
        amountChannels = arrNamesChannels.length;   
        for(int i = 0; i < amountChannels;i++){
            arraySeries[i] = new XYSeries(arrNamesChannels[i]);      //Создаем контейнеры для графиков не считая время              
        }  
        for(int j = 0; j < amountChannels+1;j++){                
            arrayOfListsCoordinate[j] = new ArrayList<>();  // Количество каналов включая канал времени
            copyArrayOfCoordinateLists[j] = new ArrayList<>(); //Исходные данные
        }
        setCoordinateList(allDataList);
    }
    
    private void setCoordinateList(ArrayList<String> allData){
        double xDataTime;   //для времени
        double yData;       //для остальных графиков
        for(int n = LINE_NUMBER_START_DATA; n < allData.size(); n++){            
            String[] data = allData.get(n).replace(" ","").split(",");
            xDataTime = Double.parseDouble(data[0]);
            arrayOfListsCoordinate[0].add(xDataTime);
            copyArrayOfCoordinateLists[0].add(xDataTime);                
            for(int t = 1,x = 0 ; x < amountChannels; t++, x++){                    
                yData = Double.parseDouble(data[t]);                    
                arrayOfListsCoordinate[t].add(yData);
                copyArrayOfCoordinateLists[t].add(yData);
            } 
        } 
    }
    
    private void createDataset(){        
        clearSeries(); 
        addSeries();        
        for(XYSeries series : arraySeries){
            if(series != null)                
                dataSet.addSeries(series);                         
        }         
        notifyAnnotObservers();        
    }    
    
    private void addSeries(){
        double xData;
        double yData; 
        for(int k = 0 ; k < amountChannels; k++){        
            if(k+1 == numberAxis_X)
                continue;
            for(int i = 0; i < arrayOfListsCoordinate[1].size(); i++){
                xData = arrayOfListsCoordinate[numberAxis_X].get(i); 
                yData = arrayOfListsCoordinate[k+1].get(i); 
                arraySeries[k].add(xData,yData);                 
            }  
        }
    }
    
    private void clearSeries(){
        dataSet.removeAllSeries();
        for(XYSeries series : arraySeries){
            if(series != null)series.clear();
        }
    }

    @Override
    public void filtrate() {       
        
        for (int j = 0 ; j < amountChannels+1;j++){            
            ArrayList<Double> arrFiltrList = new ArrayList<>();   
            ArrayList<Double> arrCurrentList = arrayOfListsCoordinate[j];
            double current;
            for(int i = 0; i < arrCurrentList.size(); i++){
                if(i == 0)
                    arrFiltrList.add(arrCurrentList.get(i));
                else if (i == arrCurrentList.size()-1)
                    arrFiltrList.add(arrCurrentList.get(i));
                else{
                    current = 0.25*arrCurrentList.get(i-1)+0.5*arrCurrentList.get(i)+0.25*arrCurrentList.get(i+1);
                    arrFiltrList.add(current); 
                }
            } 
            arrayOfListsCoordinate[j] = arrFiltrList;            
        } 
        createDataset();
    }  
    
    @Override
    public void unFiltrate() {        
        System.arraycopy(copyArrayOfCoordinateLists,0, arrayOfListsCoordinate, 0, amountChannels+1);
        createDataset();
    }    
    
    @Override
    public void doBindAllToZero() {
        double current;
        double value;
        for(int i = 1 ; i < amountChannels+1; i++){
            current = arrayOfListsCoordinate[i].get(0);
            for(int n = 0; n < arrayOfListsCoordinate[i].size(); n++){
                value = arrayOfListsCoordinate[i].get(n)- current;
                arrayOfListsCoordinate[i].set(n, value);               
            }
        }
        createDataset();
    }

    @Override
    public void doBindToValue(double val, int num) {        
        double current = val;
        double value;
        for(int n = 0; n < arrayOfListsCoordinate[num].size(); n++){
            value = arrayOfListsCoordinate[num].get(n) + current;
            arrayOfListsCoordinate[num].set(n,value);
        }
        createDataset();
    } 

    @Override
    public void setNumberAxis_X(int numberRelativity) {
        this.numberAxis_X = numberRelativity;
        createDataset();
    }
    
    @Override
    public void setNumberCursor(int numberCursor) {
        this.numberCursor = numberCursor;        
    }    

    @Override
    public int getNumberAxis_X() {
        return numberAxis_X;
    }    

    @Override
    public int getNumberCursor() {      // Возвращает номер канала установленного курсора
        return  numberCursor;
    }

    @Override
    public XYTextAnnotation[] getAnnotations(){   //Установка аннотаций по последним значениям , возвращаем массив аннотаций 
        
        XYTextAnnotation annotation[] = new XYTextAnnotation[amountChannels];   
        Font font = new Font("SansSerif", Font.PLAIN, 12);                   
        for(int i = 0; i < amountChannels; i++){
            double x = arrayOfListsCoordinate[numberAxis_X].get(arrayOfListsCoordinate[1].size()-1);
            double y = arrayOfListsCoordinate[i+1].get(arrayOfListsCoordinate[1].size()-1);            
            annotation[i] = new XYTextAnnotation(arrNamesChannels[i], x, y);   
            annotation[i].setFont(font);   
            annotation[i].setTextAnchor(TextAnchor.HALF_ASCENT_LEFT); 
        }
        return annotation;
    }    
    
    @Override
    public XYSeriesCollection getDataset(){        
        return dataSet;
    }
    
    @Override
    public String[] getNamesChannels() {
        return arrNamesChannels;
    }

    @Override
    public int getAmountChannels() {
        return amountChannels;
    }
    
    public void notifyAnnotObservers(){
        for(AnnotationObserver annotObserver : annotObservers){
            annotObserver.updateAnnot();
        }
    }

    @Override
    public void registerObserver(AnnotationObserver o) {
        annotObservers.add(o);        
    }

    @Override
    public void removeObserver(AnnotationObserver o) {
        if(!annotObservers.isEmpty())
            annotObservers.remove(o);
    }  
}