package ch04_ex;

public class TV {

	private String brand;
	private int year;
	private int size;
	
	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.println(brand+"에서 만든 "+year+"년 "+size+"인치 TV");
		
	}
}
