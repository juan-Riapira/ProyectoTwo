package logic;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bill {

	private String number;
	private LocalDate dateBill;
	
	private ArrayList<Detail> details;

	public Bill(String number, LocalDate dateBill) {
		super();
		this.number = number;
		this.dateBill = dateBill;
		details= new ArrayList<>();
	}

	public double calcTotal() {
		return 0.0;
	}

	public boolean addDetails(Product product, short cant) {
		return false;
	}

	public ArrayList<Product> getDetails() {
		return null;
	}

}
