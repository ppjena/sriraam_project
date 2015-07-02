package dao;

import bean.Book;

public interface BookDAO {

	public void addBookToLibrary(Book bean) throws DAOException; 
}
