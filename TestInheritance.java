package Oops;

public class TestInheritance {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.eat();
        animal.sound();
       // animal.fly();

        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        dog.fly();

    }
}
class species {
    void fly()
    {
        System.out.println("Flying.......");
    }
}
class Animal extends species{

    void eat()
    {
        System.out.println("Animal is eating");
    }

    void sound()
    {
        System.out.println("Animal sound.......");
    }
    void fly()
    {
        System.out.println("Animal flying....");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog is Sounding......");
    }
}

    // Multilevel Inheritance
