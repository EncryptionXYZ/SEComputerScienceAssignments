

import javax.swing.*;
import java.util.Random;
public class Roulette
{
	public static void main(String[]args)
	{
	String six, play;
	int start, enter, betT, spin, winnings, sixI, replay;
	JOptionPane.showMessageDialog(null,"Welcome to the roulette table!","Gamble your soul away!",JOptionPane.PLAIN_MESSAGE);
	winnings=0;
	start=500;		//initializes variables
	sixI=-1;
	replay=0;
	do
	{
		enter=placeBetAmount();
		betT=placeBetType();
		if(betT==6)      //handles single number bet
			{
			six=JOptionPane.showInputDialog(null,"Pick a value from 0 - 36 you think the wheel will land on","Risky.",JOptionPane.PLAIN_MESSAGE);
			sixI=Integer.parseInt(six);
			}
		spin=spinWheel(betT);
		winnings=calculateWinnings(betT, enter, spin, sixI);
		JOptionPane.showMessageDialog(null,"The wheel stopped at "+spin,"Well that's interesting.",JOptionPane.PLAIN_MESSAGE);
		if(winnings>0) //win
			{
			winnings=start+winnings;
			JOptionPane.showMessageDialog(null,"You Won, Awesome! Your current total is "+winnings+" dollars. \n","Awesomezors.",JOptionPane.PLAIN_MESSAGE);
			}
		if(winnings<0) //lost
			{
			winnings=start+winnings;
			JOptionPane.showMessageDialog(null,"You lost. Your current total is "+winnings+" dollars. \n","Sorryzors.",JOptionPane.PLAIN_MESSAGE);	
			}
		start=winnings;
		play=JOptionPane.showInputDialog(null,"If you would like to stop enter in -1", "I hope you keep playing!",JOptionPane.PLAIN_MESSAGE);
		replay=Integer.parseInt(play);
	}
	while(replay>=0 || start<=0);
	System.exit(0);  //graceful exit.
}
	
	public static int placeBetAmount()   //gets bet amount
	{
		String bet;
		bet=JOptionPane.showInputDialog(null,"Enter your bet, from 1 to 100 dollars","",JOptionPane.PLAIN_MESSAGE);
		int betI=Integer.parseInt(bet);
		return betI;
	}
	
	
	public static int placeBetType()
	{
		String bet;
		int betI;
		bet=JOptionPane.showInputDialog(null,"Pick what odds you want to bet on. \n1)  Even Number\n2)  Odd Number\n3)  First Third (between 1 and 12)\n4)  Second Third (between 13 and 24)\n5)  Last Third (between 25 and 36) \n6)   Pick Exact Number(0-36)","",JOptionPane.PLAIN_MESSAGE);
		betI=Integer.parseInt(bet);
		return betI;	
	}
	
	public static int spinWheel(int betT)
	{
		int spin, bet;
		Random generator = new Random();
		spin=generator.nextInt(37);		
		return spin;
	}
	
	public static int calculateWinnings(int betT, int enter, int spin, int sixI)
	{
		int amount;
		amount=0;
		if (spin!=0 && betT!=6)
			{
			if(betT==1 && spin%2==0)
				{
				amount=enter+enter*2;
				}
			if(betT==1 && spin%2!=0)
				{
				amount=enter*-1;
				}
			if(betT==2 && spin%2!=0)
				{
				amount=enter+enter*2;
				}
			if(betT==2 && spin%2==0)
				{
				amount=enter*-1;
				}
			if(betT==3 && (spin>=1 && spin <=12))
				{
				amount=enter+enter*3;
				}
			if(betT==3 && spin>12)
				{
				amount=enter*-1;
				}
			if(betT==4 && (spin>=13 && spin<=24))
				{
				amount=enter+enter*3;
				}
			if(betT==4 && (spin<13 || spin>24))
				{
				amount=enter*-1;
				}
			if(betT==5 && (spin>=25 && spin<=36))
				{
				amount=enter+enter*3;
				}
			if(betT==5 && spin<25)
				{
				amount=enter*-1;
				}
			}
		
		if(betT==6)  // handles Single pick number.
			{
			if(sixI==spin)
				{
				amount=enter+enter*36;
				}
				else
				{
				amount=enter*-1;
				}
			}
		return amount;  // returns the winnings
		}
}