package Mains;
import builders.NiglioAppBuilder;
import models.NiglioApp;

public class Main2 {
		public static void main(String[] args) {
		// Construcción e inicialización completa de la aplicación
			NiglioApp app = new NiglioAppBuilder()
					// Registro de recursos y sus respectivos controladores/parsers
					.addController("producto", new ProductController())
					.addParser("producto", new ProductParser())
				
					.addController("auto", new CarController())
					.addParser("auto", new CarParser())
				
					// Inicialización del administrador de usuarios
					.useUserManager(new DefaultUserManager())
				
					// Configuración del medio de comunicación (Consola / Socket)
					.useConsole()
				
					// Construcción final de la aplicación
					.build();
			
			// Inicio de la aplicación
			app.start();
		}
	}
