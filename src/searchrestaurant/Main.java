package searchrestaurant;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant(1, "シュラスコ&ビアレストランALEGRIA 五反田", "シュラスコ・肉", 1000, 1999, 4,
				"東京都品川区西五反田1-30-2 ウイン五反田 B1F", "年末年始", "平日: 17:00~22:30 土日祝: 11:30~15:00 (ディナー) 16:00~22:30", 3.2);
		restaurant.showInfo();
	}

}
