import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public static List<Animal> getAnimals() {
        return animals;
    }

    public static void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Elephant elephant = new Elephant("Gio", 15);
        Lion lion = new Lion("mari", 19);
        Monkey monkey = new Monkey("lasha", 20);
        addAnimal(lion);
        addAnimal(lion);
        addAnimal(elephant);
        addAnimal(monkey);
        addAnimal(new Lion("Leo", 5));
        addAnimal(new Elephant("Dumbo", 10));
        addAnimal(new Monkey("George", 3));
    }

    public void showAllSounds() {
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).makeSound();
            if (animals.get(i) instanceof Trainable) {
                ((Trainable) animals.get(i)).performTrick();
            }
        }
    }
}