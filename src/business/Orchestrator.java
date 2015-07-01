package business;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import utilities.CustomException;
import bean.Book;
import dao.BookFileDAO;

/*
 * Calls the input parser which takes in input from the
 *  user(book name, author and issue time) and then 
 *  passes the bean to the DAO which adds the record
 *  to the library database.
 */

public class Orchestrator {

	public static void main(String args[]) throws CustomException {
		File file = new File("C:\\Users\\pragyan\\Desktop\\dir","library_record.txt");
		Boolean append = true;
		try{
		FileWriter fileWriter = new FileWriter(file,append);
		mainWithDepencies(System.in, new BookFileDAO(fileWriter));
		fileWriter.flush();
		fileWriter.close();
		}
		catch(IOException ex){
			throw(new CustomException(ex));
		}
	}

	// mocking
	protected static void mainWithDepencies(InputStream inputStream,
			BookFileDAO daoForAddingBook) throws CustomException {
		InputParser inputParser = new InputParser();
		Book bookBean = inputParser.generateParsedInput(inputStream);
		daoForAddingBook.addBookToLibrary(bookBean);
	}
}
