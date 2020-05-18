package my.exercise.strategy;

public abstract class Duck {
    private FlyBehavior fb;
    private QuackBehavior qb;

    public Duck() {
    }

    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }

    public void fly() {
        fb.fly();
    }

    public void quack() {
        qb.quack();
    }

    public static void main(String[] args) {
        Duck rh = new RedHeadDuck(new Fly(), new Quack());
        rh.quack();
        rh.fly();

        Duck rb = new RubberDuck(new NoFly(), new Quack());
        rb.quack();
        rb.fly();
    }
}
