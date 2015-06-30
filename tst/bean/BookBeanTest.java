package bean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookBeanTest {

	@Test
	public void testGetName() {
		bookBean.setName("testname");
		Assert.assertEquals("testname", bookBean.getName());
	}
	
	@Test
	public void testGetAuthor() {
		bookBean.setAuthor("author1");
		Assert.assertEquals("author1", bookBean.getAuthor());
	}
	
	
	@Before
	public void setUp(){
		bookBean = new Book();
	}
	private Book bookBean;
}
