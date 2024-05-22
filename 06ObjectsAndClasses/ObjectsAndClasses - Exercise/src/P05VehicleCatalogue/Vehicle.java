package P05VehicleCatalogue;

import java.text.Format;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString (){

        if (getType().equals("car")) {

            return String.format("Type: Car%nModel: %s%nColor: %s%nHorsepower: %d", getModel(), getColor(), getHorsePower());

        }else {

        return String.format("Type: Truck%nModel: %s%nColor: %s%nHorsepower: %d", getModel(), getColor(), getHorsePower());

        }
    }
}
