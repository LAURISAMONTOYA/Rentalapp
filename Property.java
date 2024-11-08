
public class Property {
    private int id;
    private String address;
    private double rentAmount;
    private boolean isRented;

    public Property(int id, String address, double rentAmount) {
        this.id = id;
        this.address = address;
        this.rentAmount = rentAmount;
        this.isRented = false;
    }

    public void rentProperty() {
        this.isRented = true;
    }

    public void vacateProperty() {
        this.isRented = false;
    }

    // Getters and setters for each property
}
