package builder;

import builder.builders.Builder;
import builder.directors.Director;
import builder.models.Car;
import builder.models.Manual;

public class Garage {
    private Director director;
    private Builder<Car> carBuilder;
    private Builder<Manual> manualWriter;

    Garage(Director director, Builder<Car> carBuilder, Builder<Manual> manualWriter) {
        this.director = director;
        this.carBuilder = carBuilder;
        this.manualWriter = manualWriter;
    }

    public Car buildSportCar() {
        this.director.buildSportCar(carBuilder);
        return carBuilder.getResult();
    }

    public Manual writeSportCarManual() {
        this.director.buildSportCar(manualWriter);
        return manualWriter.getResult();
    }

    public Car buildSedan() {
        director.buildSedan(carBuilder);
        return carBuilder.getResult();
    }

    public Manual writeSedanManual() {
        director.buildSedan(manualWriter);
        return manualWriter.getResult();
    }
}
