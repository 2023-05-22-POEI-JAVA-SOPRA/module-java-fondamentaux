package journee_5_22_juin_2023.cours;

public class Avion {
    private String make;
    private String model;
    private int numberOfSeats;
    private int yearOfMake;

    public Avion(String make,String model,int numberOfSeats,int yearOfMake){
        // Shadowing
        this.make=make;
        this.model=model;
        this.numberOfSeats=numberOfSeats;
        this.yearOfMake=yearOfMake;
    }

    // Accesseurs ou getters

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getNumberOfSeats(){
        return numberOfSeats;
    }

    public int getYearOfMake(){
        return yearOfMake;
    }
}
