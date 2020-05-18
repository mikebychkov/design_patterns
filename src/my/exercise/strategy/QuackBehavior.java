package my.exercise.strategy;

public interface QuackBehavior {
    default public void quack() {
        System.out.println("Quack!".repeat(2));
    }
}
