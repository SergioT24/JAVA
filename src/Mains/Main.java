package Mains;

import Parser.ProductParser;
import Parser.CarParser;
import comunicators.ConsoleComunicator;
import controllers.CarController;
import controllers.ProductController;
import interfaces.Comunicator;
import interfaces.Controlador;
import models.SesionInicial;
import utils.DatosSesion;
import utils.ServiceLocator;

public class Main {

	public static void main(String[] args) {

		ServiceLocator router = new ServiceLocator();
		DatosSesion nameSesion = new DatosSesion();
		router.registrar("Producto", new ProductParser());
		router.registrar("Auto", new CarParser());
		
		Comunicator comunicador = new ConsoleComunicator();

		Controlador controladorProducto = new ProductController();
		Controlador controladorAuto = new CarController();
		

		SesionInicial sesionProducto = new SesionInicial(controladorProducto, 
				comunicador, router,nameSesion);

		SesionInicial sesionAuto = new SesionInicial(controladorAuto, 
				comunicador, router,nameSesion);

		//sesionProducto.run();
		sesionAuto.run();
	}
}