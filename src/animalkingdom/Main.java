package animalkingdom;
import java.util.*;

public class Main {
    public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester)
    {
        for (Animal a : animals)
        {
            if(tester.test(a))
            {
                System.out.println(a.getName() + " " + a.reproduce() + " " + a.breath() + " " + a.getYearDiscovered());
            };
        }
    }
    public static void main(String[] args)
    {
        

        //creating an empty array list
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        //actually animals in the arraylist
        animalArrayList.add(new Mammal("Panda", 1869));
        animalArrayList.add(new Mammal("Zebra", 1778));
        animalArrayList.add(new Mammal("Koala", 1816));
        animalArrayList.add(new Mammal("Sloth", 1804));
        animalArrayList.add(new Mammal("Armadillo", 1758));
        animalArrayList.add(new Mammal("Racoon", 1758));
        animalArrayList.add(new Mammal("Bigfoot", 2021));

        animalArrayList.add(new Bird("Pigeon", 1837));
        animalArrayList.add(new Bird("Peacock", 1821));
        animalArrayList.add(new Bird("Toucan", 1758));
        animalArrayList.add(new Bird("Parrot", 1824));
        animalArrayList.add(new Bird("Swan", 1758));

        animalArrayList.add(new Fish("Salmon", 1758));
        animalArrayList.add(new Fish("Catfish", 1817));
        animalArrayList.add(new Fish("Perch", 1758));

        // List all the animals in descending order by year named
        System.out.println("descending year disc");
        animalArrayList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
        System.out.println(animalArrayList.toString());
        System.out.println();

        System.out.println("alphabatically");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animalArrayList.toString());
        System.err.println();
        //List alphabetically only those animals that were named in 1758 
        System.out.println("alphabetically in 1758 ");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalArrayList, (a1) -> (a1.getYearDiscovered() == 1758));

        System.out.println("ordered by move");
        animalArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animalArrayList.toString());
        System.out.println();

        System.out.println(" lungs ");
        printAnimals(animalArrayList, (a1) -> a1.breath() == "lungs");
        System.out.println();

        System.out.println("breath with lungs and 1758");
        printAnimals(animalArrayList, a -> a.breath() == "lungs" && a.getYearDiscovered() == 1958);
        System.out.println();

        System.out.println();
        System.out.println("only those animals that lay eggs and breath with lungs");
        printAnimals(animalArrayList, a-> (a.reproduce() == "eggs" && a.breath() == "lungs"));

        System.out.println();
        System.out.println("alphabetically only those animals that were named in 1758");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalArrayList, a -> (a.getYearDiscovered() == 1758));

        System.out.println();
        System.out.println("Stretch Goal\n");
        System.out.println("alphabetically only those that are Mammals");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalArrayList, a -> (a instanceof Mammal));
    }

}