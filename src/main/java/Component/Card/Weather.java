package Component.Card;

import Component.Panel.Panel;
import java.awt.Color;
import javax.swing.Icon;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author virus
 */
public class Weather extends Panel {
    
    int degree, low, high;
    
    public Weather() {
        initComponents();
        IconFontSwing.register(FontAwesome.getIconFont());
        
        degree = 74;
        low = 87;
        high = 57;

        setArc(35);
        setGradient(new Color(11, 72, 133), new Color(98, 138, 173));

        locationIcon.setIcon(IconFontSwing.buildIcon(FontAwesome.LOCATION_ARROW, 10, new Color(251, 255, 255)));
        weatherIcon.setIcon(IconFontSwing.buildIcon(FontAwesome.SUN_O, 13, new Color(254, 202, 10)));
        
        location.setText("Earth");
    }
    
    // place is the setter/getter for location
    public void setPlace(String l) {
        location.setText(l);
    }
    
    public String getPlace() {
        return location.getText();
    }
    
    public void setDegree(int d) {
        degree = d;
        
        degreeLabel.setText(String.valueOf(degree) + "°");
    }
    
    public int getDegree() {
        return degree;
    }
    
    public void setWeatherIcon(Icon i) {
        weatherIcon.setIcon(i);
    }    
    
    public void setWeather(String w) {
        weatherName.setText(w);
    }
    
    public void setLow(int l) {
        low = l;
        weatherHnL.setText(String.format("H:%s° L:%s°", high, low));
    }
    
    public int getLow() {
        return this.low;
    }
    
    public void setHigh(int h) {
        high = h;
        weatherHnL.setText(String.format("H:%s° L:%s°", high, low));
    }
    
    public int getHigh() {
        return this.high;
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        location = new javax.swing.JLabel();
        locationIcon = new javax.swing.JLabel();
        degreeLabel = new javax.swing.JLabel();
        weatherIcon = new javax.swing.JLabel();
        weatherName = new javax.swing.JLabel();
        weatherHnL = new javax.swing.JLabel();

        location.setForeground(new java.awt.Color(236, 245, 255));
        location.setText("Earth");

        degreeLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        degreeLabel.setForeground(new java.awt.Color(236, 245, 255));
        degreeLabel.setText("74°");

        weatherName.setForeground(new java.awt.Color(236, 245, 255));
        weatherName.setText("Sunny");

        weatherHnL.setForeground(new java.awt.Color(236, 245, 255));
        weatherHnL.setText("H:87° L:57°");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(location)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locationIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weatherHnL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(weatherName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(weatherIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degreeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(degreeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(weatherIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(weatherName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weatherHnL)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel degreeLabel;
    private javax.swing.JLabel location;
    private javax.swing.JLabel locationIcon;
    private javax.swing.JLabel weatherHnL;
    private javax.swing.JLabel weatherIcon;
    private javax.swing.JLabel weatherName;
    // End of variables declaration//GEN-END:variables
}
