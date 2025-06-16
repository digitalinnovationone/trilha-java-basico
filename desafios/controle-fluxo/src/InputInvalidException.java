public class InputInvalidException extends RuntimeException {
    static String mensage = "O valor do segundo parâmetro deve ser maior que o primeiro";
    public InputInvalidException() {
        super(mensage);
    }
}
