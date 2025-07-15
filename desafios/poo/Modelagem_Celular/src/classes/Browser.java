package classes;
import interfaces.IBrowser;

public class Browser implements IBrowser{
    @Override
    public void openPage(String url) {
        System.out.printf("Opening %s \n", url);
    }
}