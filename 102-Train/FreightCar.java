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

        g.setColor(Color.BLACK);
        //vertical
        g.fillRect(x + 15, y + 10, 1, 75); 
        g.fillRect(x + 124, y +10, 1, 75); 
        //horizontal
        g.fillRect(x + 15, y +85, 110, 1);  
        g.fillRect(x+15, y+10, 110, 1);
        //Diagonal


        //handles
        g.fillRect(x+40, y+40, 15, 15);
        g.fillRect(x+90, y+40, 15, 15);
        

    }
}


