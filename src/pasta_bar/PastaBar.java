package pasta_bar;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] regularCustomers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String[] ingredients = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina",
				"Piletina", "4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix",
				"Pecurke", "Kutija" };
		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		
		System.out.println("Izvolite !!");
		
		String ingredient = "";
		double sum = 0;
		
		while(!ingredient.equals("Poruci")) {
			System.out.println("Izaberite sastojak za pastu: ");
			ingredient = s.nextLine();
			if(!ingredient.equals("Poruci")) {
				int index = findIgredient(ingredients, ingredient);
				int price = prices[index];
				sum = sum + price;
			}
		}
		
		System.out.println("Unesite vas broj telefona: ");
		String phone = s.next();
		
		boolean isRegular = isRegularCustomer(regularCustomers, phone);
		
		if(isRegular) {
			sum = sum * 0.9;
		}
		
		System.out.println("Vasa pasta iznosi " + sum + "rsd");
		System.out.println("Prijatno !!");

	}
	

}
