import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    public Zoo(){
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void showAllSounds(){
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).makeSound();
            if (animals.get(i) instanceof Trainable){
                ((Trainable) animals.get(i)).performTrick();
            }
        }
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Elephant elephant = new Elephant("Gio",15);
        Lion lion = new Lion("mari",19);
        Monkey monkey = new Monkey("lasha",20);
        zoo.addAnimal(lion);
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);
        zoo.showAllSounds();

    }
}