package Q2;
//    Method overloading is a complie time polymorphism . in method overloading more than onew method shares the same method name with different signature in the class . In method overloading the return type can or can not be the same, but we have to change the parameter because in java we can no achieve the methodoverloading.

import java.io.*;
public class overLoading {
static int add(int a,int b){
    return a+b;
}
static int add(int a, int b, int c){
    return a+b+c;
}

    public static void main(String[] args) {
        System.out.println(add(4,7));
        System.out.println(add(7,8,1));
    }
}
