public class Lion extends Animal{
    public Lion(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
    public void hunt(){
        System.out.println("GRRR");
    }

}
