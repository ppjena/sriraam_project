package bean;

import java.util.Date;

public class BookBean {
	
	
	private String name;
	private String author;
	private Date issue_date_time;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getIssue_date_time() {
		return issue_date_time;
	}
	public void setIssue_date_time(Date issue_date_time) {
		this.issue_date_time = issue_date_time;
	}
	
	

}
