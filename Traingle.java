import javax.swing.*;
public class Traingle
{
	
	
	
	public static void main(String[] args)
	{
		String answer1;
		int answer2;
		do{
		System.out.println("WELCOME USER!");
		
		findPerimeter();
		
		String base = JOptionPane.showInputDialog(null,"Enter the Base", "Side Base 1", JOptionPane.QUESTION_MESSAGE);	
		String height = JOptionPane.showInputDialog(null, "Enter the Height", "Side Height 1", JOptionPane.QUESTION_MESSAGE);
		

		findArea(base, height);
		

		answer1 = JOptionPane.showInputDialog(null, "Do you continue (1/yes and 2/no)","Answer", JOptionPane.QUESTION_MESSAGE);
		answer2 = Integer.parseInt(answer1);

		
		
		} while(answer2 == 1);
		
	}
	
	public static void findPerimeter()
	{
		String side1 = JOptionPane.showInputDialog(null,"Enter the Base", "Side 1", JOptionPane.QUESTION_MESSAGE);
		String side2 = JOptionPane.showInputDialog(null, "Enter the Height", "Side 2", JOptionPane.QUESTION_MESSAGE);
		String side3 = JOptionPane.showInputDialog(null, "Enter the other side", "Side 3", JOptionPane.QUESTION_MESSAGE);
		
		double s1 = Double.parseDouble(side1);
		double s2 = Double.parseDouble(side2);
		double s3 = Double.parseDouble(side3);
		
		double perimeter = s1+s2+s3;
		
		System.out.println("This traingle has a perimeter of " + perimeter);
	}
	
	public static double findArea(String base1, String height1)
	{
		

		
		double base = Double.parseDouble(base1);
		double height = Double.parseDouble(height1);
		
		double area = (.5*base*height);
		System.out.println("The area is " + area);
		return area;
		
	}
	
	
}