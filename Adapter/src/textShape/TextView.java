package textShape;

import java.util.ArrayList;


public class TextView {
	//default values
	private Coord x = new Coord(1), y = new Coord(0), width = new Coord(3), height = new Coord(2);
	private String text;

	public TextView() {}
	
	public Coord[] getOrigin() {
		Coord[] origin = new Coord[2];
		origin[0] = x;
		origin[1] = y;
		return origin;
	}
	
	public Coord[] getExtent () {
		Coord[] extent = new Coord[2];
		extent[0] = width;
		extent[1] = height;
		return extent;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String uppercaseText() {
		return text.toUpperCase();
	}
}
