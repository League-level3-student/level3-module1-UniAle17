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
	Stack<String> guessWords;
	
	int numLives = 15;
	int numDashes;
	
	HangMan(){
		
		frame.add(panel);
		panel.add(label);
		panel.add(lives);
		lives.setText("Lives " + numLives);
		
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
		
		guessWords = new Stack<String>();
		
		
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
			
			
		numDashes = recentWord.length();
		
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
	
	
	void resetGame(){
		
		displayedWord= "";
		
		recentWord = guessWords.pop();
		
		for (int i = 0; i < numDashes; i++) {
			
			
			displayedWord+="_";
		
			
		}
	
		label.setText(displayedWord);
		
		frame.pack();
		
		numLives=15;
		
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
				
				
				
			}
			
			
			
			
		}
		
		if(letter==false) {

		numLives = numLives-1;
		
		}
		
		 displayedWord = word;
		 
		 if(displayedWord.equals(recentWord)) {
				
				resetGame();
				
				
			}
		 
		 label.setText(displayedWord);
		 
		 lives.setText("Lives "+ numLives);
		 
		 
		 if(numLives<1) {
			 
			 JOptionPane.showMessageDialog(null, "Aw Man! You ran out of lives. The word was " + recentWord);			 
			 
		 }
		 
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
