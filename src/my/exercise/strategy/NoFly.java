package my.exercise.strategy;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No thanks! That's dangerous!");
    }
}
