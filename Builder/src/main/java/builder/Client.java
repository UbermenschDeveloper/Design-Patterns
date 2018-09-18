package builder;

import builder.builders.imp.CarBuilder;
import builder.builders.imp.ManualWriter;
import builder.directors.Director;
import builder.models.Car;
import builder.models.Manual;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        // client hired a director to manage all the process
        Director director = new Director();

        // client hired a car builder to construct a car
        CarBuilder carBuilder = new CarBuilder();

        // client hired a manual writer to write specification for the car
        ManualWriter manualWriter = new ManualWriter();

        // all the process is going on in a garage, so client put all both builders and a director into garage
        Garage garage = new Garage(director, carBuilder, manualWriter);

        // client asked guys in a garage to build him a sport car
        Car sportCar = garage.buildSportCar();
        System.out.println(sportCar);

        // client also wants some docs for his new sport car
        Manual sportCarManual = garage.writeSportCarManual();
        System.out.println(sportCarManual);
    }
}
