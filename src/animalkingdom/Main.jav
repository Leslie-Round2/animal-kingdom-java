package animalkingdom;
import java.util.*;

public class Main {
    
    public static void main(String[], args)
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

        

    }

}