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
            
            if(keyValue.length < 2)
            {
            	throw new IllegalArgumentException("Formato inválido en atributo: " + atributo);
            }
            String key = keyValue[0];
            String value = keyValue[1];

            if(key.trim().toLowerCase().equals("nombre")) {

                name = value;
            }
            if(key.trim().toLowerCase().equals("color")) {

                color = value;
            }

            if(key.trim().toLowerCase().equals("precio")) {
            	try {
            	    price = Double.parseDouble(value);
            	} catch (NumberFormatException e) {
            	    throw new IllegalArgumentException("Precio inválido: " + value);
            	}
            }
        }

        return new Product(name,color, price);
    }
}