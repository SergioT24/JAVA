package Parser;

import utils.Car;
import utils.Product;
import interfaces.Parser;

public class CarParser implements Parser<Car> {
	
    public CarParser() {
		super();

	}

	@Override
    public Car parse(String texto) {

        String[] atributos = texto.split("&");

        String color = "";
        double price = 0;
    	String model = "";
    	String brand = "";

        for(String atributo : atributos) {

            String[] keyValue = atributo.split("=");

            if(keyValue.length < 2)
            {
            	throw new IllegalArgumentException("Formato inválido en atributo: " + atributo);
            }
            String key = keyValue[0];
            String value = keyValue[1];

            if(key.trim().toLowerCase().equals("marca")) {

                brand = value;
            }
            if(key.trim().toLowerCase().equals("modelo")) {

                model = value;
            }
            if(key.trim().toLowerCase().equals("color")) {

                color = value;
            }

            if(key.trim().toLowerCase().equals("precio")) {

            	price = Double.parseDouble(value);
            }
        }

        return new Car(model,brand,color, price);
    }
}