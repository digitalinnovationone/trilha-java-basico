package exception;

public class ParametrosInvalidosException extends Exception{

        public ParametrosInvalidosException(){
            super("O segundo parametro deve ser maior do que o primeiro");
        }

        public ParametrosInvalidosException(String message){
            super(message);
        }
}
