import java.util.*;
import java.util.stream.Collectors;

public class RobotExplorer {

    public static void main(String[] args) {
        // Creating an array of locations
        Location[] locations = {
            new Location("Alpha", LocationType.FRIENDLY),
            new Location("Beta", LocationType.ENEMY),
            new Location("Gamma", LocationType.NEUTRAL),
            new Location("Delta", LocationType.FRIENDLY),
            new Location("Epsilon", LocationType.ENEMY),
            new Location("Zeta", LocationType.FRIENDLY),
            new Location("Eta", LocationType.ENEMY)
        };

     
        System.out.println("Friendly Locations (sorted by name):");
        Arrays.stream(locations)
              .filter(location -> location.getType() == LocationType.FRIENDLY)
              .collect(Collectors.toCollection(TreeSet::new))
              .forEach(System.out::println);

        
        System.out.println("\nEnemy Locations (sorted by type and name):");
        Arrays.stream(locations)
              .filter(location -> location.getType() == LocationType.ENEMY)
              .sorted(Comparator.comparing(Location::getType).thenComparing(Location::getName))
              .collect(Collectors.toCollection(LinkedList::new))
              .forEach(System.out::println);
    }
}
