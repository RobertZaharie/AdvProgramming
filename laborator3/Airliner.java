public class Airliner extends Aircraft implements PassengerCapable {
    private int numberOfPassengers;

    public Airliner(String model, String tailNumber, int numberOfPassengers) {
        super(model, tailNumber);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + ", Airliner{numberOfPassengers=" + numberOfPassengers + "}";
    }
}
