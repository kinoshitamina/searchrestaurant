package searchrestaurant;

import java.util.Scanner;

public class Menu {
	private RestaurantSearch restaurantSearch;
	private RestaurantFavorite restaurantFavorite;
	private Scanner scan;

	public Menu(RestaurantSearch restaurantSearch, RestaurantFavorite restaurantFavorite, Scanner scan) {
		this.restaurantSearch = restaurantSearch;
		this.restaurantFavorite = restaurantFavorite;
		this.scan = scan;
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
		System.out.print("番号を入力してください > ");
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

		int maxBudget;
		while (true) {
			try {
				if (budgetInput.isEmpty()) {
					maxBudget = 0;
				} else {
					maxBudget = Integer.parseInt(budgetInput);
					if (maxBudget < 0) {
						System.out.println();
						System.out.println("0以上の数字を入力してください");
						System.out.println("\n予算の上限を入力してください(指定なしはEnter)");
						System.out.print("> ");
						budgetInput = scan.nextLine();
						continue;
					}
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("*予算を数字で入力してください");
				System.out.println("\n予算の上限を入力してください(指定なしはEnter)");
				System.out.print("> ");
				budgetInput = scan.nextLine();
			}
		}

		System.out.println("\n駅から徒歩何分が希望ですか？(指定なしはEnter)");
		System.out.print("> ");
		String walkMinutesInput = scan.nextLine();

		int walkMinutes;
		while (true) {
			try {
				if (walkMinutesInput.isEmpty()) {
					walkMinutes = 0;
				} else {
					walkMinutes = Integer.parseInt(walkMinutesInput);
					if (walkMinutes < 0) {
						System.out.println();
						System.out.println("0以上の数字を入力してください");
						System.out.println("\n駅から徒歩何分が希望ですか？(指定なしはEnter)");
						System.out.print("> ");
						walkMinutesInput = scan.nextLine();
						continue;
					}
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("*徒歩分数を数字で入力してください");
				System.out.println("\n駅から徒歩何分が希望ですか？(指定なしはEnter)");
				System.out.print("> ");
				walkMinutesInput = scan.nextLine();
			}
		}

		restaurantSearch.searchRestaurants(title, genre, maxBudget, walkMinutes);

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
		System.out.print("番号を入力してください > ");

	}

	public void addFavoriteMenu() {
		String idInput = scan.nextLine();
		while (true) {
			try {
				int restaurantId = Integer.parseInt(idInput);
				Restaurant foundRestaurant = restaurantSearch.findById(restaurantId);

				if (foundRestaurant != null) {
					if (restaurantFavorite.isFavorite(foundRestaurant)) {
						System.out.println("そのお店はすでに登録されています");
					} else {
						System.out.println("お気に入りに追加しました");
						restaurantFavorite.addFavorite(foundRestaurant);
					}
				} else {
					System.out.println("そのIDのお店は見つかりませんでした");
				}
				break;

			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("*お店のIDを数字で入力してください");
				System.out.println();
				System.out.println("お気に入りに追加したいお店のIDを入力してください");
				System.out.print("> ");
				idInput = scan.nextLine();
			}
		}
	}

	public void removeFavoriteMenu() {
		String idInput = scan.nextLine();
		while (true) {
			try {
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
				break;
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("お店のIDを数字で入力してください");
				System.out.println();
				System.out.println("お気に入りを削除したいお店のIDを入力してください");
				System.out.print("> ");
				idInput = scan.nextLine();
			}
		}
	}

	public void recommendMenu() {
		System.out.println("=========================");
		System.out.println("   　 おすすめメニュー");
		System.out.println("=========================");
		System.out.println();
		System.out.println("1. 今日の気分から決める");
		System.out.println("2. 完全おまかせ");
		System.out.println("3. メニュー画面に戻る");
		System.out.println();
		System.out.print("番号を入力してください > ");
	}

	public void feelingMenu() {
		System.out.println("==========================");
		System.out.println("  今日はどんな気分ですか？");
		System.out.println("==========================");
		System.out.println();
		System.out.println("1. がっつり食べたい");
		System.out.println("2. あっさり食べたい");
		System.out.println("3. 飲みながら食べたい");
		System.out.println("4. ちょっと贅沢したい");
		System.out.println("5. 軽く済ませたい");
		System.out.println();
		System.out.print("番号を入力してください > ");
	}
}
