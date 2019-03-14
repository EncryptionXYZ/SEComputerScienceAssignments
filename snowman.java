import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.lang.Math;

public class snowman extends JFrame
{
    public snowman()        //creates title top bar
    {
        super("Snowman");
    }

    public void paint(Graphics g)
    {
    	Color brown = new Color(150, 75, 0);
    	Color gray = new Color(128,128,128);
        g.setColor(Color.black); //Make this black for night time background
        g.fillRect(0,0,249,249); 
        
        
        
        
        
        //lets increase productivity
        // make random snow generate :o
        int counter;
        for(int i = 1; i <= 200; i++){
		Random jet = new Random();
        int zz = jet.nextInt(250)+1;;
        int yy = jet.nextInt(250)+1;;
        g.setColor(Color.white);//SNOWWWWWWWWWWWWWWWWWWW!!!
        g.fillOval(zz,yy,1,1);
        }
        
        //
        
        
        
        
        
        
        g.setColor(Color.white);   //Make this white, for night time as the moon
        g.fillOval(-100,-100,200,200);  //create a rectangle
        //5,35 upper left-hand cornor of the rectangle
        //length 100 and width 60
        g.setColor(Color.white);
        g.fillOval(100,100,40,40);
        g.setColor(Color.white);
        g.fillOval(95,135,50,50);
        g.setColor(Color.white);
        g.fillOval(90, 175, 60, 60);
        g.setColor(Color.black); // left eye
        g.fillRect(112,110,5,5); // left eye
        g.setColor(Color.black);//right eye
        g.fillRect(124,110,5,5);//right eye
        g.setColor(Color.black);//nose
        g.fillRect(118,120,5,5);//nose
        g.setColor(Color.black);//mouth
        g.fillRect(109,128,20,4);//mouth
        g.setColor(Color.gray);//ground
        g.fillRect(7,227,600,15);//ground
        g.setColor(brown);//left arm
        g.fillRect(75,150,30,4);//left arm
		g.setColor(brown);//right arm
        g.fillRect(130,150,30,4);//right arm
        g.setColor(Color.black);//top dot
        g.fillRect(118,155,3,3);//top dot  
        g.setColor(Color.black);//bottom dot
        g.fillRect(118,195,3,3);//bottom dot  
        //work on hat, just do 2 rects and set color to something other than black
        g.setColor(gray);
        g.fillRect(107,97,25,4);
        g.setColor(gray);
        g.fillRect(112,80,15,20);
        
        
        

    }

    public static void main(String[] args)
    {

        snowman  w = new snowman();
        w.setSize(250,250);    //set size of picture
        w.show();  //display the picture
        System.out.print("Hello");
        System.out.println("Hello");

    }
}    