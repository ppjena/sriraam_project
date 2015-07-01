package utilities;

public class CustomException extends Exception{
	
	public CustomException(){
		
	}
	
	public CustomException(String message){
		super(message);
	}
	
	public CustomException(Throwable exception){
		super(exception);
	}

	public CustomException(String message, Throwable exception){
		super(message,exception);
		
	}
}
