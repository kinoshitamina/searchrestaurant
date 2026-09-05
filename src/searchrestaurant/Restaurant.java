package searchrestaurant;

public class Restaurant {
	private int id;
	private String title;
	private String genre;
	private int minPrice;
	private int maxPrice;
	private int distance;
	private String place;
	private String closeDay;
	private String businessHour;
	private double star;

	public Restaurant(int id, String title, String genre, int minPrice, int maxPrice, int distance, String place,
			String closeDay, String businessHour, double star) {

		this.id = id;
		this.title = title;
		this.genre = genre;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.distance = distance;
		this.place = place;
		this.closeDay = closeDay;
		this.businessHour = businessHour;
		this.star = star;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCloseDay() {
		return closeDay;
	}

	public void setCloseDay(String closeDay) {
		this.closeDay = closeDay;
	}

	public String getBusinessHour() {
		return businessHour;
	}

	public void setBusinessHour(String businessHour) {
		this.businessHour = businessHour;
	}

	public double getStar() {
		return star;
	}

	public void setStar(double star) {
		this.star = star;
	}

	public void showInfo() {
		System.out.println("お店の名前: " + title);
		System.out.println("お店のジャンル: " + genre);
		System.out.println("価格: " + minPrice + "円〜" + maxPrice + "円");
		System.out.println("駅からの距離: " + distance + "m");
		System.out.println("場所: " + place);
		System.out.println("定休日: " + closeDay);
		System.out.println("営業時間: " + businessHour);
		System.out.println("星の評価: " + star);
	}
}
