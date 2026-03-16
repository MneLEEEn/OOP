package problem1c;

import java.util.Objects;

public class GamingLaptop extends Laptop {

    private String gpu;

    public GamingLaptop(String brand, String model, String gpu) {
        super(brand, model);
        this.gpu = gpu;
    }

    public String getGpu() {
        return gpu;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        GamingLaptop that = (GamingLaptop) o;

        return Objects.equals(gpu, that.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gpu);
    }

    @Override
    public String toString() {
        return super.toString() + " GPU: " + gpu;
    }
}