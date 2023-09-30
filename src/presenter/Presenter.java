package presenter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import logic.HandlingSale;
import logic.Product;

public class Presenter {

	private HandlingSale handlingSale;
	
	public Presenter() {
		handlingSale= new HandlingSale();
	}

	public boolean addProduct(Product product) {

		boolean addProduct = handlingSale.addProduct(product);
		if (addProduct == true) {
			return true;
		}

		return false;
	}

	public ArrayList<String> findProduct(String idProduct) {
		Product pro = handlingSale.findProducts(idProduct);
		ArrayList<String > date= new ArrayList<>();
		date.add(pro.getIdProduct());
		date.add(pro.getDescription());
		date.add(String.valueOf(pro.getValue()) );
		date.add(String.valueOf(pro.getStock()) );
		date.add(pro.getDateExpired().toString());
	
		return date;
	}

}