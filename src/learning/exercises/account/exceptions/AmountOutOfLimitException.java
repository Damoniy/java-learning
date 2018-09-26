package learning.exercises.account.exceptions;

public class AmountOutOfLimitException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AmountOutOfLimitException(String msg) {
		super(msg);
	}	
}
