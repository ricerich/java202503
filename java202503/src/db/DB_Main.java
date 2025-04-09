package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class Book{
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public void printBook()
	{
		System.out.print(" "+bookid);
		System.out.print(" "+bookname);
		System.out.print(" "+publisher);
		System.out.print(" "+price);
		System.out.println();
	}
	
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

class DB_Manager
{
	protected Connection con; // 멤버변수
	protected Statement stmt;
	protected ResultSet rs;
	
	public void getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "c##madang"; // c##추가
		String pwd = "c##madang"; // c##추가

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

class BookStore extends DB_Manager{
	
	private Book books[];
//	private Customer customers[];
	
	public BookStore(){
		books = new Book[10];
		
		for(int i=0; i<10; i++)
		{
			books[i] = new Book();
		}
	}
	
	public Book[] getBooks() {
		return books;
	}
	
	public void printBooks() {
		for(int i=0; i<books.length;i++) {
			books[i].printBook();
		}
		
	}

	public void getBookDB() { // 생성자
		String query = "SELECT * FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \tPUBLISHER \t\tPRICE");
			
			int index=0;
			while (rs.next()) {
//				System.out.print("" + rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t" + rs.getString(3));
//				System.out.println("\t\t\t" + rs.getInt(4));
				
				//books[0].bookid = rs.getInt(1);//private이라서 안됨!
				int bookid = rs.getInt(1);
				books[index].setBookid(bookid)
				;
				String bookname = rs.getString(2);
				books[index].setBookname(bookname);
				
				String publisher = rs.getString(3);
				books[index].setPublisher(publisher);
				
				int price = rs.getInt(4);
				books[index].setPrice(price);;
				
				index++;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void getCustomerList() { // 생성자
		String query = "select * from customer";
		try {
			stmt = con.createStatement(); // 2
			
			rs = stmt.executeQuery(query); // 3
			System.out.println("customer ID \tcustomer 이름 \t주소 \t전화번호");
			while (rs.next()) {
				System.out.print("" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.println("\t" + rs.getString(4));
			}
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public class DB_Main {
	public static void main(String args[]) { // 메소드이면서 프로그램실행에 관여함
//		new BookStore().getBookList();
//		new BookStore().getCustomerList();
		
		BookStore bs1 = new BookStore();
		bs1.getConn();
		bs1.getBookDB();
		
		Book[] books = bs1.getBooks();
		
		for(int i=0;i<books.length;i++) {
			books[i].printBook();
		}
		
		System.out.println("--------------------");
		
		bs1.printBooks();

		
		
		
//		bs1.printBooks();
		
//		bs1.getConn();
//		bs1.getCustomerList();
	}
}








