public class Drone extends Aircraft implements CargoCapable {
    private double maxPayload;

    public Drone(String model, String tailNumber, double maxPayload) {
        super(model, tailNumber);
        this.maxPayload = maxPayload;
    }

    @Override
    public double getMaxPayload() {
        return maxPayload;
    }

    @Override
    public String toString() {
        return super.toString() + ", Drone{maxPayload=" + maxPayload + "}";
    }
}
