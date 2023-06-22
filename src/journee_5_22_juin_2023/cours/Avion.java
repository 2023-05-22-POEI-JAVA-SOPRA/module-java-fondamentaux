package journee_5_22_juin_2023.cours;

public class Avion {
    private String make;
    private String model;
    private int numberOfSeats;
    private int yearOfMake;

    public Avion(String make, String model, int numberOfSeats, int yearOfMake) {
        this.make = make;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.yearOfMake = yearOfMake;
    }

    // Accesseurs
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    // Setters
    public void setMake(String make){
        this.make=make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
}
