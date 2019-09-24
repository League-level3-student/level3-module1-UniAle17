package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	
	
	Song s = new Song("demo.mp3");

	ArrayList<Song> randomSongs = new ArrayList<Song>();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	//Songs
	Song pretender = new Song ("Pretender.mp3");
	Song stronger = new Song("Stronger.mp3");
	Song games = new Song ("Let the Games Begin.mp3");
	Song want = new Song("I Want It That Way.mp3");
	Song hey = new Song("Hey Look Ma, I Made It.mp3");
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		
		frame.add(panel);
		panel.add(button);
		button.setText("Surprise Me!");
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		
		//s.play();
		
		randomSongs.add(pretender);
		randomSongs.add(stronger);
		randomSongs.add(games);
		randomSongs.add(want);
		randomSongs.add(hey);
		
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
		
		
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		if(e.getSource()==button) {
			
			for (int i = 0; i < randomSongs.size(); i++) {
				
				
				
				Song theSong = randomSongs.get(i);
				
				theSong.play();
				
				
				
			}
			
		}
		
	}
}