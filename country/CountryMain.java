package country;

//main class for testing country
import java.util.*;

class CountryMain {
	public static void main(String args[]) throws Exception {
		// created array of objects for storing info of diff cities

		Scanner sc = new Scanner(System.in);
		// data of how many countries do you want?
		System.out.println("Enter number of records you want to enter : ");
		int num = sc.nextInt();
		Country[] country = new Country[num];

		int i = 0, j = 0, k = 0;

		// array to store name,population,area
		String name[] = new String[num];
		double population[] = new double[num];
		double area[] = new double[num];

		// take input from user
		for (i = 0; i < num; i++) {
			System.out.println("Enter details of Country " + (i + 1) + " : 1. Name 2. Population & 3. Area ");
			name[i] = sc.next();
			population[i] = sc.nextDouble();
			area[i] = sc.nextDouble();

			// array of objects
			country[i] = new Country();

			country[i].setName(name[i]);
			country[i].setPopulation(population[i]);
			country[i].setArea(area[i]);

		}

		Country country1 = new Country();
		double largestPopulation = 0, largestArea = 0;
		for (i = 0; i < num; i++) {
			largestArea = Country.largestArea(largestArea, country[i].getArea());

			largestPopulation = Country.largestPopulation(largestPopulation, country[i].getPopulation());

			country1 = Country.maxPopDensity(country1, country[i]);

		}
		System.out.println("Largest Area : " + largestArea);
		System.out.println("Largest Population : " + largestPopulation);
		System.out.println("Maximum Population Density : " + country1);

	}
}
