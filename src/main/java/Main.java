import jsonfromscanner.Animal;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate birthDate = LocalDate.of(1989, 9, 6);
        System.out.println(birthDate);

        System.out.println(localDate.plusWeeks(3));


        Animal elephant = new Animal("Per", 76);
        Animal dog = new Animal("Rio", 9);

        Map<String, Animal> animalMap = new HashMap<>();
        animalMap.put(elephant.getName(), elephant);
        animalMap.put(dog.getName(), dog);

        /*System.out.println(animalMap.containsKey("Per"));
        System.out.println(animalMap.containsValue(dog));*/

        Map<Integer, String> wordsMap = new HashMap<>();
        wordsMap.put(34, "Mer ord");
        wordsMap.put(1, "Ord");
        wordsMap.put(5, "Massa ord nu");

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Two", "Två");
        linkedHashMap.put("Seven", "Sju");
        linkedHashMap.put("One", "Ett");

        Set<Map.Entry<String, String>> entriesLinked = linkedHashMap.entrySet();
        for (Map.Entry<String, String> entry : entriesLinked) {
            //System.out.println(entry.getValue());
        }


        Set<Map.Entry<Integer, String>> entries = wordsMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            //System.out.println(entry.getKey());
        }

        /*for (Planet planet : Planet.values()) {
            System.out.println(planet.getName());
        }*/

        //System.out.println(Planet.NEPTUNE.getEarthDaysForYear());

        /*Scanner scanner = new Scanner(System.in);
        showMenuChoice();
        String choice = scanner.nextLine();
        printInfoAboutChosenDay(choice);*/
    }

    static void printInfoAboutChosenDay(String choice) {
        for (WeekDay day : WeekDay.values()) {
            if (choice.equalsIgnoreCase(day.getDayName())) {
                System.out.println(day.getDayName());
                System.out.println(day.getColour());
            }
        }
    }

    static void showMenuChoice() {
        System.out.println("Vilken dag vill du se information om?");
        int counter = 1;
        for (WeekDay day : WeekDay.values()) {
            System.out.println(counter + ". " + day.getDayName());
            counter++;
        }
    }

    static void printInfoAboutWeekDay(WeekDay weekDay) {
        switch (weekDay) {
            case MONDAY:
                System.out.println(weekDay.getDayName() + " är en vardag!");
                System.out.println("Färgen på den här dagen är " + weekDay.getColour());
                break;
            case TUESDAY:
                System.out.println(weekDay.getDayName() + " är en vardag!");
                break;
            case WEDNESDAY:
                System.out.println(weekDay.getDayName() + " är en vardag!");
                break;
            case THURSDAY:
                System.out.println(weekDay.getDayName() + " är en vardag!");
                break;
            case FRIDAY:
                System.out.println(weekDay.getDayName() + " är en vardag!");
                break;
            case SATURDAY:
                System.out.println(weekDay.getDayName() + " är en helgdag!");
                break;
            case SUNDAY:
                System.out.println(weekDay.getDayName() + " är en helgdag!");
                break;
        }
    }
}
