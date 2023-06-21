import java.awt.*;
import javax.swing.*;

public class NepalFlag extends JFrame{
    NepalFlag(){
        this.setTitle("Flag OF Nepal");
        this.setSize(1000, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g){
        
        int[] x1points = {100,350,200,375,100};
        int[] y1points = {50,200,200,375,375};
        int[] x2points = {110,315,178,355,110};
        int[] y2points = {65,190,190,365,365};

        triangle(g, x1points, y1points, Color.blue);
        triangle(g, x2points, y2points, Color.red);
        g.setColor(Color.white);
        g.fillOval(140, 270, 60, 60);
        g.fillOval(140, 115, 56, 56);
        g.setColor(Color.red);
        g.fillOval(140, 105, 56, 56);
        g.setColor(Color.white);
        g.fillOval(156, 140, 25, 25);
    }
    public static void main(String[] args) {
        new NepalFlag();
    }

    public static void triangle(Graphics g, int[] xpoints, int[] ypoints, Color c){
        g.setColor(c);
        g.fillPolygon(xpoints, ypoints, 5);
    }
}