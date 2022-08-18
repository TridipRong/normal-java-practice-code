package Q2;
import java.io.*;
//Method overriding is an runtime polymorphism . im method overriding the drived class provides the apecific implimentation of the method taht is already provided by the base class or parent class.
 class overrriding {
    public static void main(String[] args) {
        Dog d1=new Dog();
        Animal al= new Animal();
        d1.eat();
        al.eat();
        Animal ani=new Dog();
        ani.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("eating.");
    }
}
    class Dog extends Animal{
        @Override
        void eat() {
            System.out.println("Dog Is Eating");
        }
    }
