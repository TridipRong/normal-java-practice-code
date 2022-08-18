package Q2;

public class Demo {
    Demo(){
        this("Tridip");
        System.out.println("Default");
    }
    Demo(String s){
        this(110);
        System.out.println(s);

    }
    public Demo(int i){
        this(5.5f);
        System.out.println(i);

    }
    public Demo(float f){
        System.out.println(f);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
