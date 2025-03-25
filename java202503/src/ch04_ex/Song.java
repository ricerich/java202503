package ch04_ex;

public class Song 
{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		title="무제";
		artist="모름";
		year=2025;
		country = "한국";
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getYear() {
		return year;
	}

	public String getCountry() {
		return country;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	
	

}
