package Component.Phone.iPhone;

import Component.Panel.Panel;
import java.awt.Color;
import java.awt.event.ActionListener;

/**
 *
 * @author virus
 */
public class iPanel extends Panel {

    Color lightTheme, darkTheme, lightBar, darkBar, lightCloseBg, darkCloseBg, lightCloseFg, darkCloseFg;
    boolean dragable, closeable;

    public iPanel() {
        initComponents();

        lightTheme = new Color(239,237,233);
        darkTheme = new Color(36, 36, 36);

        lightBar = new Color(188, 184, 181);
        darkBar = new Color(104, 104, 104);

        lightCloseBg = new Color(226, 221, 220, 200);
        darkCloseBg = new Color(63, 63, 63, 127);

        lightCloseFg = new Color(133, 129, 128);
        darkCloseFg = new Color(171, 171, 171);

        setArc(40);

        bar.setArc(5);

        close.setText("✖");
        close.setForeground(darkCloseFg);
        close.setBackground(darkCloseBg);
        
        closeable = true;
    }

    // <editor-fold defaultstate="collapsed" desc="Making the panel dragable (need to be fixed)">
    
    //    private Point dragStart;
    //    private Point initialLocation;
    
//    public void setDragable(boolean v) {
//        this.dragable = v;
//
//        if (dragable) {
//            bar.addMouseListener(new MouseAdapter() {
//
//                @Override
//                public void mousePressed(MouseEvent e) {
//                    dragStart = e.getLocationOnScreen();
//                    initialLocation = getLocation();
//                }
//
//                @Override
//                public void mouseReleased(MouseEvent e) {
//                    dragStart = null;
//                    initialLocation = null;
//                }
//            });
//
//            bar.addMouseMotionListener(new MouseMotionAdapter() {
//                @Override
//                public void mouseDragged(MouseEvent e) {
//                    if (dragStart != null && initialLocation != null) {
//                        Point currentPos = e.getLocationOnScreen();
//                        int offsetX = currentPos.x - dragStart.x;
//                        int offsetY = currentPos.y - dragStart.y;
//
//                        setLocation(
//                                initialLocation.x + offsetX,
//                                initialLocation.y + offsetY
//                        );
//
//                        dragStart = currentPos;
//                    }
//                }
//            });
//        } else {
//            // Remove the mouse listeners if dragable is set to false
//            for (MouseListener listener : bar.getMouseListeners()) {
//                bar.removeMouseListener(listener);
//            }
//            for (MouseMotionListener listener : bar.getMouseMotionListeners()) {
//                bar.removeMouseMotionListener(listener);
//            }
//        }
//    }
    // </editor-fold>
    
    public void setTheme(int t) {
        if (t == 0) {
            setBackground(darkTheme);
            bar.setBackground(darkBar);
            close.setForeground(darkCloseFg);
            close.setBackground(darkCloseBg);
        } else if (t == 1) {
            setBackground(lightTheme);
            bar.setBackground(lightBar);
            close.setForeground(lightCloseFg);
            close.setBackground(lightCloseBg);
        }
    }
    
    public void setCloseable(boolean v) {
        this.closeable = v;
        close.setVisible(this.closeable);
    }
    
    public boolean getCloseable() {
        return this.closeable;
    }

    public void onClose(ActionListener l) {
        close.addActionListener(l);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bar = new Component.Panel.Panel();
        close = new Component.Button.Button();

        bar.setBackground(new java.awt.Color(104, 104, 104));
        bar.setPreferredSize(new java.awt.Dimension(27, 4));

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        close.setBackground(new java.awt.Color(63, 63, 63));
        close.setArc(50);
        close.setPreferredSize(new java.awt.Dimension(27, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Panel.Panel bar;
    private Component.Button.Button close;
    // End of variables declaration//GEN-END:variables
}
