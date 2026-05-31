package controllers;

import interfaces.Controlador;
import models.Request;
import utils.Car;
import utils.Product;

public class CarController implements Controlador {

    @Override
    public void procesar(Request request) {

        String action = request.getAccion();

        Car vehicle = (Car) request.getData();

        switch(action.toLowerCase()) {

            case "alta":

                System.out.println(
                    "Alta del producto: " +vehicle);

                break;

            case "baja":

                System.out.println(
                    "Baja del producto "+vehicle);

                break;

            case "editar":

                System.out.println(
                    "Editar producto "+vehicle);

                break;

            default:

                throw new RuntimeException(
                        "Accion no soportada");
        }
    }
}