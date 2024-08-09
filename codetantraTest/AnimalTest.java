package codetantraTest;
class Animal{
    void move(){
        System.out.println("Animal Move");
    }
    void makeSound(){
        System.out.println("Animal Make Sound");
    }
}
class Bird extends Animal{
    void move(){
        System.out.println("Bird Move");
    }
    void makeSound(){
        System.out.println("Bird Make Sound");
    }
}
class Panthera extends Animal{
    void move(){
        System.out.println("Panthera Move");
    }
    void makeSound(){
        System.out.println("Panthera Make Sound");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("Here we can check the Function Overriding:->");
        Animal b1 = new Bird();
        b1.move();
        b1.makeSound();
        Animal p1 = new Panthera();
        p1.move();
        p1.makeSound();
    }
    
}
