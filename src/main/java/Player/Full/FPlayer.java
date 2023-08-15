package Player.Full;

import Component.Panel.Panel;
import Player.Song;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author virus
 */
public class FPlayer extends Panel {

    int total = 0;

    public FPlayer() {
        initComponents();
        IconFontSwing.register(FontAwesome.getIconFont());

        setArc(50);
        songInfo.setArc(50);

        songImage.setArc(60);
        backBtn.setIcon(IconFontSwing.buildIcon(FontAwesome.CHEVRON_LEFT, 15, Color.white)); // CHEVRON_LEFT
        menuBtn.setIcon(IconFontSwing.buildIcon(FontAwesome.BARS, 20, Color.white)); // CHEVRON_LEFT

        play.setBackground(new Color(238, 52, 91));
        play.setIcon(IconFontSwing.buildIcon(FontAwesome.PLAY, 13, new Color(255, 253, 252)));

        songsPanel.setBackground(new Color(0, 0, 0, 0));
        songsPanelParent.getViewport().setBackground(new Color(0, 0, 0, 0));
        songsPanelParent.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        songsPanelParent.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        songsPanelParent.setBorder(new EmptyBorder(0, 0, 0, 0));
        songsPanelParent.getVerticalScrollBar().setBlockIncrement(25);
        songsPanelParent.getVerticalScrollBar().setUnitIncrement(25);

        songsPanel.setLayout(new GridBagLayout());
    }

    public void setIcon(Image i) {
        Dimension ps = songImage.getPreferredSize();
        setIcon(i, ps.width, ps.height);
    }

    public void setIcon(Image i, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawImage(i, 0, 0, width, height, null);
        g2d.dispose();

        songImage.setBackgroundImage(resizedImage);
        songImage.setBackground(new Color(0, 0, 0, 0));
    }

    public void addSong(String name) {
        Song song = new Song();
        song.setSong(name);

        total += 1;

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = total - 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5; // Set weightx to 1.0 to make the component fill the width
        constraints.insets = new Insets(5, 0, 0, 0);

        songsPanel.add(song, constraints);
        songsPanel.repaint();
    }

    public void addSong(String name, String album) {
        Song song = new Song();
        song.setSong(name);
        song.setAlbum(album);

        total += 1;

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = total - 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5; // Set weightx to 1.0 to make the component fill the width
        constraints.insets = new Insets(5, 0, 0, 0);

        songsPanel.add(song, constraints);
        songsPanel.repaint();
    }

    public void addSong(String name, String album, boolean isFav) {
        Song song = new Song();
        song.setSong(name);
        song.setAlbum(album);
        song.setFavorite(isFav);

        total += 1;

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = total - 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5; // Set weightx to 1.0 to make the component fill the width
        constraints.insets = new Insets(5, 0, 0, 0);

        songsPanel.add(song, constraints);
        songsPanel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        songInfo = new Component.Panel.Panel();
        artistLabel = new javax.swing.JLabel();
        albumLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        menuBtn = new javax.swing.JLabel();
        songImage = new Component.Panel.Panel();
        playlistLabel = new javax.swing.JLabel();
        counterLabel = new javax.swing.JLabel();
        songsPanelParent = new javax.swing.JScrollPane();
        songsPanel = new javax.swing.JPanel();
        play = new Component.Button.Button();

        setBackground(new java.awt.Color(210, 217, 225));

        songInfo.setBackground(new java.awt.Color(210, 227, 237));

        artistLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        artistLabel.setForeground(new java.awt.Color(20, 36, 47));
        artistLabel.setText("Lovestruck");

        albumLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        albumLabel.setForeground(new java.awt.Color(137, 157, 173));
        albumLabel.setText("Jane Doe feat Dolor");

        javax.swing.GroupLayout songImageLayout = new javax.swing.GroupLayout(songImage);
        songImage.setLayout(songImageLayout);
        songImageLayout.setHorizontalGroup(
            songImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        songImageLayout.setVerticalGroup(
            songImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout songInfoLayout = new javax.swing.GroupLayout(songInfo);
        songInfo.setLayout(songInfoLayout);
        songInfoLayout.setHorizontalGroup(
            songInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songInfoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(songImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(songInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(artistLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(albumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        songInfoLayout.setVerticalGroup(
            songInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(songInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(songInfoLayout.createSequentialGroup()
                        .addGroup(songInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(artistLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(albumLabel))
                    .addComponent(songImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        playlistLabel.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        playlistLabel.setForeground(new java.awt.Color(10, 36, 51));
        playlistLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        playlistLabel.setText("Your Playlist");
        playlistLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        counterLabel.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        counterLabel.setForeground(new java.awt.Color(155, 167, 180));
        counterLabel.setText("34 song  •  125 min");

        songsPanelParent.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        songsPanelParent.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        songsPanelParent.setFocusable(false);
        songsPanelParent.setOpaque(false);
        songsPanelParent.setRequestFocusEnabled(false);

        songsPanel.setFocusable(false);
        songsPanel.setOpaque(false);
        songsPanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout songsPanelLayout = new javax.swing.GroupLayout(songsPanel);
        songsPanel.setLayout(songsPanelLayout);
        songsPanelLayout.setHorizontalGroup(
            songsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        songsPanelLayout.setVerticalGroup(
            songsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        songsPanelParent.setViewportView(songsPanel);

        play.setText(" ");
        play.setArc(50);
        play.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        play.setIconTextGap(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(songInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(counterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(playlistLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(107, 107, 107)
                        .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(songsPanelParent, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(songInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playlistLabel)
                    .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(counterLabel)
                .addGap(18, 18, 18)
                .addComponent(songsPanelParent, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel albumLabel;
    private javax.swing.JLabel artistLabel;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel counterLabel;
    private javax.swing.JLabel menuBtn;
    private Component.Button.Button play;
    private javax.swing.JLabel playlistLabel;
    private Component.Panel.Panel songImage;
    private Component.Panel.Panel songInfo;
    private javax.swing.JPanel songsPanel;
    private javax.swing.JScrollPane songsPanelParent;
    // End of variables declaration//GEN-END:variables
}
