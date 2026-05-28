package Parser;

import utils.Product;
import interfaces.Parser;

public class ProductParser implements Parser<Product> {
	
    public ProductParser() {
		super();

	}

	@Override
    public Product parse(String texto) {

        String[] atributos = texto.split("&");

        String color = "";
        double price = 0;
    	String name = "";

        for(String atributo : atributos) {

            String[] keyValue = atributo.split("=");

            String key = keyValue[0];
            String value = keyValue[1];

            if(key.trim().toLowerCase().equals("nombre")) {

                name = value;
            }
            if(key.trim().toLowerCase().equals("color")) {

                color = value;
            }

            if(key.trim().toLowerCase().equals("precio")) {

            	price = Double.parseDouble(value);
            }
        }

        return new Product(name,color, price);
    }
}