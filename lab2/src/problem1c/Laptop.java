package problem1c;
import java.util.Objects;

public class Laptop {
	private String brand;
    private String model;

    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Laptop laptop = (Laptop) o;

        return Objects.equals(brand, laptop.brand) &&
               Objects.equals(model, laptop.model);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
