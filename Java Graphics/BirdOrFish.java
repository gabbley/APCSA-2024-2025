import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Scanner;

public class BirdOrFish extends JPanel {

   // global scope, fields
   private boolean drawFish = false;
   private boolean drawBird = false;

   public static void main(String[] args) {
      System.out.println("Written by: Ms. Baniqued");
      
      JFrame frame = new JFrame("Java Graphics Demo");
      BirdOrFish panel = new BirdOrFish();
      frame.add(panel);
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      Scanner kb = new Scanner(System.in);
      String response = "";
   
      System.out.println("Do you want to draw a bird?");
      response = kb.next();
      if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
         panel.drawBird = true;
      }
   
      System.out.println("Do you want to draw a fish?");
      response = kb.next();
      if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
         panel.drawFish = true;
      }
   
      panel.repaint(); // something changed...calling paintComponent  
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      if (drawBird == true) {
        // Bird body
         g.setColor(new Color(255, 200, 0)); // Yellowish
         g.fillOval(80, 80, 80, 50); // body
      
         // Bird beak
         g.setColor(Color.ORANGE);
         int[] xBeak = {150, 170, 150};
         int[] yBeak = {100, 105, 110};
         g.fillPolygon(xBeak, yBeak, 3);
      
         // Bird eye
         g.setColor(Color.BLACK);
         g.fillOval(130, 95, 6, 6);
      }
   
      if (drawFish == true) {
         // Fish body
         g.setColor(Color.CYAN);
         g.fillOval(200, 150, 80, 40); // body
      
         // Fish tail
         g.setColor(Color.BLUE);
         int[] xTail = {300, 280, 300};
         int[] yTail = {150, 170, 190};
         g.fillPolygon(xTail, yTail, 3);
      
         // Fish eye
         g.setColor(Color.BLACK);
         g.fillOval(210, 160, 5, 5);
      }
   
      if (!drawFish && !drawBird) {
         g.setColor(Color.RED);
         g.drawString("Nothing drawn.", 150, 100);
      }
   }
}
