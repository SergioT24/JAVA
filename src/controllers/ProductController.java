package controllers;

import interfaces.Controlador;
import models.Request;
import utils.Product;

public class ProductController implements Controlador {

    @Override
    public void procesar(Request request) {

        String action = request.getAccion();

        Product product = (Product) request.getData();

        switch(action) {

            case "alta":

                System.out.println(
                    "Alta del producto: " + product);

                break;

            case "baja":

                System.out.println(
                    "Baja del producto "+product);

                break;

            case "editar":

                System.out.println(
                    "Editar producto");

                break;

            default:

                throw new RuntimeException(
                        "Accion no soportada");
        }
    }
}