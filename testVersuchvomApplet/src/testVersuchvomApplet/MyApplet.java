package testVersuchvomApplet;

import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;

public class MyApplet extends Applet implements MouseListener{
	private ArrayList<String> Names = new ArrayList<>();
	private Choice NamesChoice = new Choice();
    public void paint(Graphics g) {
    	g.drawString("Hallo Ziad", 60, 60);
    }

	@Override
	public void init() {
		Names.add("ziad");
		Names.add("nadia");
		Names.add("katkout");
		for (int i = 0; i < Names.size(); ++i)
		NamesChoice.add(Names.get(i));
		add(NamesChoice);
	  addMouseListener(this);
	}
	
	 public void mouseReleased(MouseEvent e) 
	  { 
		// TODO Auto-generated method stub
	  }
	@Override
	public void mouseClicked(MouseEvent e) {
		setBackground(Color.cyan);
			
		}

     @Override
	public void mousePressed(MouseEvent e) {
		
		 setBackground(Color.yellow);
	}

    @Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		setBackground(Color.red);	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		setBackground(Color.black);
	}
	

}
