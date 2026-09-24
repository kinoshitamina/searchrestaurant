package searchrestaurant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		RestaurantSearch restaurantSearch = new RestaurantSearch();
		RestaurantFavorite restaurantFavorite = new RestaurantFavorite();
		RestaurantData restaurantData = new RestaurantData();
		RestaurantRecommend restaurantRecommend = new RestaurantRecommend(restaurantSearch);

		restaurantData.addRestaurantData(restaurantSearch);

		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu(restaurantSearch, restaurantFavorite, scan);

		boolean running = true;

		while (running) {
			menu.showMenu();

			String menuInput = scan.nextLine();

			switch (menuInput) {
			case "1":
				System.out.println();
				System.out.println("=========================");
				System.out.println("         お店検索");
				System.out.println("=========================");
				menu.searchMenu();
				break;

			case "2":
				System.out.println();
				System.out.println("=========================");
				System.out.println("       一覧を表示");
				System.out.println("=========================");
				System.out.println();
				restaurantSearch.showAllRestaurants();
				break;

			case "3":

				boolean favoriteRunning = true;
				while (favoriteRunning) {
					menu.favoriteMenu();

					String favoriteChoice = scan.nextLine();

					switch (favoriteChoice) {
					case "1":
						System.out.println();
						System.out.println("========お気に入り一覧=======");
						System.out.println();
						restaurantFavorite.showFavorites();
						break;

					case "2":
						System.out.println();
						System.out.println("========お気に入り追加========");
						System.out.println();
						System.out.println("お気に入りに追加したいお店のIDを入力してください");
						System.out.print("> ");
						menu.addFavoriteMenu();
						break;

					case "3":
						System.out.println();
						System.out.println("========お気に入り削除=========");
						System.out.println();
						System.out.println("お気に入りを削除したいお店のIDを入力してください");
						System.out.print("> ");
						menu.removeFavoriteMenu();
						break;

					case "4":
						favoriteRunning = false;
						break;
					default:
						System.out.println();
						System.out.println("1~4の数字を入力してください。");
						System.out.println();
					}
				}
				break;

			case "4":

				boolean recommendRunning = true;
				while (recommendRunning) {
					menu.recommendMenu();

					String recommendChoice = scan.nextLine();
					switch (recommendChoice) {
					case "1":
						System.out.println();
						System.out.println("お店選びをお手伝いします");
						System.out.println();
						menu.feelingMenu();
						String feelingChoice = scan.nextLine();
						restaurantRecommend.recommendByFeeling(feelingChoice);
						break;
					case "2":
						System.out.println();
						System.out.println("=====完全おまかせ=====");
						System.out.println();
						restaurantSearch.showRandomRestaurant();
						break;
					case "3":
						recommendRunning = false;
						break;
					default:
						System.out.println();
						System.out.println("1~3の数字を入力してください。");
						System.out.println();
					}
				}
				break;
			case "5":
				System.out.println();
				System.out.println("=========================");
				System.out.println("    処理が終了しました");
				System.out.println("=========================");
				System.out.println();
				running = false;
				break;

			default:
				System.out.println();
				System.out.println("1~5の数字を入力してください。");
				System.out.println();
				break;
			}
		}
		scan.close();
	}
}
