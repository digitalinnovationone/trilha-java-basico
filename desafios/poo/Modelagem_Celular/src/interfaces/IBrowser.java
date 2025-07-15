package interfaces;

public interface IBrowser {
    abstract void openPage(String url);

    default void addNewPage() {
        System.out.println("New page opened");
    }
    
    default void reloadPage() {
        System.out.println("Reloanding Page");
    }
}
