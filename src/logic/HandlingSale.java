package logic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HandlingSale {

	private Detail detail;
	private ArrayList<Product> products;

	public HandlingSale(ArrayList<Product> products) {
		this.products=products;
	}
	public HandlingSale() {
		products = new ArrayList<>();
	}

	public boolean addProduct(Product product) {
		if (findProducts(product.getIdProduct())== null) {
			products.add(product);
			return true;
		}

		return false;
	}

	public Product delete(String idProduct) {

		return null;
	}

	public Product update(String idProduc, short stock) {
		
		
		return null;
	}

	public Product findProducts(String idProduct) {

		for (int i = 0; i < products.size(); i++) {
			if (idProduct.equals(products.get(0).getIdProduct())) {
				return products.get(i);
			}
		}
		return null;

	}

	public void saveBills(Bill bill) {
		ArrayList<Bill> bills= new ArrayList<Bill>();
		bills.add(bill);
		
	}
	public Bill findBill(String id) {
		
		
		return null ;
	}

	public boolean addSale(String description, short cant) {
		return false;
	}
}
