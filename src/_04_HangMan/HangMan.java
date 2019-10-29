package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label= new JLabel();
	
	HangMan(){
		
		frame.add(panel);
		panel.add(label);
		
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
		 JOptionPane.showInputDialog("Welcome to Hangman! "
		 		+ "How many words would you like to attempt?");
		
	}
	
	
	public static void main(String[] args) {
		
		HangMan hm = new HangMan();
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
