package Player;

import Component.Panel.PanelBorder;
import java.awt.Color;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author virus
 */
public class Song extends PanelBorder {
    
    private boolean isFav;
    
    public Song() {
        initComponents();
        IconFontSwing.register(FontAwesome.getIconFont());

        playBtn.setIcon(IconFontSwing.buildIcon(FontAwesome.PLAY, 20, new Color(255, 253, 252)));

        setArc(25);
        setStroke(1);
        setColor(playBtn.getBackground());
        setOpaque(false);

        setBackground(new Color(0, 0, 0, 0));

        favBtn.setBackground(new Color(0, 0, 0, 0));        
        favBtn.setIcon(IconFontSwing.buildIcon(FontAwesome.HEART_O, 15, new Color(232, 55, 87)));
        
        favBtn.addActionListener(l->{
            if (getFavorite() == true) {
                favBtn.setIcon(IconFontSwing.buildIcon(FontAwesome.HEART_O, 15, new Color(232, 55, 87)));
                setFavorite(false);
            } else {
                favBtn.setIcon(IconFontSwing.buildIcon(FontAwesome.HEART, 15, new Color(232, 55, 87)));
                setFavorite(true);
            }
        });
    }
    
    public void setFavorite(boolean v) {
        this.isFav = v;
    }
    
    public boolean getFavorite() {
        return this.isFav;
    }
    

    public void setSong(String a) {
        song.setText(a);
    }
    
    public void setAlbum(String a) {
        album.setText(a);
    }
    
    public void setAccent(Color c) {
        setColor(c); // setting the border color
        playBtn.setBackground(c);
        song.setForeground(c);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playBtn = new Component.Button.Button();
        song = new javax.swing.JLabel();
        album = new javax.swing.JLabel();
        favBtn = new Component.Button.Button();

        setArc(10);

        playBtn.setBackground(new java.awt.Color(10, 38, 49));
        playBtn.setText(" ");
        playBtn.setArc(50);
        playBtn.setFocusable(false);
        playBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        song.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        song.setForeground(new java.awt.Color(15, 42, 50));
        song.setText("Artist");
        song.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        album.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        album.setForeground(new java.awt.Color(138, 154, 167));
        album.setText("Album");

        favBtn.setArc(100);
        favBtn.setBorderPainted(false);
        favBtn.setFocusPainted(false);
        favBtn.setFocusable(false);
        favBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        favBtn.setIconTextGap(0);
        favBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(album)
                    .addComponent(song))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(favBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(song, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(album))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(favBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel album;
    private Component.Button.Button favBtn;
    private Component.Button.Button playBtn;
    private javax.swing.JLabel song;
    // End of variables declaration//GEN-END:variables
}
