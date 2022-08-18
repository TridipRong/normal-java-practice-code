package Q1;

public interface Y {
    void watching();

    default void movie() {
        System.out.println("Default of Y");
    }

    static void webserise() {
        System.out.println("Static of Y");

    }

}
