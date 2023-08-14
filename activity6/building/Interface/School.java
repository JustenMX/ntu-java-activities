package activity6.building.Interface;

public class School implements Building {
    private String name;
    private int numberOfFloors;
    private String address;

    // Constructor
    public School(String name, String address) {
        this.name = name;
        this.numberOfFloors = 0;
        this.address = address;
    }

    // Setters & Getters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Methods

    @Override
    public void addFloor(int floors) {
        numberOfFloors += floors;
    }

    @Override
    public void describe() {
        System.out.println("School Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("The number of floors: " + numberOfFloors);
    }

}
