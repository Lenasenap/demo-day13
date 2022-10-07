package jsonfromscanner;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1. Hämta all data från min JSON-fil
        // 2. Spara det i en lista (den här listan kan vi INTE förändra på något sätt)
        // 3. Lägg till allting från listan på steg 2 i en lista som KAN FÖRÄNDRAS (*)
        // 4. Hämta in data från en användare om ett nytt djur
        // 5. Spara den datan på ett Animal-objekt
        // 6. Lägg till Animal-objektet i listan som KAN FÖRÄNDRAS (listan på steg 3) (*)
        // 7. Spara ner listan som KAN FÖRÄNDRAS (*)


        Scanner scanner = new Scanner(System.in);
        List<Animal> animals;
        List<Animal> tempAnimals = new ArrayList<>(); // (*)
        ObjectMapper mapper = new ObjectMapper();
        // TODO varför fick jag inte importera Animal när klassen låg en mapp ovanför....
        Animal animal = new Animal();

        // Steg 1 och 2
        animals = List.of(mapper.readValue(Paths.get("animals.json").toFile(), Animal[].class));

        // Steg 3
        tempAnimals.addAll(animals); // (*)


        System.out.println("Skriv in ett namn:");
        // Steg 4
        String name = scanner.nextLine();

        // Steg 5
        animal.setName(name);


        System.out.println("Skriv in en ålder");
        // Steg 4
        int age = scanner.nextInt();

        // Steg 5
        animal.setAge(age);

        // Steg 6
        tempAnimals.add(animal); // (*)

        // Steg 7
        mapper.writeValue(Paths.get("animals.json").toFile(), tempAnimals);

    }
}
