import javax.swing.*;
import java.lang.Math;

public class volume
{
	public static void main(String[] args)
	{
		
		
		
		//Mohamed Ali - Mid Term Practicle - Part 2
		
		
		/*
		 *
		 *   _____         .__                              .___    _____  .__  .__ 
	  /     \   ____ |  |__ _____    _____   ____   __| _/   /  _  \ |  | |__|
	 /  \ /  \ /  _ \|  |  \\__  \  /     \_/ __ \ / __ |   /  /_\  \|  | |  |
	/    Y    (  <_> )   Y  \/ __ \|  Y Y  \  ___// /_/ |  /    |    \  |_|  |
	\____|__  /\____/|___|  (____  /__|_|  /\___  >____ |  \____|__  /____/__|
	        \/            \/     \/      \/     \/     \/          \/         
		 *
		 *
		 *
		 *____   ____    .__                                  _____  .__    .___               ___________                   
\   \ /   /___ |  |  __ __  _____   ____           /     \ |__| __| _/               \__    ___/__________  _____  
 \   Y   /  _ \|  | |  |  \/     \_/ __ \         /  \ /  \|  |/ __ |      ______      |    |_/ __ \_  __ \/     \ 
  \     (  <_> )  |_|  |  /  Y Y  \  ___/        /    Y    \  / /_/ |     /_____/      |    |\  ___/|  | \/  Y Y  \
   \___/ \____/|____/____/|__|_|  /\___  >       \____|__  /__\____ |                  |____| \___  >__|  |__|_|  /
                                \/     \/                \/        \/                             \/            \/ 
		 *
		 *
		 *
		 *
		 *
		 *_________                               __                       _________      .__                            
\_   ___ \  ____   _____ ______  __ ___/  |_  ___________       /   _____/ ____ |__| ____   ____   ____  ____  
/    \  \/ /  _ \ /     \\____ \|  |  \   __\/ __ \_  __ \      \_____  \_/ ___\|  |/ __ \ /    \_/ ___\/ __ \ 
\     \___(  <_> )  Y Y  \  |_> >  |  /|  | \  ___/|  | \/      /        \  \___|  \  ___/|   |  \  \__\  ___/ 
 \______  /\____/|__|_|  /   __/|____/ |__|  \___  >__|        /_______  /\___  >__|\___  >___|  /\___  >___  >
        \/             \/|__|                    \/                    \/     \/        \/     \/     \/    \/ 
		 *
		 *
		 */
		
		
		
		
		
		
		//RECTANGULAR SOLID BLOCK OF CODE
		//The variable choice is the CHOICE THE USER WANTS
		//SQ1 is the Length, sq2 is the width, sq3 is the height, volume1 is the volume of this recentagular solid
			
		boolean shouldContinue; // Variable used for the do while loop, if this is set to false then the program won't run again
		
		do{
		shouldContinue = true; // Variable used for the do while loop, if this is set to false then the program won't run again
		String s1 = JOptionPane.showInputDialog(null,"What shape do you want to be calculated? (1 = Rectangular Solid, 2 = Sphere, 3 = Pyramid, 4 = Cylinder","Number 1", JOptionPane.QUESTION_MESSAGE);
		int choice = Integer.parseInt(s1); //Parsing the response into an interger
		
		if (choice == 1)
		{
			String sq1 = JOptionPane.showInputDialog(null,"Please enter the length", JOptionPane.QUESTION_MESSAGE);
			double sqchoice1 = Double.parseDouble(sq1); //Parsing the response into an double
			
			String sq2 = JOptionPane.showInputDialog(null,"Please enter the Width", JOptionPane.QUESTION_MESSAGE);
			double sqchoice2 = Double.parseDouble(sq2); //Parsing the response into an double
			
			String sq3 = JOptionPane.showInputDialog(null,"Please enter the Height", JOptionPane.QUESTION_MESSAGE);
			double sqchoice3 = Double.parseDouble(sq3); //Parsing the response into an double
			
			double volume1 = (sqchoice1 * sqchoice2 * sqchoice3); //Multiplying the response to receive the volume
			
			System.out.println("A rectangular solid with a length of " + sqchoice1 + " , a width of " + sqchoice2 + " and a height of " + sqchoice3 + " has a volume of " + volume1 + " cubic units."); //Calculating the volume
		}
		
		else if (choice == 2)
		//Sphere SOLID BLOCK OF CODE
		//SQ4 is the Radius, volume2 is the volume of this Sphere
		{
			String sq4 = JOptionPane.showInputDialog(null,"Please enter the radius", JOptionPane.QUESTION_MESSAGE);
			double sqchoice4 = Double.parseDouble(sq4); //Parsing the response into a double
			
			double volume2 = (1.333 * 3.14 * Math.pow(sqchoice4, 3));//(sqchoice4 * sqchoice4 * sqchoice4)); Calculating volume
			System.out.println("A sphere with a radius of " + sqchoice4 + " has a volume of " + volume2 + " cubic units.");	
		}
		
		
		else if (choice == 3)
		//Pryamid SOLID BLOCK OF CODE
		//SQ5 is the length, sq6 is the width, sq7 is the height, and volume3 is the volume of this Pryamid
		{
			String sq5 = JOptionPane.showInputDialog(null,"Please enter the Length", JOptionPane.QUESTION_MESSAGE);
			double sqchoice5 = Double.parseDouble(sq5); //Parsing
			
			String sq6 = JOptionPane.showInputDialog(null,"Please enter the Width", JOptionPane.QUESTION_MESSAGE);
			double sqchoice6 = Double.parseDouble(sq6); //Parsing
			
			String sq7 = JOptionPane.showInputDialog(null,"Please enter the Height", JOptionPane.QUESTION_MESSAGE);
			double sqchoice7 = Double.parseDouble(sq7); //Parsing
			
			double volume3 = ((sqchoice5 * sqchoice6 * sqchoice7)/3); //Calculating volume
			
			System.out.println("A Pyramid with a length of " + sqchoice5 + " , a width of " + sqchoice6 + " and a height of " + sqchoice7 + " has a volume of " + volume3 + " cubic units.");
		}
		
		
		else if (choice == 4)
		//Cylinder SOLID BLOCK OF CODE
		//SQ8 is the radius, sq9 is the height, and volume4 is the volume of this Cylinder
		{
			String sq8 = JOptionPane.showInputDialog(null,"Please enter the radius", JOptionPane.QUESTION_MESSAGE);
			double sqchoice8 = Double.parseDouble(sq8); //Parsing
			
			String sq9 = JOptionPane.showInputDialog(null,"Please enter the height of the cylinder", JOptionPane.QUESTION_MESSAGE);
			double sqchoice9 = Double.parseDouble(sq9); //Parsing
			
			double volume4 = (3.14 * (sqchoice8 * sqchoice8) * sqchoice9); //Calculating volume
			System.out.println("A sphere with a radius of " + sqchoice8 + " and a height of " + sqchoice9 + " has a volume of " + volume4 + " cubic units.");	
		}
		
		
		//Basically what I am doing here is I'm asking the user whether or not he wants to continue, if the user picks 1 then the program will run again,
		//If the user picks 2 then the do while loop will stop so the program will not run again
		// What I did was I parsed the response (shouldcontinue1) into an int (shouldcontinue1int) and if the shouldcontinue1Int equals 2 or 1 then it will stop running or run the program again
		String shouldcontinue1 = JOptionPane.showInputDialog(null,"Would you like to continue (1 = yes and 2 = no)");
		int shouldcontinue1int = Integer.parseInt(shouldcontinue1);
		if(shouldcontinue1int == 2)
		{
			shouldContinue = false;
		}
		
		}while(shouldContinue == true);	
	}




}