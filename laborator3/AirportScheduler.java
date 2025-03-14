public class AirportScheduler {

    public static void main(String[] args) {
        // Create some aircraft
        Aircraft airliner1 = new Airliner("Boing ", "1", 300);
        Aircraft freighter1 = new Freighter("Model2", "2", 20000.0);
        Aircraft drone1 = new Drone("Model3", "3", 5.0);

        // Create flights
        Flight flight1 = new Flight(airliner1, 1, 800, 900);
        Flight flight2 = new Flight(freighter1, 2, 850, 950);
        Flight flight3 = new Flight(drone1, 3, 910, 1000);

        // Store flights in an array
        Flight[] flights = new Flight[]{flight1, flight2, flight3};

        // Sort flights manually based on aircraft model name (using a simple bubble sort)
        for (int i = 0; i < flights.length - 1; i++) {
            for (int j = i + 1; j < flights.length; j++) {
                if (flights[i].getAircraft().compareTo(flights[j].getAircraft()) > 0) {
                    // Swap the flights
                    Flight temp = flights[i];
                    flights[i] = flights[j];
                    flights[j] = temp;
                }
            }
        }

        // Output sorted flights
        for (int i = 0; i < flights.length; i++) {
            System.out.println(flights[i]);
        }

        // Check for conflicts manually
        for (int i = 0; i < flights.length; i++) {
            for (int j = i + 1; j < flights.length; j++) {
                if (flights[i].conflictsWith(flights[j])) {
                    System.out.println("Conflict detected between Flight " + flights[i].getId() +
                            " and Flight " + flights[j].getId());
                }
            }
        }
    }
}
