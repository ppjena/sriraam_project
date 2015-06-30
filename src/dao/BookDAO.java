package dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Book;
import connection.ConnectionManager;

public class BookDAO {
	
	public void addBookToLibrary(Book bean) throws SQLException, IOException
	{
		
		File dir = new File("C:\\Users\\pragyan\\Desktop\\dir");
		dir.mkdirs();
		File file = new File(dir,"library_record.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(String.format("%20 %20 %20 %20 \r\n","Id","Name","AuthorName","IssueDateTime"));
		fileWriter.write(String.format("%20 %20 %20 %20 \r\n","1",bean.getName(),bean.getAuthor(),bean.getIssue_date_time()));
		fileWriter.flush();
		fileWriter.close();
		
	}

}
