import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProductToCart(Product product) {
        cartItems.add(product);
    }

    public void removeProductFromCart(Product product) {
        cartItems.remove(product);
    }

    public void viewCart() {
        System.out.println("Your Cart:");
        for (Product product : cartItems) {
            System.out.println("- " + product.getProductName() + " (Quantity: " + product.getQuantity() + ")");
        }
    }

    public double checkout() {
        double total = 0.0;
        for (Product product : cartItems) {
            total += product.getQuantity() * 10.0;
        }
        return total;
    }
}
