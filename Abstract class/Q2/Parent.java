package Q2;

public class Parent {

    public Parent(int number) {
        this.number = number;
    }

    void method1(){
        System.out.println("method 1 of parent");
    }
    void method2(){
        System.out.println("method 2 of parent");
    }
    void method3(){
        System.out.println("method 3 of parent");
    }

    final int number;
}
