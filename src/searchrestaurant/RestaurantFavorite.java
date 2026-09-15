package searchrestaurant;

import java.util.ArrayList;

public class RestaurantFavorite {

	private ArrayList<Restaurant> favoriteRestaurants;

	public RestaurantFavorite() {
		favoriteRestaurants = new ArrayList<Restaurant>();
	}

	public void addFavorite(Restaurant favoriteRestaurant) {
		favoriteRestaurants.add(favoriteRestaurant);
	}

	public void showFavorites() {
		for (Restaurant restaurant : favoriteRestaurants) {
			restaurant.showInfo();
		}
	}

}
