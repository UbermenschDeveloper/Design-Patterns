package builder.directors;

import builder.builders.Builder;

// Only a director knows how to build different kinds of cars
public class Director {

    // The director just tells some builder what is a sport car
    public void buildSportCar(Builder builder) {
        builder.init();
        builder.setSeats(2);
        builder.setRoof(true);
        builder.setVIN("sportCartVin");
        builder.setTripComputer();
    }

    // The director just tells some builder what is a sedan
    public void buildSedan(Builder builder) {
        builder.init();
        builder.setSeats(5);
        builder.setRoof(true);
        builder.setVIN("sedanCarVin");
    }
}
