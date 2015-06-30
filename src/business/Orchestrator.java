package business;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;

import bean.Book;
import dao.BookDAO;

/*
 * Calls the input parser which takes in input from the
 *  user(book name, author and issue time) and then 
 *  passes the bean to the DAO which adds the record
 *  to the library database.
 */

public class Orchestrator {

	public static void main(String args[]) throws ParseException, SQLException, IOException {
		mainWithDepencies(System.in, new BookDAO());
	}

	// mocking
	protected static void mainWithDepencies(InputStream inputStream,
			BookDAO daoForAddingBook) throws ParseException, SQLException, IOException {
		InputParser inputParser = new InputParser();
		Book bookBean = inputParser.generateParsedInput(inputStream);
		daoForAddingBook.addBookToLibrary(bookBean);
	}
}
