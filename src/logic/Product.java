package logic;

import java.time.LocalDate;

public class Product {

	private String idProduct;
	private String description;
	private double value;
	private int stock;
	public static final byte STOCK_MIN = 5;
	private LocalDate dateExpired;
	
	private ETypeProduct eTypeProduct;

	public Product() {

	}

	public Product(String idProduct, String description, double value, int stock, LocalDate dateExpired) {
		super();
		this.idProduct = idProduct;
		this.description = description;
		this.value = value;
		this.stock = stock;
		this.dateExpired = dateExpired;
	}

	public boolean isExpired() {
		return false;
	}
	
	public double calcIva() {
		return 0.0;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getStock() {
		return stock;
	}

	public LocalDate getDateExpired() {
		return dateExpired;
	}

	public void setDateExpired(LocalDate dateExpired) {
		this.dateExpired = dateExpired;
	}
	
	public ETypeProduct geteTypeProduct() {
		return eTypeProduct;
	}

	public void seteTypeProduct(ETypeProduct eTypeProduct) {
		this.eTypeProduct = eTypeProduct;
	}


	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", description=" + description + ", value=" + value + ", stock="
				+ stock + ", STOCK_MIN=" + STOCK_MIN + ", dateExpired=" + dateExpired + ", eTypeProduct=" + eTypeProduct
				+ "]";
	}
	

}
