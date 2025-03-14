public abstract class Aircraft implements Comparable<Aircraft> {
    private String model;
    private String tailNumber;

    public Aircraft(String model, String tailNumber) {
        this.model = model;
        this.tailNumber = tailNumber;
    }

    public String getModel() {
        return model;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    @Override
    public int compareTo(Aircraft other) {
        return this.model.compareTo(other.model);
    }

    @Override
    public String toString() {
        return "Aircraft{model='" + model + "', tailNumber='" + tailNumber + "'}";
    }
}
