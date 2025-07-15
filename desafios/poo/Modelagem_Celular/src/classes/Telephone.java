package classes;
import interfaces.ITelephone;

public class Telephone implements ITelephone{
    @Override
    public void call(String number) {
        System.out.printf("Calling %s \n",number);
    }
}
