package com.Bhumit;
import java.awt.*;
import static java.awt.Color.red;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener {
    static final int Screen_Width = 750;
    static final int Screen_Height = 750;
    static final int Unit_Size = 30;
    static final int Game_Units = (Screen_Width*Screen_Height)/Unit_Size*Unit_Size;
    static final int Delay = 175;
    final int[] x = new int[Game_Units];
    final int[] y = new int[Game_Units];
    int bodyParts = 6;
    int appleEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(Screen_Width,Screen_Height));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(Delay,this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        if (running){
//            for (int i = 0; i <Screen_Height/Unit_Size ; i++) {
//                g.drawLine(i*Unit_Size,0,i*Unit_Size,Screen_Height);
//                g.drawLine(0,i*Unit_Size,Screen_Width,i*Unit_Size);
//            }
            g.setColor(red);
            g.fillOval(appleX,appleY,Unit_Size,Unit_Size);
            for (int i = 0; i < bodyParts ; i++) {
                if (i==0){
                    g.setColor(Color.green);
                    g.fillRect(x[i],y[i],Unit_Size,Unit_Size);
                }
                else{
                    g.setColor(new Color(45,180,0));
                    g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                    g.fillRect(x[i],y[i],Unit_Size,Unit_Size);
                }
            }
            g.setColor(red);
            g.setFont(new Font("Times New Roman",Font.BOLD,40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: "+ appleEaten,(Screen_Width-metrics.stringWidth("Score: "+appleEaten))/2,g.getFont().getSize());
        }
        else {
            gameOver(g);
        }
    }
    public void newApple(){
        appleX = random.nextInt((int)(Screen_Width/Unit_Size))*Unit_Size;
        appleY = random.nextInt((int)(Screen_Height/Unit_Size))*Unit_Size;

    }
    public void move(){
        for (int i = bodyParts; i >0 ; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch (direction) {
            case 'U':
                y[0] = y[0] - Unit_Size;
                break;
            case 'D':
                y[0] = y[0] + Unit_Size;
                break;
            case 'L':
                x[0] = x[0] - Unit_Size;
                break;
            case 'R':
                x[0] = x[0] + Unit_Size;
                break;
        }
    }
    public void checkApple(){
        if((x[0] == appleX)&&(y[0]==appleY)){
            bodyParts++;
            appleEaten++;
            newApple();
        }
    }
    public void checkCollision(){
        //checks if head collides with body
        for (int i = bodyParts; i >0 ; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                running = false;
            }
        }
        //checks if head touches any border
        if (x[0]<0){
            running=false;
        }
        if (x[0]>Screen_Width){
            running=false;
        }
        if (y[0]<0){
            running=false;
        }
        if (y[0]>Screen_Height){
            running=false;
        }
        if (!running){
            timer.stop();
        }
    }
    public void gameOver(Graphics g){
        //Score
        g.setColor(Color.red);
        g.setFont(new Font("Times New Roman",Font.BOLD,40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: " + appleEaten,(Screen_Width-metrics1.stringWidth("Score: " + appleEaten))/2,g.getFont().getSize());
        //Game Over Text
        g.setColor(Color.red);
        g.setFont( new Font("Ink Free",Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (Screen_Width - metrics2.stringWidth("Game Over"))/2, Screen_Width/2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (running){
            move();
            checkApple();
            checkCollision();
        }
        repaint();
    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}
