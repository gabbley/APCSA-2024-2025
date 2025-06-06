import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {

    private final int TILE_SIZE = 25;
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final int ALL_TILES = (WIDTH * HEIGHT) / (TILE_SIZE * TILE_SIZE);
    private final int DELAY = 100;

    private final int[] x = new int[ALL_TILES];
    private final int[] y = new int[ALL_TILES];
    private int bodyParts = 6;
    private int score = 0;

    private int appleX, appleY;

    private char direction = 'R'; // 'U', 'D', 'L', 'R'
    private boolean running = false;
    private Timer timer;
    private Random random;

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        setFocusable(true);
        addKeyListener(new MyKeyAdapter());

        random = new Random();
        startGame();
    }

    public void startGame() {
        spawnApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void spawnApple() {
        appleX = random.nextInt(WIDTH / TILE_SIZE) * TILE_SIZE;
        appleY = random.nextInt(HEIGHT / TILE_SIZE) * TILE_SIZE;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (running) {
            // Draw apple
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, TILE_SIZE, TILE_SIZE);

            // Draw snake
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], TILE_SIZE, TILE_SIZE);
                } else {
                    g.setColor(new Color(34, 139, 34)); // darker green
                    g.fillRect(x[i], y[i], TILE_SIZE, TILE_SIZE);
                }
            }

            // Draw score
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Score: " + score, 10, 25);

        } else {
            gameOver(g);
        }
    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U': y[0] -= TILE_SIZE; break;
            case 'D': y[0] += TILE_SIZE; break;
            case 'L': x[0] -= TILE_SIZE; break;
            case 'R': x[0] += TILE_SIZE; break;
        }
    }

    public void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            bodyParts++;
            score++;
            spawnApple();
        }
    }

    public void checkCollisions() {
        // Check self collision
        for (int i = bodyParts; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                running = false;
                break;
            }
        }

        // Check wall collision
        if (x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
            running = false;
        }

        if (!running) timer.stop();
    }

    public void gameOver(Graphics g) {
        // Game over text
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString("Game Over", WIDTH / 4, HEIGHT / 2);

        // Final score
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.white);
        String finalScore = "Final Score: " + score;
        g.drawString(finalScore, (WIDTH - g.getFontMetrics().stringWidth(finalScore)) / 2, HEIGHT / 2 + 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') direction = 'L'; break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') direction = 'R'; break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') direction = 'U'; break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') direction = 'D'; break;
            }
        }
    }
}
