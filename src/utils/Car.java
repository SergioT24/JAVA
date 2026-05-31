package utils;

public class Car {
	
	private String id;
	private String model;
	private String brand;
	private String color;
	private double price;
	private int stock;

	public Car(String model,String brand,String color, Double price) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marca: "+this.getBrand() +"Modelo: "+this.getModel()+" Color: "+this.getColor()+" Precio: $"+this.getPrice();
	}
	
}
