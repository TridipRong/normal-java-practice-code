package q3;

public class main {
    public static void main(String[] args) {
        Animal [] array=new Animal[3];
        array[0]=new Dog();
        array[1]=new Cat();
        array[2]=new Tiger();
        for(int i=0;i<array.length;i++){
            array[i].makeNoise();
            array[i].eat();
            array[i].walk();
        }
    }
}
