	package controllers;
	
	import interfaces.Controller;
	import models.Request;
	import utils.Product;
	
	public class ProductController implements Controller {
	
	    @Override
	    public String procesar(Request request) {
	
	        String action = request.getAccion();
	
	        Product product = (Product) request.getParams();
	
	        switch(action.toLowerCase()) {
	
	            case "alta":
	
	                return
	                    "Alta del producto: " + product;
	            case "baja":
	                return
	                    "Baja del producto "+product;
	            case "editar":
	                return
	                	"Editar producto "+ product;
	            default:
	            	throw new RuntimeException("Accion no soportada");
	        }
	    }
	}