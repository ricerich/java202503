package ch05_ex;
class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}
	
//	public void setSize(int size) {
//		this.size = size;
//	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {

	private int color;
	
	public ColorTV(int size, int color) 
	{
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
	
}

public class Ex01 {


	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
//		myTV.setSize(45);
//		myTV.setSize(70);
		myTV.printProperty();
	}

}
