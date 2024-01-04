import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * add vehicle.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove.
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle i : vehicleList) {
            if(i.registrationNumber.equals(registrationNumber)) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * infor
     */
    public String getVehicleInfo() {
        String s = "";
        if(vehicleList == null) {
            s = s + getName() + " has no vehicle!";
        } else {
            s = s + getName() + " has:\n";
            for (Vehicle i : vehicleList) {
                s = s + "\n" + i.getInfo();
            }
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
