package searchrestaurant;

import java.util.ArrayList;
import java.util.Random;

public class RestaurantRecommend {
	private RestaurantSearch restaurantSearch;

	public RestaurantRecommend(RestaurantSearch restaurantSearch) {
		this.restaurantSearch = restaurantSearch;
	}

	public void recommendByFeeling(String feelingChoice) {
		ArrayList<Restaurant> recommendOptions = new ArrayList<Restaurant>();
		for (Restaurant restaurant : restaurantSearch.getRestaurants()) {
			switch (feelingChoice) {
			case "1":
				if (restaurant.getGenre().contains("肉")
						|| restaurant.getGenre().contains("中華")
						|| restaurant.getGenre().contains("ラーメン")
						|| restaurant.getGenre().contains("丼")) {
					recommendOptions.add(restaurant);
				}
				break;
			case "2":
				if (restaurant.getGenre().contains("寿司")
						|| restaurant.getGenre().contains("海鮮")
						|| restaurant.getGenre().contains("和食")
						|| restaurant.getGenre().contains("野菜")) {
					recommendOptions.add(restaurant);
				}
				break;
			case "3":
				if (restaurant.getGenre().contains("居酒屋")
						|| restaurant.getGenre().contains("酒")
						|| restaurant.getGenre().contains("串")
						|| restaurant.getGenre().contains("焼き鳥")) {
					recommendOptions.add(restaurant);
				}
				break;
			case "4":
				if (restaurant.getMinPrice() >= 5000) {
					recommendOptions.add(restaurant);
				}
				break;
			case "5":
				if (restaurant.getMaxPrice() <= 2000 && restaurant.getGenre().contains("ファストフード")) {
					recommendOptions.add(restaurant);
				}
				break;
			}
		}
		if (recommendOptions.isEmpty()) {
			System.out.println("候補がありません");
		} else {
			Random random = new Random();
			int randomIndex = random.nextInt(recommendOptions.size());
			Restaurant restaurant = recommendOptions.get(randomIndex);
			switch (feelingChoice) {
			case "1":
				System.out.println();
				System.out.println("=======がっつり系のお店=======");
				System.out.println();
				break;
			case "2":
				System.out.println();
				System.out.println("=======あっさり系のお店=======");
				System.out.println();
				break;
			case "3":
				System.out.println();
				System.out.println("=======お酒と楽しめるお店========");
				System.out.println();
				break;
			case "4":
				System.out.println();
				System.out.println("=======ちょっと贅沢なお店========");
				System.out.println();
				break;
			case "5":
				System.out.println();
				System.out.println("======軽く済ませられるお店=======");
				System.out.println();
				break;
			}
			restaurant.showInfo();
		}
	}
}
