import java.util.Arrays;
import java.util.List;

public class TrickorTreatSimulator {
    public static void printResults(Person person) {
        System.out.println(person.getName() + " was dressed as " + person.getCostume() + ", visited " + person.getNumHousesVisited() + " houses, collected " + person.getPiecesOfCandy() + " pieces of candy, and played the trick of scaring the person that answered the door "+ person.getTricksPlayed() + " times.");
        System.out.println();
    }
    public static void main(String[] args) {
        List<House> houses = Arrays.asList(
                new House("123 Oak Street", true, 5),
                new House("356 Flat Street", false, 0),
                new House("160 Oak Drive", true, 3),
                new House("1055 Pine Street", false, 0),
                new House("450 Colby Street", true, 2)
        );

        Person Bob = new Person("Bob", "Elmo");
        Person Travis = new Person("Travis", "Harry Potter");
        Person Leah = new Person("Leah", "a yellow stoplight");
        Person Charlie = new Person("Charlie", "Jesus");
        Person Amie = new Person("Amie", "witch");

        for (House house : houses) {
            Bob.visitHouse(house);
            Travis.visitHouse(house);
            Leah.visitHouse(house);
            Charlie.visitHouse(house);
            Amie.visitHouse(house);
        }

        printResults(Bob);
        printResults(Travis);
        printResults(Leah);
        printResults(Charlie);
        printResults(Amie);
    }
}
