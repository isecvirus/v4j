/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component.Phone.iPhone;

import Component.Button.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author virus
 */
public class ControlCenter extends javax.swing.JPanel {

    private boolean isAirplane, isAccesspoint, isWifi, isBluetooth;
    private Color selectedColor = new Color(4, 123, 254);
    private Color unselectedColor = new Color(200, 200, 200, 50);

    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Button b = (Button)e.getSource();
            String keyName = b.getName() + "Value";
            boolean CuurentValue = (boolean)b.getClientProperty(keyName);
                        
            if (CuurentValue == false) {
                b.setBackground(selectedColor);
                b.putClientProperty(keyName, true);
            } else {
                b.setBackground(unselectedColor);
                b.putClientProperty(keyName, false);
            }
        }
    };

    public ControlCenter() {
        initComponents();
        IconFontSwing.register(FontAwesome.getIconFont());

        aawb.setArc(25);
        aawb.setBackground(new Color(0, 0, 0, 50));

        airplane.setBackground(unselectedColor);
        airplane.setIcon(IconFontSwing.buildIcon(FontAwesome.PLANE, 22, Color.white));
        airplane.putClientProperty("airplaneValue", isAirplane);
        airplane.setName("airplane");
        airplane.addActionListener(listener);

        accesspoint.setBackground(unselectedColor);
        accesspoint.addActionListener(listener);
        accesspoint.setName("accesspoint");
        accesspoint.putClientProperty("accesspointValue", isAccesspoint);

        wifi.setBackground(unselectedColor);
        wifi.setIcon(IconFontSwing.buildIcon(FontAwesome.WIFI, 22, Color.white));
        wifi.addActionListener(listener);
        wifi.setName("wifi");
        wifi.putClientProperty("wifiValue", isWifi);

        bluetooth.setBackground(unselectedColor);
        bluetooth.setIcon(IconFontSwing.buildIcon(FontAwesome.BLUETOOTH_B, 22, Color.white));
        bluetooth.addActionListener(listener);
        bluetooth.setName("bluetooth");
        bluetooth.putClientProperty("bluetoothValue", isBluetooth);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aawb = new Component.Panel.Panel();
        airplane = new Component.Button.Button();
        accesspoint = new Component.Button.Button();
        wifi = new Component.Button.Button();
        bluetooth = new Component.Button.Button();

        aawb.setBackground(new java.awt.Color(0, 0, 0));

        airplane.setArc(50);
        airplane.setFocusable(false);
        airplane.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        airplane.setIconTextGap(0);

        accesspoint.setArc(50);
        accesspoint.setFocusable(false);
        accesspoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        accesspoint.setIconTextGap(0);

        wifi.setArc(50);
        wifi.setFocusable(false);
        wifi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wifi.setIconTextGap(0);

        bluetooth.setArc(50);
        bluetooth.setFocusable(false);
        bluetooth.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bluetooth.setIconTextGap(0);
        bluetooth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bluetoothActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aawbLayout = new javax.swing.GroupLayout(aawb);
        aawb.setLayout(aawbLayout);
        aawbLayout.setHorizontalGroup(
            aawbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aawbLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(aawbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aawbLayout.createSequentialGroup()
                        .addComponent(wifi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bluetooth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aawbLayout.createSequentialGroup()
                        .addComponent(airplane, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accesspoint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        aawbLayout.setVerticalGroup(
            aawbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aawbLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(aawbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accesspoint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airplane, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(aawbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wifi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bluetooth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aawb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aawb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bluetoothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bluetoothActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bluetoothActionPerformed

    /*
        aawb:
            a=air plane mode
            a=access point
            w=wi-fi
            b=bluetooth
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Panel.Panel aawb;
    private Component.Button.Button accesspoint;
    private Component.Button.Button airplane;
    private Component.Button.Button bluetooth;
    private Component.Button.Button wifi;
    // End of variables declaration//GEN-END:variables
}
