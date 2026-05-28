package utils;

public class Product {
	
	private String id;
	private String name;
	private String color;
	private double price;
	private int stock;

	public Product(String name,String color, Double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Nombre: "+this.getName()+" Color: "+this.getColor()+" Precio: $"+this.getPrice();
	}
	
	/*
	 * Protocolo 1:
	 *producto/editar?color=rojo&stock=4
	 *Protocolo 2:
	 *producto/eliminar?color=rojo&stock=4
	 *Protocolo 3:
	 *producto/agregar?color=verde&stock=4
	 *
	 * Protocolo 4:
	 *producto/editar?stock=4
	 *Protocolo 5:
	 *producto/eliminar?stock=4
	 *Protocolo 6:
	 *producto/agregar?stock=4:
	 *
	 * Protocolo 7:
	 *producto/editar?color=verde
	 *Protocolo 8:
	 *producto/eliminar?color=verde
	 *Protocolo 9:
	 *producto/agregar?color=verde
	 */
	
	
}
