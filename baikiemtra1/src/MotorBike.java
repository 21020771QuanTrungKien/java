public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor.
     */
    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner,
                     boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Func.
     */
    public String getInfo() {
        String s = new String("Motor Bike:");
        s += "\n\tBrand: " + brand;
        s += "\n\tModel: " + model;
        s += "\n\tRegistration Number: " + registrationNumber;
        s += "\n\tHas Side Car: " + hasSidecar;
        s += "\n\tBelongs to " + owner.getName();
        s += " - " + owner.getAddress();
        return s;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
