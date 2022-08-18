package Q2;

abstract public class Child extends Parent{
    void method1() {
        System.out.println("method 1 in child");
    }
    void method4(){
        System.out.println("method 4 in child");
    }
    Child(int n){
        super(n);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Child c = new Child(11){};
        c.method1();
        c.method2();
        c.method3();
        c.method4();
    }
}
