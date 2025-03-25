package ch04_ex;

public class Ex03 {

	public static void main(String[] args) {
		Song s1 = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s1.show();
		
		Song s2 = new Song();
		s2.show();
		
//		s2.title = "새노래";
//		s2.artist = "새가수";
//		s2.year = 2010;
//		s2.country = "미국";
		s2.setTitle("새노래");
		s2.setArtist("새가수");
		s2.setYear(2010);
		s2.setCountry("미국");
		
		s2.show();
		
		String title = s1.getTitle();
		System.out.println(title);
		
	}

}
