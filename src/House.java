import java.util.Arrays;

public class House {
    private int floorNumber;
    private String address;
    private String[] residentsNames;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }

    public void getDetails(){
        System.out.println("The address is "+address + " the floor number are  "+ floorNumber+" The name of the residents are "+ Arrays.toString(residentsNames));
    }
}
