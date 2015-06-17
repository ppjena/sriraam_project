package business;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import bean.BookBean;
import dao.BookDAO;

public class InputParser {
	
	private static String bookName;
	private static String author;
	private static Date issueTime;

	private static Scanner in;
	
	public BookBean generateParsedInput() throws ParseException{
		
		in = new Scanner(System.in);
		System.out.println("Enter Book Name");
		bookName = in.nextLine();
		
		System.out.println("Enter Author Name");
		author = in.nextLine();
		
		System.out.println("Enter time of issue in yyyy-MM-dd format");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		issueTime = format.parse(in.nextLine());
		
		BookBean bookBean = new BookBean();
		bookBean.setName(bookName);
		bookBean.setAuthor(author);
		bookBean.setIssue_date_time(issueTime);
		
		return bookBean;
		
	}

}
