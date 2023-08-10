package activity5.pet;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Roxy", "villian", "female", 5, true);
        Pet dog = new Pet("Boxer", "hero", "male", 5, false);

        cat.call("Meow");
        cat.eat("fish");
        cat.sleep();

        dog.call("Woof");
        dog.eat("Steak");
        dog.sleep();

    }

}
