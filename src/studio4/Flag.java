package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle (.5,.5,.46,.31);

				
		StdDraw.setPenColor(20,238,253);
		StdDraw.filledRectangle (.5,.5,.45,.3);
		
		
		StdDraw.setPenColor(0,0,0); 
		StdDraw.text (.5,.75,"Dov");
		StdDraw.text (.5,.25,"Schwartz");
		StdDraw.setPenColor(253,237,173); 
		StdDraw.filledEllipse(.5, .5, .12, .19);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledEllipse(.45, .55, .02, .01);
		StdDraw.filledEllipse(.55, .55, .02, .01);
		StdDraw.setPenColor(64,83,182);
		StdDraw.filledCircle(.45,.55 , .008);
		StdDraw.filledCircle(.55,.55 , .008);
		StdDraw.setPenColor(0,0,0); 
		StdDraw.arc(.5, .44,.05,  200.0, 340.0);
		double[] x = { 0.5, 0.52, 0.48  };
		   double[] y = { 0.5, 0.47, 0.47,};
		   StdDraw.polygon(x, y);


		
	}
}