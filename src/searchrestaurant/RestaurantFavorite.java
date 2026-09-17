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
		if (favoriteRestaurants.isEmpty()) {
			System.out.println("お気に入りはありません");
		} else {
			for (Restaurant restaurant : favoriteRestaurants) {
				restaurant.showInfo();
			}
		}
	}

	public void removeFavorite(Restaurant favoriteRestaurant) {
		favoriteRestaurants.remove(favoriteRestaurant);
	}

	public boolean isFavorite(Restaurant favoriteRestaurant) {
		return favoriteRestaurants.contains(favoriteRestaurant);
	}

}
