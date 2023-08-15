package Component.Card;

import Component.Panel.Panel;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.Icon;

/**
 *
 * @author virus
 */
public class ToDo extends Panel {

    private Color accent = new Color(0, 160, 211);

    public ToDo() {
        initComponents();
        
        setArc(10);
        
        setAccent(accent);
        btn2.setForeground(Color.black);
    }
    
    public void setAccent(Color c) {
        setBackground(new Color(c.getRed(), c.getGreen(), c.getBlue(), 30));
        btn1.setBackground(c);
        
        this.accent = c;
    }
    
    public Color getAccent() {
        return this.accent;
    }
    
    public void setNote(String n) {
        note.setText(n);
    }
    
    public void setIcon(Icon i) {
        icon.setIcon(i);
    }
    
    public void setOrText(String t) {
        orLabel.setText(t);
    }
    
    public void setSepColor(Color c) {
        sep.setForeground(c);
    }
    
    public void setResponse1Text(String t) {
        btn1.setText(t);
    }
    
    public void setResponse2Text(String t) {
        btn2.setText(t);
    }   
    
    public void addResponse1Action(ActionListener event) {
        btn1.addActionListener(event);
    }
    
    public void addResponse2Action(ActionListener event) {
        btn2.addActionListener(event);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        btn1 = new Component.Button.Button();
        orLabel = new javax.swing.JLabel();
        btn2 = new Component.Button.Button();
        sep = new javax.swing.JSeparator();

        note.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btn1.setText("b1");

        orLabel.setText("or");

        btn2.setText("b2");

        sep.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(note, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(note, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sep, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Button.Button btn1;
    private Component.Button.Button btn2;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel note;
    private javax.swing.JLabel orLabel;
    private javax.swing.JSeparator sep;
    // End of variables declaration//GEN-END:variables
}
