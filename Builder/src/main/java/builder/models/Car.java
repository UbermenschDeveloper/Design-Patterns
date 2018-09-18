package builder.models;

/* Dumb car model.
 * Has some encapsulated basic state and methods to change it.
 * toString() is overrode
 */
public class Car {
    private int seatsNumber;
    private boolean hasRoof;
    private String vin;
    private boolean hasTripComputer;

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public boolean hasRoof() {
        return hasRoof;
    }

    public void setRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public String getVIN() {
        return vin;
    }

    public void setVIN(String vin) {
        this.vin = vin;
    }

    public boolean hasTripComputer() {
        return hasTripComputer;
    }

    public void setTripComputer() {
        this.hasTripComputer = true;
    }

    @Override
    public String toString() {
        return "Car {" +
                "seatsNumber=" + seatsNumber +
                ", hasRoof=" + hasRoof +
                ", vin='" + vin + '\'' +
                ", hasTripComputer=" + hasTripComputer +
                '}' + "\n";
    }
}
