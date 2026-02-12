import java.awt.*;

public class FreightCar extends RailCar 
{

    public FreightCar(Color c) 
    {
        super(c);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) 
    {
        super.drawCar(g, x, y);

        g.setColor(color.darker());
        g.fillRect(x + 20, y - 20, CAR_WIDTH - 40, 20); 

        g.setColor(Color.ORANGE);
        g.fillRect(x + 30, y + 10, 30, 30);  // Cargo box 1
        g.fillRect(x + 70, y + 10, 30, 30);  // Cargo box 2
        g.fillRect(x + 110, y + 10, 30, 30); // Cargo box 3
    }
}


