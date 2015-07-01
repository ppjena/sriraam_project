package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utilities.CustomException;
import bean.Book;
import connection.ConnectionManager;

public class BookDataBaseDAO implements BookDAO{
	
	public void addBookToLibrary(Book bean) throws CustomException
	{
		Connection conn = ConnectionManager.getConnection();
		PreparedStatement pst = null;
		
		
		String sqlQuery = "insert into library_record (name_of_book,author,issue_time) values (?,?,?)";
		try{
	
		//pst = conn.prepareStatement(sqlQuery,PreparedStatement.RETURN_GENERATED_KEYS);
		pst = conn.prepareStatement(sqlQuery);
		pst.setString(1, bean.getName());
		pst.setString(2, bean.getAuthor());
		pst.setString(3, ""+bean.getIssue_date_time());
		
		pst.executeUpdate();
		
		}
		
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	    finally{
	    	try {
				conn.close();
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw(new CustomException(e));
			}
	    	
	    	
	    }
		
	}

}
