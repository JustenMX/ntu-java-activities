package activity6.building.pojo;

public class Student extends Person {
    private int yrLevel;

    // Constructor
    public Student(String name, int age, String gender, int yrLevel) {
        super(name, age, gender);
        this.yrLevel = yrLevel;
    }

    // Getters and Setters
    public int getYrLevel() {
        return this.yrLevel;
    }

    public void setYrLevel(int yrLevel) {
        this.yrLevel = yrLevel;
    }

    // Methods
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + getName() + " and I am a " + yrLevel + "th year student");
    }

}
