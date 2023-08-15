/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component.Button;

import Component.Panel.Panel;
import Component.Panel.PanelBorder;
import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author virus
 */
public class TagButton extends PanelBorder {

    private Color accent = new Color(255, 0, 0);
    
    public TagButton() {
        initComponents();
        
        setArc(100);
        button.setArc(100);
        setAccent(accent);
    }
    
    public void setIcon(Icon i) {
        button.setIcon(i);
    }
    
    public void setAccent(Color c) {
        button.setBackground(c);
        setColor(c);
    }
    
    public Button getButton() {
        return button;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button = new Component.Button.Button();

        button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button.setIconTextGap(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 9, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Button.Button button;
    // End of variables declaration//GEN-END:variables

    public Color getAccent() {
        return accent;
    }
}
