package one.digitalinnovation.gof.strategy;

public class NormalBehavior implements Behaviors{

    @Override
    public void move() {
        System.out.println("Moving normally...");
    }
}
