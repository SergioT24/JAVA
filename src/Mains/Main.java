package Mains;

import Parser.ProductParser;
import comunicators.ConsoleComunicator;
import controllers.ProductController;
import interfaces.Comunicador;
import interfaces.Controlador;
import models.SesionInicial;
import utils.DatosSesion;
import utils.ParserRouter;

public class Main {

	public static void main(String[] args) {

		ParserRouter router = new ParserRouter();
		DatosSesion nameSesion = new DatosSesion();
		router.registrar("producto", new ProductParser());

		Comunicador comunicador = new ConsoleComunicator();

		Controlador controlador = new ProductController();
		

		SesionInicial sesion = new SesionInicial(controlador, comunicador, router,nameSesion);

		sesion.run();
	}
}