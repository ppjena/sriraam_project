package dao;

import java.io.FileWriter;
import java.io.IOException;

import utilities.CustomException;
import bean.Book;

public class BookFileDAO implements BookDAO{
	
	private FileWriter fileWriter;
	
	public BookFileDAO(FileWriter fileWriter)
	{
		this.fileWriter = fileWriter;
	}
	
	
	public void addBookToLibrary(Book bean) throws CustomException
	{

		try{
		//fileWriter.write(String.format("%20 %20 %20 %20 \r\n","1",bean.getName(),bean.getAuthor(),bean.getIssue_date_time()));
		fileWriter.write("1"+" "+bean.getName()+" "+bean.getAuthor()+" "+bean.getIssue_date_time());
			
		}
		catch(IOException ex)
		{
			throw(new CustomException(ex));
		}
		
	}

}
