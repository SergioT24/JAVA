package controllers; 

import interfaces.Controller;
import models.Request;
import utils.Car;

public class CarController implements Controller {
	
	
    @Override
    public String procesar(Request request) {
		

        String action = request.getAccion();

        Car vehicle = (Car) request.getParams();

        switch(action.toLowerCase()) {

            case "alta":

                return 
                    "Alta del producto: " +vehicle;


            case "baja":

                return
                    "Baja del producto "+vehicle;


            case "editar":

                return
                    "Editar producto "+vehicle;

            default:

                throw new RuntimeException(
                        "Accion no soportada");
        }
    }
}