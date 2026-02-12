import java.awt.*;

public class PassengerCar extends RailCar 
{
    public PassengerCar(Color c) 
    {
        super(c);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) 
    {
        super.drawCar(g, x, y);
        g.setColor(Color.CYAN);
        for (int i = 20; i < CAR_WIDTH - 20; i += 30) 
        {
            g.fillRect(x + i, y + 30, 20, 30);  
        }
    }
}

