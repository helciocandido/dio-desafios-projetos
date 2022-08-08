package one.digitalinnovation.gof.strategy;

public class Robot {
    private Behaviors behavior;

    public void setBehavior(Behaviors behavior) {
        this.behavior = behavior;
    }

    public void move() {
        behavior.move();
    }
}
