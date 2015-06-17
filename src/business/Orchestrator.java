package business;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import bean.BookBean;
import dao.BookDAO;


/*
 * Calls the input parser which takes in input from the
 *  user(book name, author and issue time) and then 
 *  passes the bean to the DAO which adds the record
 *  to the library database.
 */

public class Orchestrator {

	

	public static void main(String args[]){
		
		BookBean bookBean = null;
		InputParser inputParser = new InputParser();
		try{
			bookBean= inputParser.generateParsedInput();
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		
		
		BookDAO daoForAddingBook = new BookDAO();
		try {
			daoForAddingBook.addBookToLibrary(bookBean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
	}
	

}
