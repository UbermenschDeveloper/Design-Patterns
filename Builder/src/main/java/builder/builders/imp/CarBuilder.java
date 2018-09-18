package builder.builders.imp;

import builder.builders.Builder;
import builder.models.Car;

// Car builder knows nothing of what kind of car he is building
public class CarBuilder implements Builder<Car> {

    private Car car;

    public void init() {
        this.car = new Car();
    }

    public void setSeats(int number) {
        this.car.setSeatsNumber(number);
    }

    public void setRoof(boolean isCabriolet) {
        this.car.setRoof(isCabriolet);
    }

    public void setVIN(String engineCode) {
        this.car.setVIN(engineCode);
    }

    public void setTripComputer() {
        this.car.setTripComputer();
    }

    public Car getResult() {
        return this.car;
    }
}
