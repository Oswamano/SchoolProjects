package example1;

import static example1.ITerrariumConstants.SKY_LOCATION;
import static example1.ITerrariumConstants.SKY_SIZE;
import static example1.ITerrariumConstants.SOIL_LOCATION;
import static example1.ITerrariumConstants.WORLD_SIZE;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cse115.graphics.DrawingCanvas;
import cse115.graphics.Rectangle;

public class TerrariumParent {
	
	public static boolean TOP_LEVEL = true;

	private DrawingCanvas _tank;
	private Rectangle _sky;
	private Rectangle _soil;
	private JPanel _window;
	
	public TerrariumParent() {		
		_tank = new DrawingCanvas();
		_tank.setPreferredSize(WORLD_SIZE);
		_tank.setBackground(java.awt.Color.RED);
		_sky = new Rectangle();
		_sky.setDimension(SKY_SIZE);
		_sky.setColor(java.awt.Color.CYAN);
		_sky.setLocation(SKY_LOCATION);
		_soil = new Rectangle();
		_soil.setDimension(SKY_SIZE);
		_soil.setColor(new java.awt.Color(170, 70, 20));
		_soil.setLocation(SOIL_LOCATION);
		_tank.add(_sky);
		_tank.add(_soil);
		_window = new JPanel();
		_window.setLayout(new BorderLayout());
		_window.add(_tank, BorderLayout.CENTER);
		if (TOP_LEVEL) {
			JFrame frame = new JFrame();
			frame.getContentPane().setLayout(new BorderLayout());
			frame.getContentPane().add(_window, BorderLayout.CENTER);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
	}

	public void addCritter(Ant ant){
		_tank.add(ant);
		ant.setLocation(SOIL_LOCATION);
	}

	public void addCritter(Caterpillar caterpillar){
		_tank.add(caterpillar);
		int xLocation = SKY_LOCATION.x;
		int yLocation = SKY_LOCATION.y+SKY_SIZE.height-caterpillar.getDimension().height;
		caterpillar.setLocation(new java.awt.Point(xLocation,yLocation));
	}

	public void addCritter(Butterfly butterfly){
		_tank.add(butterfly);
		int xLocation = SKY_LOCATION.x+SKY_SIZE.width/2;
		int yLocation = SKY_LOCATION.y+SKY_SIZE.height/2;
		butterfly.setLocation(new java.awt.Point(xLocation,yLocation));
	}
}