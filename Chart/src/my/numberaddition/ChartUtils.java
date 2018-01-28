/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

import static java.awt.Frame.MAXIMIZED_BOTH;

/**
 *
 * @author Rum
 */
public class ChartUtils implements ControllerInterface {
    
    ModelInterface model;
    ControlsUI controlView;    
    ChartUI chartView;
    private String path;

    
    public ChartUtils(ModelInterface model){
        
        this.model = model;        
        controlView = new ControlsUI(this,model);
        chartView = new ChartUI("chart",this,model);
        chartView.createWindowsListener();
        controlView.createControls();        
    }    
    
    public void openChart(){
        model.readFile(path);
        controlView.setCheckBox();
        controlView.enableItems();
        chartView.createPanel();
        setOnAnnotations();
        chartView.pack();             
        chartView.setExtendedState(MAXIMIZED_BOTH);
        chartView.setVisible(true);     
    }
    
    
    @Override
    public void filtrate(){
        model.filtrate();
    } 
    
    @Override
    public void unFiltrate(){
        model.unFiltrate();
    }    
    
    @Override
    public void setPath(String path){       //Передаем в параметрах путь к файлу
        if(path != null){
            this.path = path;
            openChart();
        }
    }   
    
    @Override
    public void setOffCheckBox(){
        controlView.desableItems();
    }
    
    @Override
    public void setNumberAxis_X(int num){        
        model.setNumberAxis_X(num);
        controlView.desableItemBindAll();
        switch(num){
            
            case 0:
                controlView.enableItemBindTime();
                break;            
            case 1:
                controlView.enableItemBind1();
                break;
            case 2:
                controlView.enableItemBind2();
                break;
            case 3:
                controlView.enableItemBind3();
                break;
            case 4:
                controlView.enableItemBind4();
                break;
            case 5:
                controlView.enableItemBind5();
                break;
            case 6:
                controlView.enableItemBind6();
                break;
            case 7:
                controlView.enableItemBind7();
                break;
            case 8:
                controlView.enableItemBind8();
                break;
            case 9:
                controlView.enableItemBind9();
                break;
            case 10:
                controlView.enableItemBind10();
                break;            
        }
    } 
    
    @Override
    public void setNumberCursor(int numberCursor){
        
        model.setNumberCursor(numberCursor);
        chartView.enableCursor();
        controlView.desableItemCursorAll();
        switch(numberCursor){
            
            case 0:
                controlView.enableItemCursor0();                
                break;
            case 1:
                controlView.enableItemCursor1();
                break;
            case 2:
                controlView.enableItemCursor2();
                break; 
            case 3:
                controlView.enableItemCursor3();
                break;
            case 4:
                controlView.enableItemCursor4();
                break;
            case 5:
                controlView.enableItemCursor5();
                break;
            case 6:
                controlView.enableItemCursor6();
                break;
            case 7:
                controlView.enableItemCursor7();
                break;
            case 8:
                controlView.enableItemCursor8();
                break; 
            case 9:
                controlView.enableItemCursor9();
                break;                 
        }
    }     
    
    @Override
    public void setOnAnnotations(){
        chartView.enableAnnotations();
        controlView.desableAnnotItemOff();
        controlView.enableAnnotItemOn();
    }
    
    @Override
    public void setOffAnnotations(){
        chartView.desableAnnotations();
        controlView.desableAnnotItemOn();
        controlView.enableAnnotItemOff();
    }   
    
    @Override
    public void doBindAllToZero(){
        model.doBindAllToZero();
    }
    
    @Override
    public void doBindToValue(double val,int num){
        model.doBindToValue(val,num);
    }
}
