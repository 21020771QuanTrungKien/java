public class Car extends Vehicle{
    private int numberOfDoors;

    /**
     * Car.
     */
    public Car(String brand, String model,
               String registrationNumber, Person owner, int numberOfDoors) {
        setBrand(brand);
        setModel(model);
        setRegistrationNumber(registrationNumber);
        setOwner(owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * getinfo.
     * @return String
     */
    public String getInfo() {
        String s = new String("Car:");
        s += "\n\tBrand: " + brand;
        s += "\n\tModel: " + model;
        s += "\n\tRegistration Number: " + registrationNumber;
        s += "\n\tNumber of Doors: " + numberOfDoors;
        s += "\n\tBelongs to " + owner.getName();
        s += " - " + owner.getAddress();
        return s;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
