public class Freighter extends Aircraft implements CargoCapable {
    private double maxPayload;

    public Freighter(String model, String tailNumber, double maxPayload) {
        super(model, tailNumber);
        this.maxPayload = maxPayload;
    }

    @Override
    public double getMaxPayload() {
        return maxPayload;
    }

    @Override
    public String toString() {
        return super.toString() + ", Freighter{maxPayload=" + maxPayload + "}";
    }
}
