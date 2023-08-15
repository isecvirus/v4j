/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component.Button;

import Component.Panel.Panel;
import Icon.ClickableIcon;
import java.awt.Color;

/**
 *
 * @author virus
 */
import javax.swing.*;
import java.awt.*;

public class Rate extends JPanel {
    private Color accent = new Color(252, 193, 8);
    private int iconSize = 10;

    private ClickableIcon star1;
    private ClickableIcon star2;
    private ClickableIcon star3;
    private ClickableIcon star4;
    private ClickableIcon star5;

    public Rate() {
        setBackground(new Color(0, 0, 0, 0));

        setup();
    }

    public Rate(Color accent, int size) {
        this.accent = accent;
        this.iconSize = size;

        setBackground(new Color(0, 0, 0, 0));

        setup();
    }

    public Rate(Color accent) {
        this.accent = accent;

        setBackground(new Color(0, 0, 0, 0));

        setup();
    }

    public Rate(int size) {
        this.iconSize = size;

        setBackground(new Color(0, 0, 0, 0));

        setup();
    }

    public void setup() {
        star1 = new ClickableIcon(getIconSize(), Color.gray, accent);
        star2 = new ClickableIcon(getIconSize(), Color.gray, accent);
        star3 = new ClickableIcon(getIconSize(), Color.gray, accent);
        star4 = new ClickableIcon(getIconSize(), Color.gray, accent);
        star5 = new ClickableIcon(getIconSize(), Color.gray, accent);

        star1.setIcon(ClickableIcon.ICON.STAR);
        star2.setIcon(ClickableIcon.ICON.STAR);
        star3.setIcon(ClickableIcon.ICON.STAR);
        star4.setIcon(ClickableIcon.ICON.STAR);
        star5.setIcon(ClickableIcon.ICON.STAR);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);

//        layout.setAutoCreateGaps(true);
//        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(star1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(star2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(star3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(star4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(star5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(star1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(star2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(star3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(star4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(star5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }

    public Color getAccent() {
        return accent;
    }

    public void setAccent(Color accent) {
        this.accent = accent;

        star1.setClickedColor(getAccent());
        star2.setClickedColor(getAccent());
        star3.setClickedColor(getAccent());
        star4.setClickedColor(getAccent());
        star5.setClickedColor(getAccent());
    }

    public void setIconSize(int s) {
        star1.setIconSize(s);
        star2.setIconSize(s);
        star3.setIconSize(s);
        star4.setIconSize(s);
        star5.setIconSize(s);

        revalidate(); // Trigger layout recalculation
    }

    public int getIconSize() {
        return iconSize;
    }
}