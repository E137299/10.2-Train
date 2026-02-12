
import java.awt.*;

public class Caboose extends RailCar {

    public Caboose(Color c) {
        super(c);
    }

    @Override
    public void drawCar(Graphics g, int x, int y) {
        super.drawCar(g, x, y);
        g.setColor(color.brighter());
        g.fillRect(x + 40, y - 30, 70, 40);  // Lower y-offset, shorter

        g.setColor(Color.CYAN);
        g.fillRect(x + 50, y - 15, 15, 15);  // Adjusted with cupola
        g.fillRect(x + 85, y - 15, 15, 15);
    }
}
