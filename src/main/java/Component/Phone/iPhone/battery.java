/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component.Phone.iPhone;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author virus
 */
public class battery extends javax.swing.JPanel {

    int level, lowVal, midVal, highVal;
    Color lowColor, midColor, highColor;
    int width;
    
    public battery() {
        initComponents();

        level = 100;

        lowVal = 10;
        midVal = 30;
        highVal = 50;

        lowColor = new Color(253, 61, 51);
        midColor = new Color(247, 203, 14);
        highColor = new Color(75, 217, 96);

        levelPanel.setArc(10);
        levelBorder.setArc(15);

        setLevel(level);
    }

    public void setLevel(int v) {
        v = Math.max(0, Math.min(100, v));

        this.level = v;

        if (v <= lowVal) {
            levelPanel.setBackground(lowColor);
        } else if (v > lowVal && v <= midVal) {
            levelPanel.setBackground(midColor);
        } else if (v >= highVal) {
            levelPanel.setBackground(highColor);
        }

        this.width = (int) (levelBorder.getPreferredSize().width * ((double) v / 100)); // 0

        levelPanel.setPreferredSize(new Dimension(width, levelPanel.getPreferredSize().height));

        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        levelBorder = new Component.Panel.PanelBorder();
        levelPanel = new Component.Panel.Panel();

        levelBorder.setColor(null);

        levelPanel.setPreferredSize(new java.awt.Dimension(136, 55));

        javax.swing.GroupLayout levelPanelLayout = new javax.swing.GroupLayout(levelPanel);
        levelPanel.setLayout(levelPanelLayout);
        levelPanelLayout.setHorizontalGroup(
            levelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );
        levelPanelLayout.setVerticalGroup(
            levelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout levelBorderLayout = new javax.swing.GroupLayout(levelBorder);
        levelBorder.setLayout(levelBorderLayout);
        levelBorderLayout.setHorizontalGroup(
            levelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(levelBorderLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(levelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        levelBorderLayout.setVerticalGroup(
            levelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, levelBorderLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(levelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(levelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(levelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Panel.PanelBorder levelBorder;
    private Component.Panel.Panel levelPanel;
    // End of variables declaration//GEN-END:variables
}
