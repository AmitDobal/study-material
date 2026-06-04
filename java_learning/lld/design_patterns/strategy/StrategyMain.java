
interface MatchingStrategy {
    void match(String riderLocation);
}

class NearestDriverStrategy implements MatchingStrategy {

    @Override
    public void match(String riderLocation) {
        System.out.println("Matching with the newarest available driver to " + riderLocation);
    }
}

class AirportQueueStrategy implements MatchingStrategy {

    @Override
    public void match(String riderLocation) {
        System.out.println("Matching using FIFO aurport queue for " + riderLocation);
    }
}

class SurgePriorityStrategy implements MatchingStrategy {

    @Override
    public void match(String riderLocation) {
        System.out.println("Matching rider using surge pricing priority near " + riderLocation);
    }
}

class RideMatchingService {
    private MatchingStrategy matchingStrategy;

    public RideMatchingService(MatchingStrategy matchingStrategy) {
        this.matchingStrategy = matchingStrategy;
    }

    public void match(String riderLocation) {
        matchingStrategy.match(riderLocation);
    }

    public void setStrategy(MatchingStrategy matchingStrategy) {
        this.matchingStrategy = matchingStrategy;
    }
}

public class StrategyMain {
    public static void main(String[] args) {
        RideMatchingService matchingService1 = new RideMatchingService(new AirportQueueStrategy());
        matchingService1.match("asdad");

        matchingService1.setStrategy(new SurgePriorityStrategy());
        matchingService1.match("asdad");
    }
}
