/*
 * Takes in input from the user(book name, author and issue time) 
 * and passes these values to input parser so as to add the 
 * record to the library database.
 */

package business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Orchestrator {

	private static String bookName;
	private static String author;
	private static Date issueTime;
	
	private static Scanner in;

	public static void main(String args[]){
		
		in = new Scanner(System.in);
		System.out.println("Enter Book Name");
		bookName = in.nextLine();
		
		System.out.println("Enter Author Name");
		author = in.nextLine();
		
		System.out.println("Enter time of issue in yyyy-MM-dd format");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			issueTime = format.parse(in.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			Input_Parser inputParser = new Input_Parser();
			inputParser.generateParsedInput(bookName, author, issueTime);
	}
	

}
