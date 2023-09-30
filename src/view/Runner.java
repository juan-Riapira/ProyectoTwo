package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import logic.Product;
import presenter.Presenter;

public class Runner {

	private Presenter presenter;
	private Scanner sc;

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.sc=new Scanner(System.in);
		
		
		
        runner.menu();
	}

	public void menu() {
	presenter = new Presenter();
	System.out.println(presenter.addProduct
(new Product("123","arroz",1400.1,12,LocalDate.of(2003, 02, 10))));
	
	for (int i= 0;i<presenter.findProduct("123").size();i++) {
		System.out.print(presenter.findProduct("123").get(i)+ "  ");
	}
	
	}
}
