package business;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.easymock.EasyMock;
import org.junit.Test;

import bean.Book;
import dao.BookDAO;

public class OrchestratorTest {

	@Test
	public void testMainWithDependencies() throws ParseException, SQLException, IOException {
		String input = "bname\naname\n2012-01-01\n";
		InputStream is = new ByteArrayInputStream(input.getBytes());
		
		Book book = new Book();
		book.setAuthor("aname");
		book.setName("bname");
		Calendar calendar = new GregorianCalendar();
		calendar.set(2012, Calendar.JANUARY, 1, 0, 0, 0);
		Date expected = calendar.getTime();
		book.setIssue_date_time(expected);
		
		BookDAO bookDAO = EasyMock.createNiceMock(BookDAO.class);
		// SET MOCK BEHAVIOUR
		bookDAO.addBookToLibrary(book);
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(bookDAO);
		
		Orchestrator.mainWithDepencies(is, bookDAO);
		EasyMock.verify(bookDAO);
	}

}