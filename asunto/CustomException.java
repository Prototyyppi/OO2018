import java.io.*;
import java.lang.*;

public class CustomException extends Exception {
	static final long serialVersionUID = 42L;
	public CustomException(String error){
		super(error);
	}

}