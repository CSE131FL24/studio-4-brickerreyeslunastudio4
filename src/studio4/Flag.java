package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle( (0.5), (0.5), (0.5), (0.5));
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.filledRectangle( (0.5), (0.5), (0.4), (0.4));	
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledRectangle( (0.5), (0.5), (0.3), (0.3));	
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.filledRectangle( (0.5), (0.5), (0.2), (0.2));	
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle( (0.5), (0.5), (0.1), (0.1));
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.line(0.0, 0.0, 1.0, 1.0);
        StdDraw.line(1.0, 0.0, 0.0, 1.0);
  
        StdDraw.setPenColor(StdDraw.PINK);
		for (double i=1; i<=10; i++) {
			StdDraw.point(0.1+(i/10), 0.1);
			StdDraw.point(0.9, 0.9-(i/10));
			StdDraw.point(0.1, 0.1+(i/10));
			StdDraw.point(0.9-(i/10), 0.9);
		}
		
	}
}