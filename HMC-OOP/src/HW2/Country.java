package HW2;

public class Country implements Measurable {
    private final double area;

    public Country(double area) {
        this.area = area;
    }

    public double getMeasure() {
        return this.area;
    }
}
