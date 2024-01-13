package DefiningClasses;

public class Car {

    private String brand;
    private String model;
    private int horsePower;

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

    public void setHorsePower(int newHorsePower) {
        horsePower = newHorsePower;
    }
    
    public int getHorsePower() {
        return horsePower;
    }
}
