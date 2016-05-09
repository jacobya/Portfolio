/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paintpkg;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author Adam Jacoby
 */
public class MousePanel extends JPanel implements MouseListener{

	protected JColorChooser tcc;
	public static MousePanel inst;
    public int startX;
    public int startY;
    public int endX;
    public int endY;
    public int wide;
    public int tall;
    BufferedImage grid;
    Graphics2D gc;
    
    private int mousex = 0;
    private int mousey = 0;
    private int prevx = 0;
    private int prevy = 0;
    private boolean initialPen = true;
    
    
    MousePanel()
    {
        setBackground(Color.WHITE);
        startX = 0;
        startY = 0;
        endX = 0;
        endY = 0;
        addMouseListener(this);
        
        
    }
    public static MousePanel getInstance()
    {
        if(inst == null)
            inst =  new MousePanel();
         return inst;
        
    }

    public void paintComponent(Graphics g)
    {
        //System.out.println("called");
    	super.paintComponent(g);
    	Graphics2D g2 = (Graphics2D)g;
        if(grid == null){
        	int w = this.getWidth();
        	int h = this.getHeight();
        	grid = (BufferedImage)(this.createImage(w,h));
        	gc = grid.createGraphics();
        }
        g2.drawImage(grid, null, 0, 0);
        
    }
    
    public void mouseExited(MouseEvent e){ }
    public void mouseEntered(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){
    	startX = e.getX();
    	startY = e.getY();
    }
    public void mouseReleased(MouseEvent e){
    	
    	endX = e.getX();
    	endY = e.getY();
    	switch (ButtonPanel.bChoose){
        case 1: gc.setColor(ButtonPanel.newColor); gc.drawLine(startX, startY, endX, endY); repaint(); break;
        case 2: 
        	if(startX > endX){
        		wide = startX - endX;
        		startX = endX;
        		}
        	else if(startX < endX){
        		wide = endX - startX;
        	}
        	if(startY > endY){
        		tall = startY - endY;
        		startY = endY;
        	}
        	else if(startY < endY){
        		tall = endY - startY;
        	}
        	gc.setColor(ButtonPanel.newColor); gc.drawRect(startX, startY, wide, tall); repaint(); break;
        case 3: 
        	if(startX > endX){
        		wide = startX - endX;
        		startX = endX;
        		}
        	else if(startX < endX){
        		wide = endX - startX;
        	}
        	if(startY > endY){
        		tall = startY - endY;
        		startY = endY;
        	}
        	else if(startY < endY){
        		tall = endY - startY;
        	}
        	gc.setColor(ButtonPanel.newColor); gc.drawOval(startX, startY, wide, tall); repaint(); break;
        case 4: 
        	if(startX > endX){
        		wide = startX - endX;
        		startX = endX;
        		}
        	else if(startX < endX){
        		wide = endX - startX;
        	}
        	if(startY > endY){
        		tall = startY - endY;
        		startY = endY;
        	}
        	else if(startY < endY){
        		tall = endY - startY;
        	}
        	gc.setColor(ButtonPanel.newColor); gc.fillOval(startX, startY, wide, tall); repaint(); break;
        case 5: 
        	if(startX > endX){
        		wide = startX - endX;
        		startX = endX;
        		}
        	else if(startX < endX){
        		wide = endX - startX;
        	}
        	if(startY > endY){
        		tall = startY - endY;
        		startY = endY;
        	}
        	else if(startY < endY){
        		tall = endY - startY;
        	}
        	gc.setColor(ButtonPanel.newColor); gc.fillRect(startX, startY, wide, tall); repaint(); break;
        case 6: 
        	gc.setColor(ButtonPanel.newColor) ;
        	
        	
        default: gc.setColor(ButtonPanel.newColor); gc.drawLine(startX, startY, endX, endY); break;	
        }
    	
    }
    
}
        
      
	
		
	


