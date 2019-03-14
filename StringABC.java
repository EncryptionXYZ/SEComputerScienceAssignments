import javax.swing.*;
public class StringABC
{
	public static void main(String[] args)
	{
		String s3 = JOptionPane.showInputDialog(null, "Please Input Your String: ",JOptionPane.QUESTION_MESSAGE);
		String sub3;
		int vowels = 0;
		int i = 0;
		int length = s3.length();
		System.out.println("Your string is " + s3);
		  	int a = 0;
			int e = 0;
			int ii = 0;
			int o = 0;
			int u = 0;
		
		for (i = 0; i < length; i++)
		{
			
		  sub3 = s3.substring(i, i+1);
	
		
		  if (sub3.equalsIgnoreCase("a") == true)
		  {
		  
		    vowels++;
		    a = a+1;}
		  else if (sub3.equalsIgnoreCase("e") == true){
		  
		    vowels++;
		    e= e+1;}
		  else if (sub3.equalsIgnoreCase("i") == true){
		  
		    vowels++;
		    ii= ii+1;}
		  else if (sub3.equalsIgnoreCase("o") == true){
		  
		    vowels++;
		    o=o+1;}
		  else if (sub3.equalsIgnoreCase("u") == true){
		  
		    vowels++;
			u=u+1;}
			
		}
			System.out.println("There are " + a + " A's, " + e + "E's, " + ii + "I's, " + o + "O's, " + u + "U's");
			System.out.println("Number of vowels: " + vowels);
		
	}
}