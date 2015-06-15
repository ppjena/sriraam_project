package business;

import java.sql.SQLException;
import java.util.Date;

import bean.BookBean;
import dao.BookDAO;

public class Input_Parser {
	
	public void generateParsedInput(String bookName, String author, Date issueTime){
		
		BookBean bookBean = new BookBean();
		bookBean.setName(bookName);
		bookBean.setAuthor(author);
		bookBean.setIssue_date_time(issueTime);
		BookDAO daoForAddingBook = new BookDAO();
		try {
			daoForAddingBook.addBookToLibrary(bookBean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
