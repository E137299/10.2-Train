import javax.swing.*;
import java.awt.*;              

public class RailCar
{
    protected Color color;
    protected static final int CAR_WIDTH=150;
    protected static final int CAR_HEIGHT=100;
    protected static final int WHEEL_DIAMETER=40;
    protected static final int COUPLER_LENGTH=20;

    public RailCar(Color c)
    {
        this.color=c;
    }
    
    public void drawCar(Graphics g, int x, int y)
    {
        //Body
        g.setColor(color);
        g.fillRect(x, y,CAR_WIDTH, CAR_HEIGHT);
        //wheels
        g.setColor(Color.BLACK);
        g.fillOval(x+20, y+CAR_HEIGHT-10,WHEEL_DIAMETER,WHEEL_DIAMETER);
        g.fillOval(x+CAR_WIDTH-60,y+CAR_HEIGHT-10 ,WHEEL_DIAMETER,WHEEL_DIAMETER);
        //COupler
        g.setColor(Color.DARK_GRAY);
        g.drawLine(x+CAR_WIDTH,y+CAR_HEIGHT/2,x+CAR_WIDTH+COUPLER_LENGTH,y+CAR_HEIGHT/2);
    }

    public int getWidth()
    {
        return CAR_WIDTH+COUPLER_LENGTH;   
    }
}