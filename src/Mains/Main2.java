package Mains;

import builders.NiglioAppBuilder;
import models.NiglioApp;

public class Main2 {
	public static void main(String[] args) {
	
	
	NiglioAppBuilder builder = new NiglioAppBuilder();
	
	
	NiglioApp app = builder.addController("auto",carController);		
	
	
	}
}
