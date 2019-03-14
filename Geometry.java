import javax.swing.*;
import java.lang.Math;
public class Geometry
{
	
	public static void main(String[] args)
	{
		
		boolean shouldContinue;
		
		do{
		
		Double x1,x2,y1,y2;
		
		
		String xx1 = JOptionPane.showInputDialog(null,"Enter the 1st X Cord", "xx1", JOptionPane.QUESTION_MESSAGE);
		String xx2 = JOptionPane.showInputDialog(null,"Enter the 2nd X Cord", "xx2", JOptionPane.QUESTION_MESSAGE);
		String yy1 = JOptionPane.showInputDialog(null,"Enter the 1st Y Cord", "yy1", JOptionPane.QUESTION_MESSAGE);
		String yy2 = JOptionPane.showInputDialog(null,"Enter the 2nd Y Cord", "yy2", JOptionPane.QUESTION_MESSAGE);
		
		x1 = Double.parseDouble(xx1);
		x2 = Double.parseDouble(xx2);
		y1 = Double.parseDouble(yy1);
		y2 = Double.parseDouble(yy2);
		
		double distance = distance(x1, x2, y1, y2);	
		double slope = slope(x1, x2, y1, y2);
		double midpointx = midpoint(x1, x2);
		double midpointy = midpoint(y1 , y2);
		
		System.out.println("The distance is " + distance);
		System.out.println("The midpoint is " + midpointx + "," + midpointy);
		System.out.println("The slope is " + slope);
		
		shouldContinue = true;
		
			System.out.println("Do you want to play again?");
			String s3 = JOptionPane.showInputDialog(null, "Do you want to play again? (1 = no, 0 = yes)", "Play Again",JOptionPane.QUESTION_MESSAGE);
			int s4 = Integer.parseInt(s3);
			//work on input
			
				if (s4 == 0)
				{
					shouldContinue = true;
				}
				
				else
				{
					shouldContinue = false;
				}
	
		}while(shouldContinue == true);
		
	} 
	
	public static double distance(double  x1, double x2, double y1, double y2) 
	{

	
		double answer = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return answer;
	}
	
	public static double slope(double x1, double x2, double y1, double y2)
	{

		double slopeanswer = ((y2-y1)/(x2-x1));
		return slopeanswer;
	}
	
	public static double midpoint(double monday, double tuesday)
	{
		double midpointanswer = ((monday+tuesday)/2);
		return midpointanswer;
	}
	
	


}