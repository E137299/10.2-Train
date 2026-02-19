
import java.awt.*;

public class Caboose extends RailCar 
{

    public Caboose(Color c) 
    {
        super(c);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) 
    {
        super.drawCar(g, x, y);
        g.setColor(color.brighter());
        g.fillRect(x + 40, y - 30, 70, 40); 

        g.setColor(Color.CYAN);
        g.fillRect(x + 20, y + 30, 40, 40); 
        g.fillRect(x + 85, y + 30, 40, 40);

        g.setColor(Color.BLACK);
        
    }
}
