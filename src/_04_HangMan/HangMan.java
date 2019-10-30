package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class HangMan implements KeyListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label= new JLabel();
	JLabel lives = new JLabel();
	
	String recentWord;
	
	String displayedWord="";
	
	int numLives = 15;
	
	HangMan(){
		
		frame.add(panel);
		panel.add(label);
		panel.add(lives);
		
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
		
		Stack<String> guessWords = new Stack<String>();
		
		
		String words = JOptionPane.showInputDialog("Welcome to Hangman! "
		 		+ "How many words would you like to attempt?");
		
		int numWords = Integer.parseInt(words);
		
		if(numWords<267&&numWords>0) {
			
			
			
			for (int i = 0; i < numWords; i++) {
				
			String wordsToGuess = Utilities.readRandomLineFromFile("dictionary.txt");
				 if(guessWords.contains(wordsToGuess)) {
					 
					 i--;
					 
				 }
				 
				 else {
					 
			guessWords.push(wordsToGuess);
			
				 }
			}
			
			recentWord = guessWords.pop();
			
			
			int numDashes = recentWord.length();
		
			for (int i = 0; i < numDashes; i++) {
				
				
				displayedWord+="_";
			
				
			}
			
			label.setText(displayedWord);
			frame.pack();
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "Please input a number that is more than 0 and less than 267");
			
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		HangMan hmRunner = new HangMan();
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		String word = "";
		
		boolean letter = false;
		
		for (int i = 0; i < recentWord.length(); i++) {
			
			
			
			if(e.getKeyChar()==recentWord.charAt(i)) {
				
				word+=recentWord.charAt(i);
				
				letter = true;
				
			}
			else {
				
				word+=displayedWord.charAt(i);
				
				letter = false;
				
			}
			
			
		}
		
		if(letter=true) {

		numLives = numLives-1;
		
		}
		
		 displayedWord = word;
		 
		 label.setText(displayedWord);
		 
		 lives.setText("Lives "+ numLives);
		 

		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
