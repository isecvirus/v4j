package Component.Panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import javax.swing.JPanel;

public class SemiCircle extends JPanel {

    private double radius = 50;
    private double rotation = 90;

    public SemiCircle() {
        setOpaque(false);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground()); // border color

        int width = getWidth();
        int height = getHeight();

        int x = (width - (int) getRadius() * 2) / 2;
        int y = (height - (int) getRadius() * 2) / 2;

        // Create a rotation transform
        AffineTransform rotationTransform = AffineTransform.getRotateInstance(
                Math.toRadians(getRotation()), x + getRadius(), y + getRadius());

        // Apply the rotation transform to the graphics context
        g2d.transform(rotationTransform);

        // Create the clipping shape
        Shape clippingShape = new Arc2D.Double(x, y, getRadius() * 2, getRadius() * 2, 0, 180, Arc2D.CHORD);

        // Set the clipping region
        g2d.setClip(clippingShape);

        // Draw the semicircle
        Shape semicircle = new Arc2D.Double(x, y, getRadius() * 2, getRadius() * 2, 0, 360, Arc2D.OPEN);
        g2d.fill(semicircle);

        // Reset the clipping region
        g2d.setClip(null);

        // Reset the transform to the identity transform
        g2d.setTransform(new AffineTransform());

        g2d.dispose();
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
        repaint(); // Redraw the component when the rotation changes
    }
}
