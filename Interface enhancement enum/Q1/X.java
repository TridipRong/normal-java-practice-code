package Q1;

public interface X {
    void playing();

    default void cricket() {

        System.out.println("Default of X");
    }

    static void footbal() {
        System.out.println("Static of X");
    }
}
