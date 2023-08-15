/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cursor;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MouseCursor {

    private int rotation = 45;
    private Component component;
    private MouseShape shape;
    private String text = "";
    private Color color = Color.white;

    public enum MouseShape {
        DEFAULT,
        CIRCLE,
        SQUARE,
        TRIANGLE,
        LINE,
        ARROW,
        TEXT
    }

    public MouseCursor(Component component) {
        this.component = component;
        this.shape = MouseShape.DEFAULT;
        updateCursor();
    }

    public void setMouse(MouseShape shape) {
        this.shape = shape;
        updateCursor();
    }

    private void updateCursor() {
        Cursor cursor;
        switch (shape) {
            case DEFAULT:
                cursor = Cursor.getDefaultCursor();
                break;
            case CIRCLE:
                cursor = createCircleCursor();
                break;
            case SQUARE:
                cursor = createSquareCursor();
                break;
            case TRIANGLE:
                cursor = createTriangleCursor();
                break;
            case LINE:
                cursor = createLineCursor();
                break;
            case ARROW:
                cursor = createArrowCursor();
                break;
            case TEXT:
                cursor = createTextCursor();
                break;
            default:
                cursor = Cursor.getDefaultCursor();
                break;
        }
        component.setCursor(cursor);
    }

    private Cursor createCircleCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.fillOval(0, 0, 32, 32);
        return toolkit.createCustomCursor(image, new Point(16, 16), "circle");
    }

    private Cursor createSquareCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.fillRect(0, 0, 32, 32);
        return toolkit.createCustomCursor(image, new Point(16, 16), "square");
    }

    private Cursor createTriangleCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int[] xPoints = {16, 0, 32};
        int[] yPoints = {0, 32, 32};
        g2d.fillPolygon(xPoints, yPoints, 3);
        return toolkit.createCustomCursor(image, new Point(16, 16), "triangle");
    }

    private Cursor createLineCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.rotate(Math.toRadians(rotation), 16, 16);
        g2d.drawLine(0, 16, 32, 16);
        return toolkit.createCustomCursor(image, new Point(0, 16), "line");
    }

    private Cursor createArrowCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.rotate(Math.toRadians(rotation), 16, 16);

        int[] xPoints = {0, 16, 0};
        int[] yPoints = {0, 16, 32};
        g2d.fillPolygon(xPoints, yPoints, 3);
        return toolkit.createCustomCursor(image, new Point(0, 0), "arrow");
    }

    private Cursor createTextCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = image.createGraphics();

        // Set background color to transparent
        g2d.setBackground(new Color(0, 0, 0, 0));
        g2d.clearRect(0, 0, image.getWidth(), image.getHeight());

        // Set text properties
        g2d.setColor(color);
        g2d.setFont(component.getFont());

        // Enable text antialiasing
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // Draw text
        int textWidth = g2d.getFontMetrics().stringWidth(text);
        int x = (image.getWidth() - textWidth) / 2;
        int y = image.getHeight() / 2;
        g2d.drawString(text, x, y);

        g2d.dispose(); // Dispose the Graphics2D object

        return toolkit.createCustomCursor(image, new Point(16, 16), "text");
    }

    public void setIcon(Image icon) {
        Cursor cursor = Cursor.getDefaultCursor();
        if (icon != null) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            cursor = toolkit.createCustomCursor(icon, new Point(16, 16), "icon");
        }
        component.setCursor(cursor);
    }

    public void setIcon(Icon icon) {
        Cursor cursor = Cursor.getDefaultCursor();
        if (icon != null) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            Image image = ((ImageIcon) icon).getImage();

            cursor = toolkit.createCustomCursor(image, new Point(16, 16), "icon");
        }
        component.setCursor(cursor);
    }

    public void setRotation(int r) {
        this.rotation = r;
    }

    public void setText(String t) {
        this.text = t;
        updateCursor();
    }

    public void setTextForeground(Color c) {
        this.color = c;
        updateCursor();
    }
}
