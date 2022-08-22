package Q3;

public abstract class Evaluation {
    private final int numberOfQuestions=0;
    abstract void evaluationTiming();
    void printNoOfQuestions() {
        System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
    }
}
