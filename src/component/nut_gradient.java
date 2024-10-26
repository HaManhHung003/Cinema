package component;

import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;

public class nut_gradient extends JButton{
	private GradientPaint gradient;

    public nut_gradient(String text, GradientPaint gradient) {
        super(text);
        this.gradient = gradient;
        setContentAreaFilled(false); // Disable default button fill
        setBorderPainted(false);     // Disable default border painting
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (gradient != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setPaint(gradient);
            g2d.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 0, 0)); // Rounded corners
        }
        super.paintComponent(g);
    }
    
    public void setGradient(GradientPaint newGradient) {
	    this.gradient = newGradient;
	}
}
