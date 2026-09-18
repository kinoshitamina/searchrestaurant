package searchrestaurant;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	private RestaurantSearch restaurantSearch;
	private RestaurantFavorite restaurantFavorite;

	public Menu(RestaurantSearch restaurantSearch, RestaurantFavorite restaurantFavorite) {
		this.restaurantSearch = restaurantSearch;
		this.restaurantFavorite = restaurantFavorite;
	}

	public void showMenu() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("        　 五反田レストラン");
		System.out.println("=====================================");
		System.out.println();
		System.out.println("1. お店を検索する");
		System.out.println("2. お店一覧を見る");
		System.out.println("3. お気に入りを見る");
		System.out.println("4. おすすめ！");
		System.out.println("5. 終了する");
		System.out.println();
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

		restaurantSearch.searchRestaurants(title, genre, maxBudget, walkMinutes);

	}

	public void addFavoriteMenu() {
		String idInput = scan.nextLine();
		int restaurantId = Integer.parseInt(idInput);
		Restaurant foundRestaurant = restaurantSearch.findById(restaurantId);
		if (foundRestaurant != null) {
			System.out.println("お気に入りに追加しました");
			restaurantFavorite.addFavorite(foundRestaurant);
		} else {
			System.out.println("そのIDのお店は見つかりませんでした");
		}
	}

	public void favoriteMenu() {
		System.out.println("=========================");
		System.out.println("   　お気に入りメニュー");
		System.out.println("=========================");
		System.out.println();
		System.out.println("1. お気に入りを見る");
		System.out.println("2. お気に入りを追加");
		System.out.println("3. お気に入りを削除");
		System.out.println("4. メニュー画面に戻る");
		System.out.println();
		System.out.println("番号を入力してください >");

	}

	public void removeFavoriteMenu() {
		String idInput = scan.nextLine();
		int restaurantId = Integer.parseInt(idInput);
		Restaurant foundRestaurant = restaurantSearch.findById(restaurantId);
		if (foundRestaurant != null) { //お店自体が存在するか
			if (restaurantFavorite.isFavorite(foundRestaurant)) { //そのお店がお気に入りに入っているか
				System.out.println("お気に入りを削除しました");
				restaurantFavorite.removeFavorite(foundRestaurant);
			} else {
				System.out.println("お気に入りに登録されていません");
			}
		} else {
			System.out.println("そのIDのお店は見つかりませんでした");
		}
	}
}
