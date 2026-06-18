package Mains;

import Parser.ProductParser;
import Parser.CarParser;
import comunicators.ConsoleComunicator;
import controllers.CarController;
import controllers.ProductController;
import interfaces.Comunicator;
import interfaces.Controller;
import models.SesionInicial;
import utils.ControllerLocator;
import utils.DatosSesion;
import utils.ServiceLocator;

public class Main {

	public static void main(String[] args) {

		ControllerLocator controllerLocator = new ControllerLocator();
		Comunicator comunicator = new ConsoleComunicator();
		ServiceLocator selo = new ServiceLocator();
		DatosSesion nameSesion = new DatosSesion();
		Controller controllerProduct = new ProductController();
		Controller controllerCar = new CarController();

		selo.register("producto", new ProductParser());
		selo.register("auto", new CarParser());

		controllerLocator.registerController("auto", controllerCar);
		controllerLocator.registerController("producto", controllerProduct);

		boolean aplicacionActiva = true;

		while (aplicacionActiva) {

			comunicator.enviar("¿Deseas iniciar sesion?");
			comunicator.enviar("1- iniciar sesion");
			comunicator.enviar("2- Salir del programa");

			String respuesta = comunicator.recibir();
			while ((!respuesta.equals("1")) && (!respuesta.equals("2"))) {
				comunicator.enviar("Ingrese una opción");
				comunicator.enviar("1- iniciar sesion");
				comunicator.enviar("2- Salir del programa");
				respuesta = comunicator.recibir();
			}
			if (respuesta.equals("2")) {
				comunicator.enviar("El programa ha finalizado.");
				return;
			} else if (respuesta.equals("1")) {
				
				SesionInicial sesion = new SesionInicial(controllerLocator, comunicator, selo, nameSesion);
				Thread t = new Thread(sesion);
				t.start();
				try {
					t.join();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		}
	}
}