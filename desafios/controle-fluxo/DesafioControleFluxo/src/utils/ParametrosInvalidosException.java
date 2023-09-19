package utils;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception{

	public String getMessage() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
}
