package lab6;

import java.util.ArrayList;

import javax.swing.*;;



public class Application implements Runnable {
	public static ArrayList<String> adj;
	public static ArrayList<String> noun;
	public static ArrayList<String> verb;
	public static ArrayList<String> adverb;
	public static String str1;
	public static String str2;
	public static String str3;
	public static String str4;
	public static String str5;
	
	public static JLabel a;
	public static JLabel b;
	public static JLabel c;
	public static JLabel d;
	public static JLabel e;
	public static JFrame _frame;
	@Override public void run() {
		adj = new ArrayList<String>();
		LineReader adjectiveReader = new LineReader("words/adjectives");
		 noun = new ArrayList<String>();
		LineReader nounReader = new LineReader("words/nouns");
		 verb = new ArrayList<String>();
		LineReader verbReader = new LineReader("words/verbs");
		adverb = new ArrayList<String>();
		LineReader adverbReader = new LineReader("words/adverbs");
		
		
			
		for( String s:nounReader){
			noun.add(s);
			}
		for( String s:adverbReader){
			adverb.add(s);
			}
		for( String s:adjectiveReader){
			adj.add(s);
			}
		for( String s:verbReader){
			verb.add(s);
			}
		
	
		
		
		 _frame = new JFrame("CSE115 - Lab 6 - Matt O'Connor");
		BoxLayout boxy =new BoxLayout(_frame.getContentPane(), BoxLayout.X_AXIS);
		_frame.setLayout(boxy);
		
		
		
		_frame.setVisible(true);
	  a = new JLabel("a");
	 b = new JLabel("b");
	 c = new JLabel("c");
	 d = new JLabel("d");
	 e = new JLabel("e");
	_frame.add(a);
	_frame.add(b);
	_frame.add(c);
	_frame.add(d);
	_frame.add(e);
	JButton button = new JButton("shuffle");
	_frame.add(button);
	_frame.setBackground(java.awt.Color.WHITE);
	
	EventHandler listener = new EventHandler(this);
	button.addActionListener(listener);
	a.setText(adj.get(0) + " ");
	b.setText(adj.get(1)+ " ");
	c.setText(noun.get(0)+ " ");
	d.setText(adverb.get(0)+ " ");
	e.setText(verb.get(0)+ " ");
	_frame.setVisible(true);
	
	_frame.pack();
	_frame.setVisible(true);
	
		
	}
	
	public static void shuffle(){
		java.util.Collections.shuffle(adj);	
		java.util.Collections.shuffle(noun);	
		java.util.Collections.shuffle(verb);	
		java.util.Collections.shuffle(adverb);	
		a.setText(adj.get(0) + " ");
		b.setText(adj.get(1)+ " ");
		c.setText(noun.get(0)+ " ");
		d.setText(adverb.get(0)+ " ");
		e.setText(verb.get(0)+ " ");
	
		
		
	}
	
	
	
	
	}
	
	

