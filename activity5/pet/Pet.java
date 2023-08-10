package activity5.pet;

public class Pet {
    private String name;
    private String breed;
    private String gender;
    private int age;
    private boolean isVaccinated;

    // empty constructor
    public Pet() {
        //
    }

    // parameterized constructor
    public Pet(String name, String breed, String gender, int age, boolean isVaccinated) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.isVaccinated = isVaccinated;

    }

    // getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    // Methods

    public void call(String sound) {
        System.out.println(sound);
        System.out.println(sound);
        System.out.println(sound);
    }

    public void eat(String food) {
        System.out.println(this.name + " loves eating " + food);
    }

    public void sleep() {
        System.err.println(this.name + " is currently sleeping");
    }

}
