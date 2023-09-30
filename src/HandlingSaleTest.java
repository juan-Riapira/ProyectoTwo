import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import logic.HandlingSale;
import logic.Product;

class HandlingSaleTest {
	private HandlingSale handlingSale;

	@Test

	void setUp() {
		ArrayList<Product> Products = new ArrayList<>();
		Products.add(new Product("sda", "dasd", 5.1, 45, LocalDate.of(2003, 12, 4)));

	}
	@Test
	void testAddProduct() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("5", "dasd", 5.1, 45, LocalDate.of(2003, 12, 4)));
		HandlingSale ha = new HandlingSale(products);
		
		//ha.addProduct(new Product("da","da",4.2,45,LocalDate.of(2003, 12, 4)));
	
		assertEquals(true, ha.addProduct(new Product("da","da",4.2,45,LocalDate.of(2003, 12, 4))));

	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testFindProducts() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("5", "dasd", 5.1, 45, LocalDate.of(2003, 12, 4)));
		
		HandlingSale ha = new HandlingSale(products);
		assertEquals(products.get(0), ha.findProducts("5"));
	}

	@Test
	void testSaveBills() {
		fail("Not yet implemented");
	}

	@Test
	void testAddSale() {
		fail("Not yet implemented");
	}

}
