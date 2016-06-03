package by.epam.authorization.command.exception;

public class CommandException extends Exception{
	private static final long serialVersionUID = 1L;

	public CommandException(String message){
		super(message);
	}
	
	public CommandException(Exception e){
		super(e);
	}

	public CommandException(String message, Exception e){
		super(message, e);
	}
}
