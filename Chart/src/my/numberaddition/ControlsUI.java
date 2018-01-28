/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

import java.io.File;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


/**
 *
 * @author admin
 */
public class ControlsUI extends JFrame {
    
    ControllerInterface controller;
    ModelInterface model; 
    private JCheckBoxMenuItem[] cursorItems;    
    private JCheckBoxMenuItem[] items;
    private String[] arrNames;

    /**
     * Creates new form NumberAdditionUI
     * @param controller
     * @param model
     */
    public ControlsUI(ControllerInterface controller, ModelInterface model) {
        
        this.controller = controller;
        this.model = model;          
    }    
    
    public void createControls(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jBtnUnfiltrate = new javax.swing.JButton();
        jBtnFiltrate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBtnBind = new javax.swing.JButton();
        jBtnBindAll = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        items = new JCheckBoxMenuItem[11];
        jMenu1 = new javax.swing.JMenu();
        jItemBind1 = new javax.swing.JCheckBoxMenuItem();
        jItemBind1.setVisible(false);
        jItemBind2 = new javax.swing.JCheckBoxMenuItem();
        jItemBind2.setVisible(false);
        jItemBind3 = new javax.swing.JCheckBoxMenuItem();
        jItemBind3.setVisible(false);
        jItemBind4 = new javax.swing.JCheckBoxMenuItem();
        jItemBind4.setVisible(false);
        jItemBind5 = new javax.swing.JCheckBoxMenuItem();
        jItemBind5.setVisible(false);
        jItemBind6 = new javax.swing.JCheckBoxMenuItem();
        jItemBind6.setVisible(false);
        jItemBind7 = new javax.swing.JCheckBoxMenuItem();
        jItemBind7.setVisible(false);
        jItemBind8 = new javax.swing.JCheckBoxMenuItem();
        jItemBind8.setVisible(false);
        jItemBind9 = new javax.swing.JCheckBoxMenuItem();
        jItemBind9.setVisible(false);
        jItemBind10 = new javax.swing.JCheckBoxMenuItem();
        jItemBind10.setVisible(false);
        jItemBindTime = new javax.swing.JCheckBoxMenuItem();
        cursorItems = new JCheckBoxMenuItem[10];
        jMenu2 = new javax.swing.JMenu();
        jItemCursor0 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor0.setVisible(false);
        jItemCursor1 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor1.setVisible(false);
        jItemCursor2 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor2.setVisible(false);
        jItemCursor3 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor3.setVisible(false);
        jItemCursor4 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor4.setVisible(false);
        jItemCursor5 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor5.setVisible(false);
        jItemCursor6 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor6.setVisible(false);
        jItemCursor7 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor7.setVisible(false);
        jItemCursor8 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor8.setVisible(false);
        jItemCursor9 = new javax.swing.JCheckBoxMenuItem();
        jItemCursor9.setVisible(false);
        jMenu4 = new javax.swing.JMenu();
        checkBoxMarkerOn = new javax.swing.JCheckBoxMenuItem();
        checkBoxMarkerOff = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChartControls");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Фильтр", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel4.setToolTipText("");
        jPanel4.setEnabled(false);
        jPanel4.setMinimumSize(new java.awt.Dimension(120, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(110, 57));

        jBtnUnfiltrate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBtnUnfiltrate.setText("-");
        jBtnUnfiltrate.setToolTipText("");
        jBtnUnfiltrate.setEnabled(false);
        jBtnUnfiltrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUnfiltrateActionPerformed(evt);
            }
        });

        jBtnFiltrate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBtnFiltrate.setText("+");
        jBtnFiltrate.setToolTipText("");
        jBtnFiltrate.setEnabled(false);
        jBtnFiltrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFiltrateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnUnfiltrate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnFiltrate)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUnfiltrate)
                    .addComponent(jBtnFiltrate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Сдвиг", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setEnabled(false);

        jComboBox1.setToolTipText("");
        jComboBox1.setEnabled(false);

        jTextField1.setEnabled(false);

        jLabel2.setText("Значение:");
        jLabel2.setEnabled(false);

        jBtnBind.setText("Применить");
        jBtnBind.setEnabled(false);
        jBtnBind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(jBtnBind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnBind)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jBtnBindAll.setText("Привязать к 0");
        jBtnBindAll.setEnabled(false);
        jBtnBindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBindAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnBindAll)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnBindAll)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu3.setText("Файл");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setText("Открыть");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(120, 22));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("Относительно");
        jMenu1.setEnabled(false);
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jItemBind1.setText("jItemBind1");
        items[0] = jItemBind1;
        jItemBind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind1ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind1);

        items[1] = jItemBind2;
        jItemBind2.setText("jItemBind2");
        jItemBind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind2ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind2);

        items[2] = jItemBind3;
        jItemBind3.setText("jItemBind3");
        jItemBind3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind3ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind3);

        items[3] = jItemBind4;
        jItemBind4.setText("jItemBind4");
        jItemBind4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind4ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind4);

        items[4] = jItemBind5;
        jItemBind5.setText("jItemBind5");
        jItemBind5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind5ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind5);

        items[5] = jItemBind6;
        jItemBind6.setText("jItemBind6");
        jItemBind6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind6ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind6);

        items[6] = jItemBind7;
        jItemBind7.setText("jItemBind7");
        jItemBind7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind7ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind7);

        items[7] = jItemBind8;
        jItemBind8.setText("jItemBind8");
        jItemBind8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind8ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind8);

        items[8] = jItemBind9;
        jItemBind9.setText("jItemBind9");
        jItemBind9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind9ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind9);

        items[9] = jItemBind10;
        jItemBind10.setText("jItemBind10");
        jItemBind10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBind10ActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBind10);

        jItemBindTime.setSelected(true);
        items[10] = jItemBindTime;
        jItemBindTime.setText("Время");
        jItemBindTime.setToolTipText("");
        jItemBindTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBindTimeActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBindTime);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Курсор");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jItemCursor0.setText("jItemCursor0");
        cursorItems[0] =  jItemCursor0;
        jItemCursor0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor0ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor0);

        jItemCursor1.setText("jItemCursor1");
        cursorItems[1] = jItemCursor1;
        jItemCursor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor1ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor1);

        jItemCursor2.setText("jItemCursor2");
        cursorItems[2] = jItemCursor2;
        jItemCursor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor2ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor2);

        jItemCursor3.setText("jItemCursor3");
        jItemCursor3.setToolTipText("");
        cursorItems[3] = jItemCursor3;
        jItemCursor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor3ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor3);

        jItemCursor4.setText("jItemCursor4");
        cursorItems[4] = jItemCursor4;
        jItemCursor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor4ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor4);

        jItemCursor5.setText("jItemCursor5");
        jItemCursor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor5ActionPerformed(evt);
            }
        });
        cursorItems[5] = jItemCursor5;
        jMenu2.add(jItemCursor5);

        jItemCursor6.setText("jItemCursor6");
        cursorItems[6] = jItemCursor7;
        jItemCursor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor6ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor6);

        jItemCursor7.setText("jItemCursor7");
        cursorItems[7] = jItemCursor7;
        jItemCursor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor7ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor7);

        jItemCursor8.setText("jItemCursor8");
        jItemCursor8.setToolTipText("");
        cursorItems[8] = jItemCursor8;
        jItemCursor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor8ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor8);

        jItemCursor9.setText("jItemCursor9");
        cursorItems[9] = jItemCursor9;
        jItemCursor9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCursor9ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemCursor9);

        jMenuBar2.add(jMenu2);

        jMenu4.setText("Маркировка");
        jMenu4.setEnabled(false);
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        checkBoxMarkerOn.setSelected(true);
        checkBoxMarkerOn.setText("Вкл");
        checkBoxMarkerOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMarkerOnActionPerformed(evt);
            }
        });
        jMenu4.add(checkBoxMarkerOn);

        checkBoxMarkerOff.setText("Выкл");
        checkBoxMarkerOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMarkerOffActionPerformed(evt);
            }
        });
        jMenu4.add(checkBoxMarkerOff);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        JFileChooser fileopen = new JFileChooser();
        String nameFile;
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            nameFile = file.getAbsolutePath();     
            controller.setPath(nameFile);  
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    void setCheckBox(){        
        arrNames = model.getNamesChannels();              
        if(arrNames != null){
            for(int i = 0; i < arrNames.length; i++){                
                items[i].setText(arrNames[i]);
                cursorItems[i].setText(arrNames[i]);
                items[i].setPreferredSize(new java.awt.Dimension(120, 22));
                cursorItems[i].setPreferredSize(new java.awt.Dimension(120, 22));
                items[i].setVisible(true);                 
                cursorItems[i].setVisible(true);
            } 
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(arrNames));
        }        
    }  
    
    void enableItems(){        
        setAlwaysOnTop(true);
        jMenu1.setEnabled(true);
        jMenu2.setEnabled(true);
        jMenu4.setEnabled(true);
        jComboBox1.setEnabled(true);
        jBtnUnfiltrate.setEnabled(true);
        jBtnFiltrate.setEnabled(true);
        jBtnBindAll.setEnabled(true);
        jBtnBind.setEnabled(true);
        jTextField1.setEnabled(true);
        jLabel2.setEnabled(true);
        jPanel4.setEnabled(true);
        jPanel2.setEnabled(true);
    }
    
    void desableItems(){
        jComboBox1.removeAllItems();
        jMenu1.setEnabled(false);
        jMenu2.setEnabled(false);
        jMenu4.setEnabled(false);
        jComboBox1.setEnabled(false);
        jBtnUnfiltrate.setEnabled(false);
        jBtnFiltrate.setEnabled(false);
        jBtnBindAll.setEnabled(false);
        jBtnBind.setEnabled(false);
        jTextField1.setEnabled(false);
        jLabel2.setEnabled(false);
        jPanel4.setEnabled(false);
        jPanel2.setEnabled(false); 
    }
    //  Вкл/Выкл Пункты меню "Относительно"   
    void enableItemBindTime(){
        jItemBindTime.setSelected(true);
    }
    void enableItemBind1(){
        jItemBind1.setSelected(true);
    }
    void enableItemBind2(){
        jItemBind2.setSelected(true);
    }
    void enableItemBind3(){
        jItemBind3.setSelected(true);
    }
    void enableItemBind4(){
        jItemBind4.setSelected(true);
    }
    void enableItemBind5(){
        jItemBind5.setSelected(true);
    }
    void enableItemBind6(){
        jItemBind6.setSelected(true);
    }
    void enableItemBind7(){
        jItemBind7.setSelected(true);
    }
    void enableItemBind8(){
        jItemBind8.setSelected(true);
    }
    void enableItemBind9(){
        jItemBind9.setSelected(true);
    }
    void enableItemBind10(){
        jItemBind10.setSelected(true);
    }
    void desableItemBindAll(){
        for(JCheckBoxMenuItem item : items){
            item.setSelected(false);
        }   
    }
    // Вкл/Выкл Пункты меню "Курсор"   
    void enableItemCursor0(){
        jItemCursor0.setSelected(true);
    }
    void enableItemCursor1(){
        jItemCursor1.setSelected(true);
    }
    void enableItemCursor2(){
        jItemCursor2.setSelected(true);
    }
    void enableItemCursor3(){
        jItemCursor3.setSelected(true);
    }
    void enableItemCursor4(){
        jItemCursor4.setSelected(true);
    }
    void enableItemCursor5(){
        jItemCursor5.setSelected(true);
    }
    void enableItemCursor6(){
        jItemCursor6.setSelected(true);
    }
    void enableItemCursor7(){
        jItemCursor7.setSelected(true);
    }
    void enableItemCursor8(){
        jItemCursor8.setSelected(true);
    }
    void enableItemCursor9(){
        jItemCursor9.setSelected(true);
    }
    void desableItemCursorAll(){
        for(JCheckBoxMenuItem item : cursorItems){
            item.setSelected(false);
        }
    }            
    // Вкл/Выкл Пункты меню "Маркировка"   
    void enableAnnotItemOn(){
        checkBoxMarkerOn.setSelected(true);
    }
    void enableAnnotItemOff(){
        checkBoxMarkerOff.setSelected(true);
    }
    void desableAnnotItemOn(){
        checkBoxMarkerOn.setSelected(false);
    }
    void desableAnnotItemOff(){
        checkBoxMarkerOff.setSelected(false);
    }
    
    private void jBtnBindAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBindAllActionPerformed
        controller.doBindAllToZero();
    }//GEN-LAST:event_jBtnBindAllActionPerformed

    private void jBtnBindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBindActionPerformed
        
        double val;
        int num = 1;
        String str = jComboBox1.getSelectedItem().toString();        
        for(int i = 0; i < arrNames.length; i++ ){
            if(arrNames[i].equals(str))num = i+1;
        }
        try{
            val = Double.parseDouble(jTextField1.getText());
        }catch(NumberFormatException e) {
            val = 0;
        }
        controller.doBindToValue(val,num);
    }//GEN-LAST:event_jBtnBindActionPerformed

    private void jBtnFiltrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFiltrateActionPerformed
        controller.filtrate();
    }//GEN-LAST:event_jBtnFiltrateActionPerformed

    private void jBtnUnfiltrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUnfiltrateActionPerformed
        controller.unFiltrate();
    }//GEN-LAST:event_jBtnUnfiltrateActionPerformed

    private void checkBoxMarkerOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMarkerOnActionPerformed
        controller.setOnAnnotations(); 
    }//GEN-LAST:event_checkBoxMarkerOnActionPerformed

    private void checkBoxMarkerOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMarkerOffActionPerformed
        controller.setOffAnnotations();  
    }//GEN-LAST:event_checkBoxMarkerOffActionPerformed

    private void jItemCursor0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor0ActionPerformed
        controller.setNumberCursor(0);
    }//GEN-LAST:event_jItemCursor0ActionPerformed

    private void jItemCursor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor1ActionPerformed
        controller.setNumberCursor(1);       
    }//GEN-LAST:event_jItemCursor1ActionPerformed

    private void jItemCursor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor2ActionPerformed
        controller.setNumberCursor(2);
    }//GEN-LAST:event_jItemCursor2ActionPerformed

    private void jItemCursor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor3ActionPerformed
        controller.setNumberCursor(3);       
    }//GEN-LAST:event_jItemCursor3ActionPerformed

    private void jItemCursor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor4ActionPerformed
        controller.setNumberCursor(4);       
    }//GEN-LAST:event_jItemCursor4ActionPerformed

    private void jItemCursor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor5ActionPerformed
        controller.setNumberCursor(5);       
    }//GEN-LAST:event_jItemCursor5ActionPerformed

    private void jItemCursor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor6ActionPerformed
        controller.setNumberCursor(6);       
    }//GEN-LAST:event_jItemCursor6ActionPerformed

    private void jItemCursor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor7ActionPerformed
        controller.setNumberCursor(7);       
    }//GEN-LAST:event_jItemCursor7ActionPerformed

    private void jItemCursor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor8ActionPerformed
        controller.setNumberCursor(8);       
    }//GEN-LAST:event_jItemCursor8ActionPerformed

    private void jItemCursor9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCursor9ActionPerformed
        controller.setNumberCursor(9);       
    }//GEN-LAST:event_jItemCursor9ActionPerformed

    private void jItemBindTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBindTimeActionPerformed
        controller.setNumberAxis_X(0);
    }//GEN-LAST:event_jItemBindTimeActionPerformed

    private void jItemBind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind1ActionPerformed
        controller.setNumberAxis_X(1);
    }//GEN-LAST:event_jItemBind1ActionPerformed

    private void jItemBind2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind2ActionPerformed
        controller.setNumberAxis_X(2);
    }//GEN-LAST:event_jItemBind2ActionPerformed

    private void jItemBind3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind3ActionPerformed
        controller.setNumberAxis_X(3);
    }//GEN-LAST:event_jItemBind3ActionPerformed

    private void jItemBind4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind4ActionPerformed
        controller.setNumberAxis_X(4);
    }//GEN-LAST:event_jItemBind4ActionPerformed

    private void jItemBind5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind5ActionPerformed
        controller.setNumberAxis_X(5);
    }//GEN-LAST:event_jItemBind5ActionPerformed

    private void jItemBind6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind6ActionPerformed
        controller.setNumberAxis_X(6);
    }//GEN-LAST:event_jItemBind6ActionPerformed

    private void jItemBind7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind7ActionPerformed
        controller.setNumberAxis_X(7);
    }//GEN-LAST:event_jItemBind7ActionPerformed

    private void jItemBind8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind8ActionPerformed
        controller.setNumberAxis_X(8);
    }//GEN-LAST:event_jItemBind8ActionPerformed

    private void jItemBind9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind9ActionPerformed
        controller.setNumberAxis_X(9);
    }//GEN-LAST:event_jItemBind9ActionPerformed

    private void jItemBind10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBind10ActionPerformed
        controller.setNumberAxis_X(10);
    }//GEN-LAST:event_jItemBind10ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem checkBoxMarkerOff;
    private javax.swing.JCheckBoxMenuItem checkBoxMarkerOn;
    private javax.swing.JButton jBtnBind;
    private javax.swing.JButton jBtnBindAll;
    private javax.swing.JButton jBtnFiltrate;
    private javax.swing.JButton jBtnUnfiltrate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JCheckBoxMenuItem jItemBind1;
    private javax.swing.JCheckBoxMenuItem jItemBind10;
    private javax.swing.JCheckBoxMenuItem jItemBind2;
    private javax.swing.JCheckBoxMenuItem jItemBind3;
    private javax.swing.JCheckBoxMenuItem jItemBind4;
    private javax.swing.JCheckBoxMenuItem jItemBind5;
    private javax.swing.JCheckBoxMenuItem jItemBind6;
    private javax.swing.JCheckBoxMenuItem jItemBind7;
    private javax.swing.JCheckBoxMenuItem jItemBind8;
    private javax.swing.JCheckBoxMenuItem jItemBind9;
    private javax.swing.JCheckBoxMenuItem jItemBindTime;
    private javax.swing.JCheckBoxMenuItem jItemCursor0;
    private javax.swing.JCheckBoxMenuItem jItemCursor1;
    private javax.swing.JCheckBoxMenuItem jItemCursor2;
    private javax.swing.JCheckBoxMenuItem jItemCursor3;
    private javax.swing.JCheckBoxMenuItem jItemCursor4;
    private javax.swing.JCheckBoxMenuItem jItemCursor5;
    private javax.swing.JCheckBoxMenuItem jItemCursor6;
    private javax.swing.JCheckBoxMenuItem jItemCursor7;
    private javax.swing.JCheckBoxMenuItem jItemCursor8;
    private javax.swing.JCheckBoxMenuItem jItemCursor9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

   

    
}

