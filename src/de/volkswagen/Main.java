package de.volkswagen;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		LocalDate haltbarkeit = LocalDate.of(2023, 6, 20);
		Drinks getraenk = new Drinks("cola", haltbarkeit, false);

		System.out.println(getraenk.toString());

		
		
		
		
		
		Fruit apple = new Fruit("Apfel", LocalDate.of(2023, 6, 30));
		Fruit banana = new Fruit("Banane", LocalDate.of(2023, 6, 25));
		Fruit orange = new Fruit("Orange", LocalDate.of(2023, 7, 5));

		
		Basket basket = new Basket();
		basket.add(apple, banana, orange);

	
		basket.remove(banana);


		System.out.println("Basket contains Orange: " + basket.contains(orange));

	
		List<Fruit> content = basket.getContent();
		System.out.println("Basket content:");
		for (Fruit fruit : content) {
			System.out.println(fruit);
		}

	}

}
