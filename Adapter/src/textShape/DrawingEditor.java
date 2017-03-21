package textShape;

public class DrawingEditor {

	public static void main(String[] args) {
				
		final Shape textshape = new TextShape();
//		final Shape textshape = new TextShape(new TextView());
		
		Point[] boundingBox = textshape.boundingBox();
		
		String tsData = "TextShape data:\n";
		tsData += " bottomleft x = " + boundingBox[0].x;
		tsData += ", bottomleft y = " + boundingBox[0].y;
		tsData += ", topright x = " + boundingBox[1].x;
		tsData += ", topright y = " + boundingBox[1].y;
		
		System.out.println(tsData);
	}
}