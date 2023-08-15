package Component.Card;

import Component.Panel.Panel;
import Component.Panel.PanelBorder;
import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author virus
 */
public class Announcment extends Panel {

    private Color accent = new Color(52, 87, 110);

    public Announcment() {
        initComponents();

        setAccent(accent);

        setArc(25);
        setBackground(new Color(accent.getRed(), accent.getGreen(), accent.getBlue(), 50));

        iconPanel.setArc(50);
        messagePanel.setArc(25);
    }

    public void setAccent(Color c) {
        iconPanel.setBackground(c);
        messagePanel.setBackground(c);
        border.setColor(c);
        setBackground(new Color(c.getRed(), c.getGreen(), c.getBlue(), 50));
    }

    public Color getAccent() {
        return this.accent;
    }

    public void setMessage(String m) {
        message.setText(m);
    }

    public String getMessage() {
        return message.getText();
    }

    public void setTitle(String t) {
        title.setText(t);
    }

    public String getTitle() {
        return title.getText();
    }

    public void setIcon(Icon i) {
        icon.setIcon(i);
    }
    
    public void setIconRadius(int a) {
        iconPanel.setArc(a);
    }
    
    public void setLineRadius(int a) {
        border.setArc(a);
    }
    
    public void setMessageRadius(int a) {
        messagePanel.setArc(a);
    }
    
    public Panel getMessagePanel() {
        return messagePanel;
    }
    
    public Panel getIconPanel() {
        return iconPanel;
    }
    
    public PanelBorder getBorderPanel() {
        return border;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border = new Component.Panel.PanelBorder();
        messagePanel = new Component.Panel.Panel();
        message = new javax.swing.JTextArea();
        iconPanel = new Component.Panel.Panel();
        icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        message.setEditable(false);
        message.setColumns(20);
        message.setLineWrap(true);
        message.setRows(5);
        message.setTabSize(4);
        message.setText("message");
        message.setWrapStyleWord(true);
        message.setAutoscrolls(false);
        message.setFocusable(false);
        message.setOpaque(false);

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );
        messagePanelLayout.setVerticalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout iconPanelLayout = new javax.swing.GroupLayout(iconPanel);
        iconPanel.setLayout(iconPanelLayout);
        iconPanelLayout.setHorizontalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        iconPanelLayout.setVerticalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Title");

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(messagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Panel.PanelBorder border;
    private javax.swing.JLabel icon;
    private Component.Panel.Panel iconPanel;
    private javax.swing.JTextArea message;
    private Component.Panel.Panel messagePanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
