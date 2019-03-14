import javax.swing.*;

public class Average
{
	public static void main (String[] args)
	{
		String s1 = JOptionPane.showInputDialog(null,"Enter the first grade", "First Grade", JOptionPane.QUESTION_MESSAGE);
		String s2 = JOptionPane.showInputDialog(null, "Enter the second grade", "Second Grade", JOptionPane.QUESTION_MESSAGE);
		String s3 = JOptionPane.showInputDialog(null, "Enter the third grade", "Third Grade",JOptionPane.QUESTION_MESSAGE);
		
		
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		double n3 = Double.parseDouble(s3);
		
		double avg = (n1+n2+n3) / 3;
		System.out.println("The average of " + n1 + n2 + n3 + " is " + avg);
		
		System.out.println("\u03A3");
	}
}