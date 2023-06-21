import java.awt.*;
import javax.swing.*;

public class TeddyBear extends JFrame{

    TeddyBear(){
        this.setTitle("Teddy Bear");
        this.setSize(1000, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillOval(75, 75, 100, 100);
        g.fillOval(220, 75, 100, 100);
        g.setColor(Color.white);
        g.fillOval(90, 90, 75, 75);
        g.fillOval(235, 90, 75, 75);
        g.setColor(Color.blue);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.white);
        g.fillOval(145, 160, 30, 30);
        g.fillOval(225, 160, 30, 30);
        g.fillOval(175,210, 50, 50);
        g.setColor(Color.blue);
        g.fillOval(170,190, 60, 60);
    }
    public static void main(String[] args) {
        new TeddyBear();
    }
}
