public class Flight {
    private Aircraft aircraft;
    private int id;
    private int landingStart;
    private int landingEnd;

    public Flight(Aircraft aircraft, int id, int landingStart, int landingEnd) {
        this.aircraft = aircraft;
        this.id = id;
        this.landingStart = landingStart;
        this.landingEnd = landingEnd;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public int getId() {
        return id;
    }

    public int getLandingStart() {
        return landingStart;
    }

    public int getLandingEnd() {
        return landingEnd;
    }

    public boolean conflictsWith(Flight other) {
        return !(this.landingEnd <= other.landingStart || this.landingStart >= other.landingEnd);
    }

    @Override
    public String toString() {
        return "Flight{id=" + id + ", aircraft=" + aircraft + ", landingStart=" + landingStart + ", landingEnd=" + landingEnd + "}";
    }
}
