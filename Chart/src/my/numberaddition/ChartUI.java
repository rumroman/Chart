/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.panel.CrosshairOverlay;
import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RectangleEdge;

/**
 *
 * @author Rum
 */
public class ChartUI extends JFrame implements ChartMouseListener,AnnotationObserver {
    
    
    private XYPlot xyplot;
    private ChartPanel chartPanel;
    private Crosshair xCrosshair;
    private Crosshair yCrosshair;
    private final ControllerInterface controller;
    private final ModelInterface model;
    
    
    public ChartUI(String title,ControllerInterface controller,ModelInterface model){        
        this.model = model;        
        model.registerObserver(ChartUI.this);
        this.controller = controller;
        
    }
    
    public void createWindowsListener(){
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }
            @Override
            public void windowClosing(WindowEvent e) {
                controller.setOffCheckBox();
            }
            @Override
            public void windowClosed(WindowEvent e) {                
            }
            @Override
            public void windowIconified(WindowEvent e) {
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
            }
            @Override
            public void windowActivated(WindowEvent e) {
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
    }
    
    public void createPanel(){
        
        JFreeChart chart = createChartView();
        chartPanel = new ChartPanel(chart);         
        chartPanel.setDismissDelay(10000);
        chartPanel.setMouseWheelEnabled(true);        
        chartPanel.setPreferredSize(new java.awt.Dimension(840, 480));        
        CrosshairOverlay crosshairOverlay = new CrosshairOverlay();
        xCrosshair = new Crosshair(Double.NaN, Color.GRAY, new BasicStroke(0f));
        xCrosshair.setLabelVisible(true);
        yCrosshair = new Crosshair(Double.NaN, Color.GRAY, new BasicStroke(0f));
        yCrosshair.setLabelVisible(true);
        crosshairOverlay.addDomainCrosshair(xCrosshair);
        crosshairOverlay.addRangeCrosshair(yCrosshair);
        chartPanel.addOverlay(crosshairOverlay);        
        setContentPane(chartPanel);
        //setExtendedState(MAXIMIZED_BOTH);
    }
    
    public JFreeChart createChartView(){
        
        XYDataset dataset = model.getDataset();                      
        JFreeChart chart = ChartFactory.createXYLineChart(
                    "Какое-то измерение , какой-то турбины",
                    "Время Т, с",
                    "Ход , мм",
                    dataset, PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(ChartColor.lightGray);        
        xyplot = (XYPlot)chart.getPlot();        
        xyplot.setBackgroundPaint(Color.WHITE);
        xyplot.setDomainPannable(true);
        xyplot.setDomainGridlinePaint(ChartColor.GRAY);
        xyplot.setRangeGridlinePaint(ChartColor.GRAY);
        xyplot.setRangePannable(true);        
        NumberAxis numberAxis = (NumberAxis)xyplot.getRangeAxis();
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        return chart;       
    }
    
    public void enableAnnotations() {        
        XYTextAnnotation annotations[] = model.getAnnotations();        
        xyplot.clearAnnotations();        
        for(XYTextAnnotation annotation : annotations){                        
            xyplot.addAnnotation(annotation);
        }
    }
    
    public void desableAnnotations(){
        xyplot.clearAnnotations();
    }    
    
    @Override
    public void chartMouseMoved(ChartMouseEvent cme) {       
        
        Rectangle2D dataArea;
        dataArea = chartPanel.getScreenDataArea();
        JFreeChart chart = cme.getChart();
        XYPlot plot = (XYPlot) chart.getPlot();
        ValueAxis xAxis = plot.getDomainAxis();
        double x = xAxis.java2DToValue(cme.getTrigger().getX(), dataArea, 
                RectangleEdge.BOTTOM);
        double y = DatasetUtilities.findYValue(plot.getDataset(), model.getNumberCursor(), x);
        xCrosshair.setValue(x);
        yCrosshair.setValue(y);
    }    
    
    @Override
    public void chartMouseClicked(ChartMouseEvent cme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void enableCursor(){        
        chartPanel.addChartMouseListener(this);
    }
    
    public void desableCursor(){
        chartPanel.removeChartMouseListener(this);        
    }

    @Override
    public void updateAnnot() {
        if(chartPanel != null){
            XYTextAnnotation annotations[] = model.getAnnotations();        
            xyplot.clearAnnotations();
        
            for(XYTextAnnotation annotation : annotations){                        
                xyplot.addAnnotation(annotation);
            }
        }
    }
}
