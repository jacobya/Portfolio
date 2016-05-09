/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paintpkg;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.swing.*;
import javax.swing.event.ChangeEvent;

import java.awt.event.*;
import java.awt.image.BufferedImage;

/**
 *
 * @author Adam Jacoby
 */

public class ButtonPanel extends JPanel implements ActionListener {

    public static int bChoose = 0;
	public static ButtonPanel inst;
	public static Color newColor;
    private String cmdButton;
    private JButton clrButton;

    ButtonPanel()
    {
        setBackground(Color.GRAY);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(60, 50));
        
        penButton();
        clearButton();
        lineButton();
        rectButton();
        filledRectButton();
        ovalButton();
        filledOvalButton();
        colorButton();
        //slider();

    }
     public static ButtonPanel getInstance()
    {
        if(inst == null)
           inst =  new ButtonPanel();
        return inst;
    }

     public void actionPerformed(ActionEvent ae)
     {
         System.out.println(ae.getActionCommand());
         cmdButton = ae.getActionCommand();
         if(cmdButton == "Line"){
        	 bChoose = 1;
         }
         else if(cmdButton == "Rectangle"){
        	 bChoose = 2;
         }
         else if(cmdButton == "Oval"){
        	 bChoose = 3;
         }
         else if(cmdButton == "Filled Oval"){
        	 bChoose = 4;
         }
         else if(cmdButton == "Filled Rectangle"){
        	 bChoose = 5;
         }
         else if(cmdButton == "Clear"){
        	 MousePanel.getInstance().grid = null;
        	 MousePanel.getInstance().repaint();
         }
         else if(cmdButton == "Color"){
        	 newColor = JColorChooser.showDialog(this, "Choose a Color", newColor);
         }
         else if(cmdButton == "Pen"){
        	 bChoose = 6;
         }
         
     }
     public void filledOvalButton(){
    	 
    	 setSize(90, 10);
    	 BufferedImage buf = new BufferedImage(60, 10, 2);
    	 Graphics2D gc = buf.createGraphics();
    	 
    	 gc.setColor(Color.BLACK);
    	 gc.fillOval(10, 1, 50, 8);
    	 ImageIcon ii = new ImageIcon(buf);
    	 
    	 JButton name = new JButton("Filled Oval", ii);
    	 name.setToolTipText("Filled Oval");
    	 name.addActionListener(this);
    	 add(name);
    	 setVisible(true);
    			
    	 } 
public void ovalButton(){
    	 
    	 setSize(90, 10);
    	 BufferedImage buf = new BufferedImage(60, 10, 2);
    	 Graphics2D gc = buf.createGraphics();
    	 
    	 gc.setColor(Color.BLACK);
    	 gc.drawOval(10, 1, 50, 8);
    	 ImageIcon ii = new ImageIcon(buf);
    	 
    	 JButton name = new JButton("Oval", ii);
    	 name.setToolTipText("Oval");
    	 name.addActionListener(this);
    	 add(name);
    	 setVisible(true);
    			
    	 } 

public void rectButton(){
	 
	 setSize(90, 10);
	 BufferedImage buf = new BufferedImage(60, 10, 2);
	 Graphics2D gc = buf.createGraphics();
	 
	 gc.setColor(Color.BLACK);
	 gc.drawRect(15, 1, 40, 8);
	 ImageIcon ii = new ImageIcon(buf);
	 
	 JButton name = new JButton("Rectangle", ii);
	 name.setToolTipText("Rectangle");
	 name.addActionListener(this);
	 add(name);
	 setVisible(true);
			
	 } 

public void filledRectButton(){
	 
	 setSize(90, 10);
	 BufferedImage buf = new BufferedImage(60, 10, 2);
	 Graphics2D gc = buf.createGraphics();
	 
	 gc.setColor(Color.BLACK);
	 gc.fillRect(15, 1, 40, 8);
	 ImageIcon ii = new ImageIcon(buf);
	 
	 JButton name = new JButton("Filled Rectangle", ii);
	 name.setToolTipText("Filled Rectangle");
	 name.addActionListener(this);
	 add(name);
	 setVisible(true);
			
	 } 
     
public void lineButton(){
	 
	 setSize(90, 10);
	 BufferedImage buf = new BufferedImage(60, 10, 2);
	 Graphics2D gc = buf.createGraphics();
	 
	 gc.setColor(Color.BLACK);
	 gc.drawLine(15, 5, 50, 5);
	 ImageIcon ii = new ImageIcon(buf);
	 
	 JButton name = new JButton("Line", ii);
	 name.setToolTipText("Line");
	 name.addActionListener(this);
	 add(name);
	 setVisible(true);
			
	 } 

public void clearButton(){
	setSize(90,10);
	BufferedImage buf = new BufferedImage(60, 10, 2);
	Graphics2D gc = buf.createGraphics();
	
	gc.setColor(Color.BLACK);
	gc.drawString("Clear", 20, 10);
	ImageIcon ii = new ImageIcon(buf);
	
	JButton name = new JButton("Clear", ii);
	name.setToolTipText("Clear");
	name.addActionListener(this);
	add(name);
	setVisible(true);
}

public void colorButton(){
	setSize(90,10);
	BufferedImage buf = new BufferedImage(60, 10, 2);
	Graphics2D gc = buf.createGraphics();
	
	gc.setColor(Color.BLACK);
	gc.drawString("Color", 20, 10);
	ImageIcon ii = new ImageIcon(buf);
	
	JButton name = new JButton("Color", ii);
	name.setToolTipText("Color");
	name.addActionListener(this);
	add(name);
	setVisible(true);
}

public void strokeButton(){
	setSize(90,10);
	BufferedImage buf = new BufferedImage(60, 10, 2);
	Graphics2D gc = buf.createGraphics();
	
	gc.setColor(Color.BLACK);
	gc.drawString("Stroke", 20, 10);
	ImageIcon ii = new ImageIcon(buf);
	
	JButton name = new JButton("Stroke", ii);
	name.setToolTipText("Stroke");
	name.addActionListener(this);
	add(name);
	setVisible(true);
}

public void penButton(){
	setSize(90,10);
	BufferedImage buf = new BufferedImage(60, 10, 2);
	Graphics2D gc = buf.createGraphics();
	
	gc.setColor(Color.BLACK);
	gc.drawString("Pen", 20, 10);
	ImageIcon ii = new ImageIcon(buf);
	
	JButton name = new JButton("Pen", ii);
	name.setToolTipText("Pen");
	name.addActionListener(this);
	add(name);
	setVisible(true);
}
/*
public void slider(){
	JLabel sliderLabel = new JLabel("Stroke", JLabel.CENTER);
    sliderLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    
    JSlider strokeWidth = new JSlider(1,50,1);
    //strokeWidth.setMajorTickSpacing(10);
    //strokeWidth.setMinorTickSpacing(1);
    //strokeWidth.setPaintTicks(true);
    //strokeWidth.setPaintLabels(true);
    //strokeWidth.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
    
}
public void stateChanged(ChangeEvent e) {
    JSlider source = (JSlider)e.getSource();
    if (!source.getValueIsAdjusting()) {
           
    }
}
*/
}



