package logic;

import java.util.ArrayList;

public class Detail {

	private short cant;
	private Product product;
	
	private Bill bill;

	public Detail(Product product,short cant) {
		this.cant = cant;
		this.product=product;
	}
	
	public double calcSubTotal() {
		return 0.0;
	}
	
	
}
