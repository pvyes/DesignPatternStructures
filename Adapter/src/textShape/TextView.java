package textShape;


public class TextView {
	//default values
	private Coord x = new Coord(1), y = new Coord(0), width = new Coord(3), height = new Coord(2);
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
}
