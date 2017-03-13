package textShape;

public interface ShapeInt {
	
	public Point[] BoundingBox(Point bottomLeft, Point topRight); 
	
	public Manipulator createManipulator();
	
}
