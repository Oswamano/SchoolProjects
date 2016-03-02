package memory;
import java.util.ArrayList;

import javax.swing.*;
import java.util.*;
public class Card extends javax.swing.JLabel {
	/**
	 * 
	 */
	

	public static ImageIcon Back;
	public  ImageIcon front;
	public static int counter = 1;
	
	public int pair = 0;
	public Card(int p){
		pair = p;
	
	 Back = new ImageIcon(memory.Game.back.get(0));
		front = new ImageIcon(memory.Game.fore.get(pair));
		
		
	}
	
	
	
}

	

