package searchrestaurant;

public class Restaurant {
	private int id;
	private String title;
	private String genre;
	private int minPrice;
	private int maxPrice;
	private int walkMinutes;
	private String place;
	private String closeDay;
	private String businessHour;
	private double rating;

	public Restaurant(int id, String title, String genre, int minPrice, int maxPrice, int walkMinutes, String place,
			String closeDay, String businessHour, double rating) {

		this.id = id;
		this.title = title;
		this.genre = genre;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.walkMinutes = walkMinutes;
		this.place = place;
		this.closeDay = closeDay;
		this.businessHour = businessHour;
		this.rating = rating;
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

	public int getWalkMinutes() {
		return walkMinutes;
	}

	public void setWalkMinutes(int walkMinutes) {
		this.walkMinutes = walkMinutes;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void showInfo() {
		System.out.println("お店の名前: " + title);
		System.out.println("お店のジャンル: " + genre);
		System.out.println("価格: " + minPrice + "円〜" + maxPrice + "円");
		System.out.println("駅から徒歩: " + walkMinutes + "分");
		System.out.println("場所: " + place);
		System.out.println("定休日: " + closeDay);
		System.out.println("営業時間: " + businessHour);
		System.out.println("評価: " + rating);
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");

	}
}
