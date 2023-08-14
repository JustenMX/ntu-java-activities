package activity6.building.pojo;

public class Teacher extends Person {

    private String subject;

    // Constructor
    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    // Getters and Setters

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + getName() + " and I will be teaching you " + subject);
    }

}
