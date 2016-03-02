package memory;

import java.awt.*;
import java.util.*;

import javax.swing.*;



import memory.LabelListener;

import memory.Card;

public class Game implements Runnable {
	public static Card c1;
	public static int state = 0;
	public static Card c2;
	public static Card c3;
	public static Card c4;
	public static Card c5;
	public static Card c6;
	public static Card c7;
	public static Card c8;
	public static Card c9;
	public static Card c10;
	public static Card c11;
	public static Card c12;
	public static Card c13;
	public static Card c14;
	public static Card c15;
	public static Card c16;
	public static ArrayList<String> fore;
	public static ArrayList<String> back;
	public static ArrayList<Card> deck;
	public static ArrayList<Card> tempdeck = new ArrayList<Card>();
	public static Card _c;
	
	public static int  matches = 0;
	public static int numflips=0;
	public static long time1 =0;
	public static long time2 =0;
	public static long timef =0;
	
	@Override public void run() {
	
		 deck = new ArrayList<Card>() ;
		 fore= new ArrayList<String>();
			back= new ArrayList<String>();
			 fore.add("Images/F01.png");
			 fore.add("Images/F02.png");
			 fore.add("Images/F03.png");
			 fore.add("Images/F04.png");
			 fore.add("Images/F05.png");
			 fore.add("Images/F06.png");
			 fore.add("Images/F07.png");
			 fore.add("Images/F08.png");
			 fore.add("Images/F09.png");
			 fore.add("Images/F10.png");
			 fore.add("Images/F11.png");
			 fore.add("Images/F12.png");
			 fore.add("Images/F13.png");
			 fore.add("Images/F14.png");
			 fore.add("Images/F15.png");
			 fore.add("Images/F16.png");
			 fore.add("Images/F17.png");
			 fore.add("Images/F18.png");
			 fore.add("Images/F19.png");
			 fore.add("Images/F20.png");
			 fore.add("Images/F21.png");
			 fore.add("Images/F22.png");
			 Collections.shuffle(fore);
			 back.add("Images/B01.png");
			 back.add("Images/B02.png");
			 back.add("Images/B03.png");
			 Collections.shuffle(back);
		 
		c1 = new Card(1);
		c2 = new Card(1);
		c3 = new Card(2);
		c4 = new Card(2);
		c5 = new Card(3);
		c6 = new Card(3);
		c7 = new Card(4);
		c8 = new Card(4);
		c9 = new Card(5);
		c10 = new Card(5);
		c11 = new Card(6);
		c12 = new Card(6);
		c13 = new Card(7);
		c14 = new Card(7);
		c15 = new Card(8);
		c16 = new Card(8);
		_c = new Card(1);
		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c7);
		deck.add(c8);
		deck.add(c9);
		deck.add(c10);
		deck.add(c11);
		deck.add(c12);
		deck.add(c13);
		deck.add(c14);
		deck.add(c15);
		deck.add(c16);
		 Collections.shuffle(deck);
		JFrame frame = new JFrame("SP13-CSE115-Lab8-Memory Game");
		GridLayout grid = new GridLayout(4,4);
		frame.setLayout(grid);
		
		c1.setIcon(memory.Card.Back);
		c2.setIcon(memory.Card.Back);
		c3.setIcon(memory.Card.Back);
		c4.setIcon(memory.Card.Back);
		c5.setIcon(memory.Card.Back);
		c6.setIcon(memory.Card.Back);
		c7.setIcon(memory.Card.Back);
		c8.setIcon(memory.Card.Back);
		c9.setIcon(memory.Card.Back);
		c10.setIcon(memory.Card.Back);
		c11.setIcon(memory.Card.Back);
		c12.setIcon(memory.Card.Back);
		c13.setIcon(memory.Card.Back);
		c14.setIcon(memory.Card.Back);
		c15.setIcon(memory.Card.Back);
		c16.setIcon(memory.Card.Back);
		frame.add(deck.get(0));
		frame.add(deck.get(1));
		frame.add(deck.get(2));
		frame.add(deck.get(3));
		frame.add(deck.get(4));
		frame.add(deck.get(5));
		frame.add(deck.get(6));
		frame.add(deck.get(7));
		frame.add(deck.get(8));
		frame.add(deck.get(9));
		frame.add(deck.get(10));
		frame.add(deck.get(11));
		frame.add(deck.get(12));
		frame.add(deck.get(13));
		frame.add(deck.get(14));
		frame.add(deck.get(15));
		
		
		
		
		LabelListener l1 = new LabelListener(c1);
		c1.addMouseListener(l1);
		LabelListener l2 = new LabelListener(c2);
		c2.addMouseListener(l2);
		LabelListener l3 = new LabelListener(c3);
		c3.addMouseListener(l3);
		LabelListener l4 = new LabelListener(c4);
		c4.addMouseListener(l4);
		LabelListener l5 = new LabelListener(c5);
		c5.addMouseListener(l5);
		LabelListener l6 = new LabelListener(c6);
		c6.addMouseListener(l6);
		LabelListener l7 = new LabelListener(c7);
		c7.addMouseListener(l7);
		LabelListener l8 = new LabelListener(c8);
		c8.addMouseListener(l8);
		LabelListener l9 = new LabelListener(c9);
		c9.addMouseListener(l9);
		LabelListener l10 = new LabelListener(c10);
		c10.addMouseListener(l10);
		LabelListener l11 = new LabelListener(c11);
		c11.addMouseListener(l11);
		LabelListener l12 = new LabelListener(c12);
		c12.addMouseListener(l12);
		LabelListener l13 = new LabelListener(c13);
		c13.addMouseListener(l13);
		LabelListener l14 = new LabelListener(c14);
		c14.addMouseListener(l14);
		LabelListener l15 = new LabelListener(c15);
		c15.addMouseListener(l15);
		LabelListener l16 = new LabelListener(c16);
		c16.addMouseListener(l16);
		
		
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void State(Card c){
	
		_c=c;
		c=_c;
	
	if (c.getIcon()==null){
		return;
	}
		if(state==0){
		 if (numflips==0){
		state = 1;
		tempdeck.add(_c);
		numflips++;
		time1 = (System.currentTimeMillis())/1000;
		
		 }
		 else if (numflips!=0){
			 state = 1;
			tempdeck.add(_c);
		 }
	}
	else if(state == 1){
		state = 2;
		tempdeck.add(_c);
		
		
	}
	else if (state ==2){
		if(tempdeck.get(0).pair != tempdeck.get(1).pair){
		state = 0;
		tempdeck.get(0).setIcon(memory.Card.Back);
		tempdeck.remove(0);
		tempdeck.get(0).setIcon(memory.Card.Back);
		tempdeck.remove(0);
		_c.setIcon(memory.Card.Back);
		
	}
		else if(tempdeck.get(0).pair == tempdeck.get(1).pair){
			if(tempdeck.get(0)==tempdeck.get(1)){
				state = 0;
				tempdeck.get(0).setIcon(memory.Card.Back);
				tempdeck.remove(0);
				tempdeck.get(0).setIcon(memory.Card.Back);
				tempdeck.remove(0);
				_c.setIcon(memory.Card.Back);
			
			}
			else if(tempdeck.get(0)!=tempdeck.get(1)){
			tempdeck.get(0).setIcon(null);
			tempdeck.get(1).setIcon(null);
			tempdeck.remove(0);
			tempdeck.remove(0);
			
			if(c.getIcon()==c.front){
				c.setIcon(memory.Card.Back);
			}
			
			state=0;
			matches++;
			System.out.println("matches"+ matches);
		}
			
		}
	}
	if (matches>=8){
		time2 = (System.currentTimeMillis())/1000;
		timef = time2-time1;
		System.out.println("You took:"+timef+"seconds");
		System.exit(0);
		
	}
		
		
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Game());
	}
}