package searchrestaurant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant(1, "シュラスコ&ビアレストランALEGRIA 五反田", "シュラスコ・肉", 1000, 1999, 4,
				"東京都品川区西五反田1-30-2 ウイン五反田 B1F", "年末年始", "平日: 17:00~22:30 土日祝: 11:30~15:00 (ディナー) 16:00~22:30", 3.2);
		Restaurant restaurant2 = new Restaurant(2, "焼き鳥　しょうちゃん　五反田店", "居酒屋・肉", 3000, 3900, 1,
				"東京都品川区東五反田１丁目１６−９ フェニックスビル １Ｆ", "日曜日", "月・火・水・木・祝日: 17:00～翌5:00、金曜日: 17:00～翌8:00、土・祝前日: 16:00～翌5:00",
				3.4);
		Restaurant restaurant3 = new Restaurant(3, "福祥餃子楼", "居酒屋・中華", 1000, 3900, 4, "東京都品川区西五反田2-26-4 I・A・BLDG 1F",
				"なし", "ランチ：11:30 ～ 15:00、ディナー：17:00 ～ 23:00", 3.0);
		Restaurant restaurant4 = new Restaurant(4, "ウミボウズ　五反田駅前店", "海鮮・居酒屋", 1000, 3900, 2, "東京都品川区西五反田2-7-8 誠實ビル 7F",
				"なし", "ランチタイム: 11:00 ～ 14:30、ディナータイム: 16:30 ～ 24:00 ", 3.0);
		Restaurant restaurant5 = new Restaurant(5, "串カツ田中 五反田駅前店", "串揚げ、居酒屋、うどん", 2000, 2900, 2,
				"東京都品川区東五反田1-12-5 秀栄ビル1", "なし", "平日：16:00 〜 23:00 / 0:00 頃、土日祝：12:00 〜 23:00 / 0:00 / 深夜1:00 頃", 3.0);

		RestaurantSearch restaurantSearch = new RestaurantSearch();
		restaurantSearch.addRestaurant(restaurant);
		restaurantSearch.addRestaurant(restaurant2);
		restaurantSearch.addRestaurant(restaurant3);
		restaurantSearch.addRestaurant(restaurant4);
		restaurantSearch.addRestaurant(restaurant5);

		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu(restaurantSearch);

		boolean running = true;

		while (running) {
			menu.showMenu();

			String menuInput = scan.nextLine();

			switch (menuInput) {
			case "1":
				System.out.println("検索します");
				menu.searchMenu();
				break;

			case "2":
				System.out.println("一覧を表示します");
				restaurantSearch.showAllRestaurants();
				break;

			case "3":
				System.out.println("お気に入りを表示します");
				break;

			case "4":
				System.out.println("おすすめを表示します");
				break;

			case "5":
				System.out.println("処理を終了します");
				running = false;
				break;
			}
		}
	}
}
