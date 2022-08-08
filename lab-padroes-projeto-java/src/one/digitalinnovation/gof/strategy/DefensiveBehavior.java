package one.digitalinnovation.gof.strategy;

public class DefensiveBehavior implements Behaviors{

    @Override
    public void move() {
        System.out.println("Moving defensively...");
    }
}
