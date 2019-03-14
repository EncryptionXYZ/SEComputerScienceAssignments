import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT's event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and container
 
/** 
 * A Bouncing Ball: Running animation via Swing Timer 
 */
@SuppressWarnings("serial")
public class CGBouncingBallSwingTimer2 extends JFrame {
   // Define named-constants
   private static final int CANVAS_WIDTH = 640;
   private static final int CANVAS_HEIGHT = 480;
   private static final int UPDATE_PERIOD = 1; // milliseconds
 
   private DrawCanvas canvas;  // the drawing canvas (an inner class extends JPanel)
 
   // Attributes of moving object
   private int x = 30, y = 100;  // top-left (x, y)
   private int size = 40;        // width and height
   private int xSpeed = 1, ySpeed = 1; // displacement per step in x, y
   
   // Second Moving Object
   private int x2 = 60, y2 = 200;
   private int size2 = 50;
   private int x2Speed = 2, y2Speed = 2;
   // Constructor to setup the GUI components and event handlers
   public CGBouncingBallSwingTimer2() {
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
      this.setContentPane(canvas);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.pack();
      this.setTitle("Bouncing Ball");
      this.setVisible(true);
 
      // Define an ActionListener to perform update at regular interval
      ActionListener updateTask = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            update();   // update the (x, y) position
            repaint();  // Refresh the JFrame, callback paintComponent()
         }
      };
      // Allocate a Timer to run updateTask's actionPerformed() after every delay msec
      new Timer(UPDATE_PERIOD, updateTask).start();
   }
 
   // Update the (x, y) position of the moving object
   public void update() {
      x += xSpeed;
      y += ySpeed;
      if (x > CANVAS_WIDTH - size || x < 0) {
         xSpeed = -xSpeed;
      }
      if (y > CANVAS_HEIGHT - size || y < 0) {
         ySpeed = -ySpeed;
      }
      
      //
      x2 += x2Speed;
      y2+= y2Speed;
      if (x2 > CANVAS_WIDTH - size2 || x2 < 0) {
         x2Speed = -x2Speed;
      }
      if (y2 > CANVAS_HEIGHT - size2 || y2 < 0) {
         y2Speed = -y2Speed;
      }
      
      //
     
     if ((x>=x2 && x<=x2+size2) && (y>=y2 && y<=y2)) 
     {
     	x2Speed = -x2Speed;
		y2Speed = -y2Speed;
		xSpeed = -xSpeed;
		ySpeed = -ySpeed;     	
     }     
	 if ((x+size>=x2 && x+size<=x2+size2) && (y>=y2 && y<=y2)) 
     {
     	x2Speed = -x2Speed;
		y2Speed = -y2Speed;
		xSpeed = -xSpeed;
		ySpeed = -ySpeed;     	
     }  
	 
	 if((x>=x2 && x<=x2+size2) && (y+size>=y2 && y+size<=y2+size2))
	 {
	     	x2Speed = -x2Speed;
			y2Speed = -y2Speed;
			xSpeed = -xSpeed;
			ySpeed = -ySpeed;  	 
	 }
	 
	 if((x+size>=x2 && x+size<=x2+size2) && (y+size>=y2 && y+size<=y2+size2))
	 {
	     	x2Speed = -x2Speed;
			y2Speed = -y2Speed;
			xSpeed = -xSpeed;
			ySpeed = -ySpeed;  
	 }

   }
 
   // Define inner class DrawCanvas, which is a JPanel used for custom drawing
   private class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);  // paint parent's background
         setBackground(Color.BLACK);
         g.setColor(Color.WHITE);
         g.fillRect(x, y, size, size);  // draw a circle
         g.setColor(Color.GREEN);
         g.fillRect(x2, y2, size2, size2);  // draw a circle
         
      }
   }
 
   // The entry main method
   public static void main(String[] args) {
      // Run GUI codes in Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new CGBouncingBallSwingTimer2(); // Let the constructor do the job
         }
      });
   }
}