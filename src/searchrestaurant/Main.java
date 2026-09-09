package searchrestaurant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant(1, "シュラスコ&ビアレストランALEGRIA 五反田", "シュラスコ・肉", 1000, 1999, 4,
				"東京都品川区西五反田1-30-2 ウイン五反田 B1F", "年末年始", "平日: 17:00~22:30 土日祝: 11:30~15:00 (ディナー) 16:00~22:30", 3.2);

		RestaurantSearch restaurantSearch = new RestaurantSearch();
		restaurantSearch.addRestaurant(restaurant);

		Scanner scan = new Scanner(System.in);

		System.out.println("\n店名を入力してください(指定なしはEnter)");
		System.out.print("> ");
		String title = scan.nextLine();

		System.out.println("\nジャンルを入力してください(指定なしはEnter)");
		System.out.print("> ");
		String genre = scan.nextLine();

		System.out.println("\n予算の上限を入力してください(指定なしはEnter)");
		System.out.print("> ");
		String budgetInput = scan.nextLine();

		System.out.println("\n駅から徒歩何分ですか？(指定なしはEnter)");
		System.out.print("> ");
		String walkMinutesInput = scan.nextLine();

		System.out.println("\n評価はいくつ以上ですか？(指定なしはEnter)");
		System.out.print("> ");
		String ratingInput = scan.nextLine();

		int maxBudget;

		if (budgetInput.isEmpty()) {
			maxBudget = 0;
		} else {
			maxBudget = Integer.parseInt(budgetInput);
		}

		int walkMinutes;

		if (walkMinutesInput.isEmpty()) {
			walkMinutes = 0;
		} else {
			walkMinutes = Integer.parseInt(walkMinutesInput);
		}

		double rating;

		if (ratingInput.isEmpty()) {
			rating = 0;
		} else {
			rating = Double.parseDouble(ratingInput);
		}

		restaurantSearch.searchRestaurants(title, genre, maxBudget, walkMinutes, rating);
	}
}
