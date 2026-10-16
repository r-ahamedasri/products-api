package uk.ac.westminster.lecture4.dto;

public class PhysicalProduct extends Product{
    private Double weightKg;
    private String dimensions;

    public PhysicalProduct(Long id, String name, Double price, Double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public void displayDetails() {
        System.out.println("Shippable product");
    }
}
