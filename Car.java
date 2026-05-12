package Oops;

public class Car {

    String color;

    String brand;

    int speed;

    public static void main(String[] args) {

        Car c = new Car();
      //  c.run(50);

        c.speed = 100;
        c.run();
    }

    public  void run()
    {

        System.out.println("Car is running at speed :" +speed);
    }
}
