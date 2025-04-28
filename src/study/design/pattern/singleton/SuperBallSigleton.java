package src.study.design.pattern.singleton;

public class SuperBallSigleton {
    private static SuperBallSigleton instance;

    private SuperBallSigleton() {
    }

    public static SuperBallSigleton getInstance() {
        if (instance == null) {
            instance = new SuperBallSigleton();
        }
        return instance;
    }

    public void play() {
        System.out.println("Playing with the super ball!");
    }
}
