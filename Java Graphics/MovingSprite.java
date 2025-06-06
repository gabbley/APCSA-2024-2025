import javax.swing.JFrame;
import javax.swing.JPanel; 
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MovingSprite extends JPanel implements KeyListener {
    
    // Sprite position variables
    private int x = 50;  // X position of the sprite
    private int y = 50;  // Y position of the sprite
    private final int SPRITE_SIZE = 30; // Size of the sprite (width and height)
    private final int MOVE_SPEED = 10;  // How much the sprite moves with each key press

    // Constructor - Sets up the JFrame and panel
    public MovingSprite() {
        JFrame frame = new JFrame("Move the Sprite with WASD!");
        frame.setSize(800, 600); // Width and height of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.add(this); // Adds this JPanel (MovingSprite) to the frame
        frame.addKeyListener(this); // Listens for key presses on the frame
        frame.setVisible(true); // Make the frame visible
    }

    // Paint method to draw the sprite
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Clears the screen before drawing
        g.setColor(Color.BLUE); // Color of the sprite
        g.fillRect(x, y, SPRITE_SIZE, SPRITE_SIZE); // Draws the sprite as a rectangle
    }

    // KeyListener methods to detect key presses
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        
        // Move sprite with WASD keys
        if (keyCode == KeyEvent.VK_W) { 
            y -= MOVE_SPEED; // Move up
        } else if (keyCode == KeyEvent.VK_S) { 
            y += MOVE_SPEED; // Move down
        } else if (keyCode == KeyEvent.VK_A) { 
            x -= MOVE_SPEED; // Move left
        } else if (keyCode == KeyEvent.VK_D) { 
            x += MOVE_SPEED; // Move right
        }

        // Keep the sprite inside the window boundaries
        if (x < 0) x = 0; 
        if (y < 0) y = 0; 
        if (x > getWidth() - SPRITE_SIZE) x = getWidth() - SPRITE_SIZE; 
        if (y > getHeight() - SPRITE_SIZE) y = getHeight() - SPRITE_SIZE; 

        repaint(); // Calls the paintComponent() to update the screen
    }

    // Unused KeyListener methods (required by the interface)
    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this program
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this program
    }

    // Main method to run the program
    public static void main(String[] args) {
        new MovingSprite();
    }
}
