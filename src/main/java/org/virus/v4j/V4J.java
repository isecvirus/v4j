package org.virus.v4j;

import Component.Panel.Panel;
import Component.Panel.PanelBorder;
import Icon.ClickableIcon;
import Util.Dragable;
import Window.TransparentWindow;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author virus
 */
public class V4J {

    private static Color accent = new Color(252, 193, 8);

    public static void main(String[] args) {
        TransparentWindow tw = new TransparentWindow();
//        tw.maxSize();
        tw.setDefaultCloseOperation(TransparentWindow.EXIT_ON_CLOSE);

        tw.setAlwaysOnTop(true);

        Panel pb = new Panel();
        pb.setArc(20);
        pb.setBackground(new Color(0, 0, 0, 50));

        tw.addComp(pb);

        ClickableIcon star1 = new ClickableIcon(10, Color.gray, accent);
        star1.setIcon(ClickableIcon.ICON.STAR);
        
        ClickableIcon star2 = new ClickableIcon(10, Color.gray, accent);
        star2.setIcon(ClickableIcon.ICON.STAR);

        ClickableIcon star3 = new ClickableIcon(10, Color.gray, accent);
        star3.setIcon(ClickableIcon.ICON.STAR);

        ClickableIcon star4 = new ClickableIcon(10, Color.gray, accent);
        star4.setIcon(ClickableIcon.ICON.STAR);

        ClickableIcon star5 = new ClickableIcon(10, Color.gray, accent);
        star5.setIcon(ClickableIcon.ICON.STAR);

        pb.add(star1);
        pb.add(star2);
        pb.add(star3);
        pb.add(star4);
        pb.add(star5);

        new Dragable(pb, tw);

        tw.addCtrlBind("exit", KeyEvent.VK_W, () -> {
            tw.close();
        });
        tw.open();
    }
}
