import java.awt.*;

public class Locomotive extends RailCar {
    public Locomotive(Color c) {
        super(c);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) 
    {
        super.drawCar(g, x, y); 

        
        g.setColor(Color.BLACK);
        g.fillRect(x + 20, y - 60, 25, 60);

        g.setColor( Color.BLACK);
        g.fillRect(x+20, y-80, 60, 25);


        g.setColor(Color.BLACK);
        int[] triX = {x, x - 50, x};  
        int[] triY = {y + 50/2, y + CAR_HEIGHT, y + CAR_HEIGHT};
        g.fillPolygon(triX, triY, 3);     

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(x+70, y-90, 60, 25);
        g.fillOval(x+80, y-85, 80, 40);
        g.fillOval(x+70, y-75, 60, 25);

    }
}
