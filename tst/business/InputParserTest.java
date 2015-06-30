package business;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import bean.Book;

public class InputParserTest {

	@Test
	public void testCreateBookInstance() {
		InputParser inputParser = new InputParser();
		Date date = new Date();
		Book book = inputParser.createBookInstance("name", "author", date);
		Assert.assertEquals("name", book.getName());
		Assert.assertEquals("author", book.getAuthor());
		Assert.assertEquals(date, book.getIssue_date_time());
	}

	@Test
	public void testGenerateInput() throws ParseException {
		String input = "bname\naname\n2012-01-01\n";
		InputStream is = new ByteArrayInputStream(input.getBytes());
		Book book = new InputParser().generateParsedInput(is);
		Assert.assertEquals("bname", book.getName());
		Assert.assertEquals("aname", book.getAuthor());
		Calendar calendar = new GregorianCalendar();
		calendar.set(2012, Calendar.JANUARY, 1, 0, 0, 0);

		Date expected = calendar.getTime();
		Assert.assertEquals(expected.toString(), book.getIssue_date_time()
				.toString());
	}
}
