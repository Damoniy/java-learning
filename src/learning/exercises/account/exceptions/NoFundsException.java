package learning.exercises.account.exceptions;

public class NoFundsException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NoFundsException(String msg) {
		super(msg);
	}	
}
