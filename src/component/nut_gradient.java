package component;

import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;

public class nut_gradient extends JButton{
	private GradientPaint gradient;
	private int radius = 0;
	private String text;
    public nut_gradient(String text, GradientPaint gradient) {
        super(text);
        this.text = text;
        this.gradient = gradient;
        setContentAreaFilled(false); 
        setBorderPainted(false);     
    }
    
    public GradientPaint getRadiant() {
    	return gradient;
    }

    public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String getText() {
		return text;
	}


	@Override
    protected void paintComponent(Graphics g) {
        if (gradient != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setPaint(gradient);
            //g2d.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 0, 0));
            g2d.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        }
        super.paintComponent(g);
    }
    
    public void setGradient(GradientPaint newGradient) {
	    this.gradient = newGradient;
	}
}
