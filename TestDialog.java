import javax.swing.*;

public class TestDialog
{
	public static void main(String[] args)
	{
		//JOptionPane.showMessageDialog(null, "Somebody once told me the world was gonna roll me, I aint the sharpest tool in the shed");
		//JOptionPane.showMessageDialog(null, "Somebody once told me the world was gonna roll me, I aint the sharpest tool in the shed","Allstarm by Smash Mouth", JOptionPane.ERROR_MESSAGE);
		String s1 = JOptionPane.showInputDialog(null,"Enter the first number","Number 1", JOptionPane.QUESTION_MESSAGE);
		String s2 = JOptionPane.showInputDialog(null, "Enter the second number","Number 2", JOptionPane.QUESTION_MESSAGE);
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		System.out.println(num1+num2);
	}




}