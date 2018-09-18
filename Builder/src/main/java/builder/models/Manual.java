package builder.models;

import java.util.HashMap;

/* Dumb manual model.
 * Has some encapsulated basic state and methods to change it.
 * toString() is overrode
 */
public class Manual {
    private String title;
    private HashMap<String, String> specification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashMap<String, String> getSpecification() {
        return specification;
    }

    public void setSpecification(HashMap<String, String> specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Manual for " + title + "\n" +
                specification + "\n";
    }
}
