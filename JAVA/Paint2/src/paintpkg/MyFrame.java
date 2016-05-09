

package paintpkg;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Hunter Lloyd
 */
public class MyFrame extends JFrame implements ActionListener, ChangeListener {

     public static MyFrame inst;
     JSlider strokeWidth;
     JLabel label;

    MyFrame( )
    {
        super("MainFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);
        
        JMenu editMenu = new JMenu("Edit");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(editMenu);
        
        JMenu helpMenu = new JMenu("Help");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(helpMenu);
        
        JMenuItem save = new JMenuItem("Save", KeyEvent.VK_N);
        fileMenu.add(save);
        
        JMenuItem about = new JMenuItem("About", KeyEvent.VK_N);
        helpMenu.add(about);
        
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	JOptionPane.showMessageDialog(null, "Created and Ruined by: Adam Jacoby");
            	
            }
        });

        setJMenuBar(menuBar);
        setSize(350, 250);
        setVisible(true);
        
        Container c = getContentPane();
        c.add(ButtonPanel.getInstance(), BorderLayout.WEST);
        getContentPane().add(MousePanel.getInstance(), BorderLayout.CENTER);
        
        setSize(500, 500);
        setVisible(true);
        
        label = new JLabel("Stroke", JLabel.CENTER);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        strokeWidth = new JSlider(1,50,1);
        strokeWidth.addChangeListener(this);
        c.add(strokeWidth);
        c.add(label);
        
    }
    public static MyFrame getInstance()
    {
        if(inst == null)
           inst = new MyFrame();
       
         return inst;
    }
	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public void slider(){
		JLabel sliderLabel = new JLabel("Stroke", JLabel.CENTER);
		sliderLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        
        
	}
	
	public void stateChanged(ChangeEvent ce){
		  int value = strokeWidth.getValue();
		  String str = Integer.toString(value);
		  //label.setText(str);
		  }

}
