package business;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import bean.Book;

public class InputParser {

	// dependency injection
	public Book generateParsedInput(InputStream inputStream)
			throws ParseException {
		Scanner in = new Scanner(inputStream);
		System.out.println("Enter Book Name");
		String bookName = in.nextLine();

		System.out.println("Enter Author Name");
		String author = in.nextLine();

		System.out.println("Enter time of issue in yyyy-MM-dd format");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date issueTime = format.parse(in.nextLine());
		return createBookInstance(bookName, author, issueTime);
	}

	protected Book createBookInstance(String bookName, String author,
			Date issueTime) {
		Book bookBean = new Book();
		bookBean.setName(bookName);
		bookBean.setAuthor(author);
		bookBean.setIssue_date_time(issueTime);

		return bookBean;
	}

}
