public class Monkey extends Animal implements Trainable {
    public Monkey(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Ooh ooh aah aah");
    }

    public void banana() {
        System.out.println("heheee");
    }

    @Override
    public void performTrick() {
        System.out.println("jumps on the walls");
    }
}
