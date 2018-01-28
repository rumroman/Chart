/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Rum
 */
public interface ModelInterface {    
    
    // Для контроллеров
    
       
    void readFile(String path);             // Прочитать файл     
    void filtrate();                        // фильтр+
    void unFiltrate();                      // фильтр-
    void doBindAllToZero();                 // Привязка всех графиков к 0
    void doBindToValue(double val,int num); // Привязка конкретного канала , к заданному значению
    void setNumberAxis_X(int num);      // Установить канал оси Х
    void setNumberCursor(int num);          // Установить канал Курсора
    
    //Для наблюдателей
    XYSeriesCollection getDataset();    // Возвращает данные для построения графика
    String[] getNamesChannels();          // Возвращает массив имен каналов  
    int getAmountChannels();            // Возвращает количество каналов
    int getNumberAxis_X();          // Возвращает номер канала оси Х   
    int getNumberCursor();              // Возвращает номер канала установленного курсора    
    XYTextAnnotation[] getAnnotations();  //Установка аннотаций по последним значениям , возвращаем массив аннотаций  
    
    void registerObserver(AnnotationObserver o);    //Зарегистрировать слушателя
    void removeObserver(AnnotationObserver o);      //Удалить слушателя
    
}
