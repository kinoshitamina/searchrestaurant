package searchrestaurant;

import java.util.ArrayList;

public class RestaurantSearch {
	private ArrayList<Restaurant> restaurants;

	public RestaurantSearch() {
		restaurants = new ArrayList<Restaurant>();
	}

	public void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}

	public void showAllRestaurants() {
		for (Restaurant restaurant : restaurants) {
			restaurant.showInfo();
		}
	}

	public void searchByGenre(String genre) {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getGenre().contains(genre)) {
				restaurant.showInfo();
			}
		}
	}

	public void searchByTitle(String title) {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getTitle().contains(title)) {
				restaurant.showInfo();
			}
		}
	}

	public void searchByMaxBudget(int maxBudget) {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getMinPrice() <= maxBudget) {
				restaurant.showInfo();
			}
		}
	}

	public void searchByWalkMinutes(int walkMinutes) {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getWalkMinutes() <= walkMinutes) {
				restaurant.showInfo();
			}
		}
	}

	public void searchByRating(double rating) {
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getRating() >= rating) {
				restaurant.showInfo();
			}
		}
	}

	public void searchRestaurants(String title, String genre, int maxBudget, int walkMinutes, double rating) {

		ArrayList<Restaurant> searchResults = new ArrayList<Restaurant>();

		for (Restaurant restaurant : restaurants) {
			if (restaurant.getTitle().contains(title)
					&& restaurant.getGenre().contains(genre)
					&& (maxBudget == 0 || restaurant.getMinPrice() <= maxBudget)
					&& (walkMinutes == 0 || restaurant.getWalkMinutes() <= walkMinutes)
					&& (rating == 0 || restaurant.getRating() >= rating)) {

				searchResults.add(restaurant);
			}
		}

		System.out.println("");
		System.out.println("====================検索結果========================");
		System.out.println("");

		if (searchResults.size() == 0) {
			System.out.println("条件に合うお店が見つかりませんでした");
		} else {
			System.out.println(searchResults.size() + "件のお店が見つかりました");
			System.out.println("");

			for (Restaurant restaurant : searchResults) {
				restaurant.showInfo();
			}

		}
	}
}
