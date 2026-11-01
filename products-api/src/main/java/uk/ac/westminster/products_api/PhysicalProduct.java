package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimentions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimentions;
        this.discountedPrice = price;
    }
    @Override
    public String getSummary(){
        return "physical:" + getName() +"(" + weightKg + "kg";
    }

    @Override
    public void applyDiscount(double rate){
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1- capped);
    }

    @Override
    public double getDiscountedPrice(){
        return discountedPrice;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public void setWeightKg(double weightKg){
        this.weightKg = weightKg;
    }

    public String getDimensions(){
        return dimensions;
    }

    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }

}
