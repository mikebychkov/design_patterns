package my.exercise.strategy;

public interface FlyBehavior {
    default public void fly() {
        System.out.println("I'm flying away! Hallelujah!");
    }
}
