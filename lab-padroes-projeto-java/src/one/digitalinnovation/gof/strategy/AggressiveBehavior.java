package one.digitalinnovation.gof.strategy;

public class AggressiveBehavior implements Behaviors{

    @Override
    public void move() {
        System.out.println("Moving aggressively...");
    }
}
