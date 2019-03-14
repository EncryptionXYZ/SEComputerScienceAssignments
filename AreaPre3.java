import javax.swing.JOptionPane;

public class AreaPre3
{
	public static void main(String[] args)
	{
			
		
		
		String length1 = JOptionPane.showInputDialog(null,"Enter the length", "Length", JOptionPane.QUESTION_MESSAGE);
		String width1 = JOptionPane.showInputDialog(null, "Enter the width", "Width", JOptionPane.QUESTION_MESSAGE);

		
		
		double length2 = Double.parseDouble(length1);
		double width2 = Double.parseDouble(width1);
		
		
		double area1 =(area(length2, width2));
		double perimeter1 = (perimeter(length2, width2));
		System.out.println("A rectangle with a length of " + length2 + " and a width of " + width2 + " has an area of " + area1 + " and a perimeter of " + perimeter1);
			

	}
	
	public static double area(double  length, double width)
	{
		 double area = (length * width);

		 return area;
		
	}
	
	public static double perimeter(double  length, double width)
	{
		
		double perimeter = ((length + width)*2);
		return perimeter;		
	}
}