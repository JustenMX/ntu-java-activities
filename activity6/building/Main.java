package activity6.building;

import activity6.building.Interface.School;
import activity6.building.pojo.Student;
import activity6.building.pojo.Teacher;

public class Main {
    public static void main(String[] args) {
        // School
        School schoolOne = new School("NTU", "Nanyang Drive");
        // Teacher
        Teacher teacherOne = new Teacher("Arnold", 29, "Male", "History");
        //
        Student studentOne = new Student("Robert", 18, "male", 5);
        Student studentTwo = new Student("Iris", 18, "Female", 4);

        schoolOne.addFloor(6);
        schoolOne.describe();
        teacherOne.introduce();
        studentOne.introduce();
        studentTwo.introduce();

    }
}
