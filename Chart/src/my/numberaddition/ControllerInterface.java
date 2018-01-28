/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

/**
 *
 * @author Rum
 */
public interface ControllerInterface {    
    
    void filtrate();   
    void unFiltrate();
    void setPath(String path);        
    void setNumberAxis_X(int num);  //Установить канал оси Х
    void setNumberCursor(int num);      //Установить канал Курсора
    void setOnAnnotations();           // Установить обозначение графиков
    void setOffAnnotations();
    void setOffCheckBox();
    void doBindAllToZero();                      //Привязка всех графиков к 0
    void doBindToValue(double val,int num);   // Привязка конкретного канала , к заданному значению    
    
}
