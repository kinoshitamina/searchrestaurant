package searchrestaurant;

import java.util.ArrayList;

//import apple.laf.JRSUIState.TitleBarHeightState;

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

}
