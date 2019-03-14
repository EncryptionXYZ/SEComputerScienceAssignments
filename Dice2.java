import javax.swing.*;
import java.util.Random;
import java.lang.Math;
public class Dice2
{
	public static void main(String[] args)
	{
		boolean shouldContinue;
		do{
			
			
		shouldContinue = true;
		/*String choice11 = JOptionPane.showInputDialog(null, "What should the 1st die roll?", "Number 1",JOptionPane.QUESTION_MESSAGE);
		String choice22 = JOptionPane.showInputDialog(null, "What should the 2nd die roll?", "Number 2",JOptionPane.QUESTION_MESSAGE);
		int choice1 = Integer.parseInt(choice11);
		int choice2 = Integer.parseInt(choice22);*/
		Random generator = new Random();
		int rollnum = generator.nextInt(6)+1;
		int rollnum2 = generator.nextInt(6)+1;
		showDice(rollnum);
		showDice(rollnum2);
		System.out.println("You rolled " + (rollnum + rollnum2));
		System.out.println("Do you want to play again?");
		String s3 = JOptionPane.showInputDialog(null, "Do you want to play again? (1 = no, 0 = yes)", "Play Again",JOptionPane.QUESTION_MESSAGE);
			int s4 = Integer.parseInt(s3);
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
	
	public static void showDice(int roll)
	{
		if ( roll == 1)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("x       *      x");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
			
					if ( roll == 2)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("x    *    *    x");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if ( roll == 3)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *           x");
				System.out.println("x       *      x");
				System.out.println("x           *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if ( roll == 4)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if ( roll == 6)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x  *        *  x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}			
			
							if ( roll == 5)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x       *      x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}	
			//\
			//
			//
			//
		
	}
}