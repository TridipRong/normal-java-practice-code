package Q1;

public class Zimpl implements Z {
    public void playing() {

        System.out.println("Abstract of X");
    }

    @Override
    public void watching() {

        System.out.println("Abstract of Y");
    }

    @Override
    public void singing() {

        System.out.println("Abstract of Z");
    }

    @Override
    public void cricket() {
        System.out.println("Overridedof default X");
    }
}
