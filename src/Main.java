public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Menu menu = new Menu(store);
        menu.displayMainMenu();
    }
}
