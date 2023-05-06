package error;

public class NoStudentExistException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoStudentExistException(){
		super();
	}
	public NoStudentExistException(String message){
		super(message);
	}
}
