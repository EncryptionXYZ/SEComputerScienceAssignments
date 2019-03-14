 import java.util.Random;
import java.lang.Math;
import javax.swing.*;
public class Dice
{

	public static void main(String [] args)
	{
		
		
		
		Random generator = new Random();	
		
		boolean shouldContinue;
		
		do{
			
			int rollnum = generator.nextInt(6)+1;
			int rollnum2 = generator.nextInt(6)+1;
			shouldContinue = true;
		
	
		
		
		
			if ( rollnum == 1)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("x       *      x");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
			
					if ( rollnum == 2)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("x    *    *	   x");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if ( rollnum == 3)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *           x");
				System.out.println("x       *      x");
				System.out.println("x           *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if ( rollnum == 4)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if ( rollnum == 6)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x  *        *  x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}			
			
							if ( rollnum == 5)
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
			if ( rollnum2 == 1)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("x       *      x");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}	
			
					if (rollnum2 == 2)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("x    *    *	   x");
				System.out.println("x              x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if (rollnum2 == 3)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *           x");
				System.out.println("x       *      x");
				System.out.println("x           *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if (rollnum2 == 4)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}		
			
					if (rollnum2 == 6)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x  *        *  x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}			
			
							if (rollnum2 == 5)
			{
				System.out.println("xxxxxxxxxxxxxxxx");
				System.out.println("x              x");
				System.out.println("x  *        *  x");
				System.out.println("x       *      x");
				System.out.println("x  *        *  x");
				System.out.println("x              x");
				System.out.println("xxxxxxxxxxxxxxxx");
			}	
			System.out.println("You rolled " + (rollnum + rollnum2));
			
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
		
		
	}
	


