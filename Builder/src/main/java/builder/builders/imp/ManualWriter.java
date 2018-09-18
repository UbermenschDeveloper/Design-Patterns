package builder.builders.imp;

import builder.builders.Builder;
import builder.models.Manual;

import java.util.HashMap;

// Manual writer knows nothing of what kind of car he is writing about
public class ManualWriter implements Builder<Manual>{

    private Manual manual;

    public void init() {
        manual = new Manual();
        manual.setSpecification(new HashMap<String, String>());
    }

    public void setSeats(int number) {
        manual.getSpecification().put("Seats", String.valueOf(number));
    }

    public void setRoof(boolean isCabriolet) {
        manual.getSpecification().put("Roof", String.valueOf(isCabriolet));
    }

    public void setVIN(String engineCode) {
        manual.setTitle(engineCode);
    }

    public void setTripComputer() {
        manual.getSpecification().put("Trip computer", String.valueOf(true));
    }

    public Manual getResult() {
        return manual;
    }
}
