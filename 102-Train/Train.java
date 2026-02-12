import java.awt.*;
import java.util.ArrayList;

public class Train
{
    private int startX;
    private int startY;
    private ArrayList<RailCar>cars;

    public Train(int x, int y)
    {
        this.startX=x;
        this.startY=y;
        this.cars=new ArrayList<>();
    }
    public void addCar(String type,Color color)
    {
        cars.add(createCar(type,color));
    }
    
    public void addCar(int position, String type, Color color) 
    {
        if (position < 0 || position > cars.size()) 
        {
            position = cars.size();         
        }
        cars.add(position, createCar(type, color));
    }

    private RailCar createCar(String type, Color color) 
    {
        RailCar car;
        
        switch (type) 
        {
            case "Locomotive":
                car = new Locomotive(color);
                break;
            case "PassengerCar":
                car = new PassengerCar(color);
                break;
            case "FreightCar":
                car = new FreightCar(color);
                break;
            case "Caboose":
                car = new Caboose(color);
                break;
            default:
                car = new RailCar(color);  // fallback
                break;
        }
        
        return car;
    }

    public void showCars(Graphics g) 
    {
        int currentX = startX;
        for (RailCar car : cars) 
        {
            car.drawCar(g, currentX, startY);
            currentX += car.getWidth();
        }
    }
}