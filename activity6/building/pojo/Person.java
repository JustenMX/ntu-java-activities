package activity6.building.pojo;

public class Person {
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Default Constructor
    public Person() {
        //
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Methods
    public void greet() {
        System.out.println("Nice to meet you, " + name);
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }

    public void haveBirthday() {
        age++;
        System.out.println("Hello, my age is " + age);
    }

}
