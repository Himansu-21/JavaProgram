package comm;

public class InvalidAgeException extends RuntimeException {

private String message;
	
public InvalidAgeException(String message) {
	this.message = message;
}
@Override
public String getMessage() {
	return this.message;
}
}
