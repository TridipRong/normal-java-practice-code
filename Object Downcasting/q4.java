//Q4 What is instance of operator explain with an example
//Ans. The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.
//        Its syntax is : objectName instanceOf className;
//        Here, if objectName is an instance of className, the operator returns true. Otherwise, it returns false.
//
//        Example:
class Main {

    public static void main(String[] args) {

        // create a variable of string type
        String name = "Tridip";

        // checks if name is instance of String
        boolean result1 = name instanceof String;
        System.out.println("name is an instance of String: " + result1);

        // create an object of Main
        Main obj = new Main();

        // checks if obj is an instance of Main
        boolean result2 = obj instanceof Main;
        System.out.println("obj is an instance of Main: " + result2);
    }
}

//Output:name is an instance of String: true
//        obj is an instance of Main: true




