package searchrestaurant;

public class Restaurant {
	private int id;
	private String title;
	private String genre;
	private int minPrice;
	private int maxPrice;
	private int distance;
	private String place;
	private String day;
	private String time;
	private double star;

	public Restaurant(int id, String title, String genre, int minPrice, int maxPrice, int distance, String place,
			String day, String time, double star) {

		this.id = id;
		this.title = title;
		this.genre = genre;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.distance = distance;
		this.place = place;
		this.day = day;
		this.time = time;
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

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public double getStar() {
		return star;
	}

	public void setStar(double star) {
		this.star = star;
	}

}
