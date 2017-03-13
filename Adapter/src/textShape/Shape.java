package textShape;

public abstract class Shape {
	
	public Shape() {};
	
	public Point[] boundingBox() {
		return new Point[2];
	}
	
	public Manipulator createManipulator() {
		return new Manipulator();
	}

}
