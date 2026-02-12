import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Display extends JPanel
{
	public Display(){}

	public void paintComponent(Graphics g) 
	{
    super.paintComponent(g);
    setBackground(Color.WHITE);

    Train train = new Train(100,300);

    train.addCar("Locomotive", Color.BLUE);
    train.addCar("PassengerCar", Color.GRAY);
    train.addCar("PassengerCar", Color.GRAY);
    train.addCar("FreightCar", Color.GREEN);
    train.addCar(3, "PassengerCar", Color.GRAY);
    train.addCar("FreightCar", Color.GREEN);
    train.addCar("Caboose", Color.RED);
    train.addCar(6, "FreightCar", Color.GREEN);

    train.showCars(g);
	}
}