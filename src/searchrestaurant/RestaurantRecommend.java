package searchrestaurant;

import java.util.ArrayList;
import java.util.Random;

public class RestaurantRecommend {
	private RestaurantSearch restaurantSearch;

	public RestaurantRecommend(RestaurantSearch restaurantSearch) {
		this.restaurantSearch = restaurantSearch;
	}

	public void recommendByFeeling() {
		ArrayList<Restaurant> recommendOptions = new ArrayList<Restaurant>();
		for (Restaurant restaurant : restaurantSearch.getRestaurants()) {
			if (restaurant.getMinPrice() >= 5000) {
				recommendOptions.add(restaurant);
			}
		}
		if (recommendOptions.isEmpty()) {
			System.out.println("候補がありません");
		} else {
			Random random = new Random();
			int randomIndex = random.nextInt(recommendOptions.size());
			Restaurant restaurant = recommendOptions.get(randomIndex);
			restaurant.showInfo();
		}
	}
}
