package textShape;

/* In fact Coord are simple integers representing x and y  coordinates */
public class Coord {
	
	int c;
	
	public Coord(int c) {
		this.c = c;
	}
	
	public Coord add(Coord c) {
		return new Coord(this.c + c.c);
	}
	
	public String toString () {
		return Integer.toString(c);
	}

}
