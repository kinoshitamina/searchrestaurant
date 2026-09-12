package searchrestaurant;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	private RestaurantSearch restaurantSearch;

	public Menu(RestaurantSearch restaurantSearch) {
		this.restaurantSearch = restaurantSearch;
	}

	public void showMenu() {
		System.out.println("");
		System.out.println("=====================================");
		System.out.println("        　五反田レストラン検索");
		System.out.println("=====================================");
		System.out.println("");
		System.out.println("1. お店を検索する");
		System.out.println("2. お店一覧を見る");
		System.out.println("3. お気に入りを見る");
		System.out.println("4. おすすめ！");
		System.out.println("5. 終了する");
		System.out.println("");
		System.out.println("番号を入力してください > ");
	}

	public void searchMenu() {
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
