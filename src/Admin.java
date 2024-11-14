import java.util.List;

public class Admin {

    public void createCustomerAccount(String name, Store store) {
        // Check if the customer already exists
        for (Customer customer : store.getCustomers()) {
            if (customer.getName().equals(name)) {
                System.out.println("Customer account already exists for " + name);
                return; // Exit the method if the customer already exists
            }
        }
    
        // If customer doesn't exist, create a new customer account
        Customer customer = new Customer(name);
        store.addCustomer(customer);
        System.out.println("Customer account created for " + name);
    }

    public void removeCustomerAccount(String name, Store store) {
        store.removeCustomer(name);
        System.out.println("Customer account removed for " + name);
    }

    public void showCustomers(Store store) {
        if (store.getCustomers().isEmpty()) {
            System.out.println("No customers found.");
        } else {
            System.out.println("-- Customer List --");
            for (Customer customer : store.getCustomers()) {
                System.out.println("Customer: " + customer.getName());
            }
        }
    }

    public void addProductToInventory(String productName, int quantity, Store store) {
        // Check if the product already exists in the inventory
        Product existingProduct = null;
        for (Product product : store.getProducts()) {
            if (product.getProductName().equals(productName)) {
                existingProduct = product;
                break;
            }
        }
    
        if (existingProduct != null) {
            // If the product exists, update the quantity
            existingProduct.setQuantity(existingProduct.getQuantity() + quantity);
            System.out.println("Product restocked: " + productName);
        } else {
            // If the product doesn't exist, add it as a new product
            Product product = new Product(productName, quantity);
            store.addProduct(product);
            System.out.println("Product added to inventory: " + productName);
        }
    }

    public void removeProductFromInventory(String productName, Store store) {
        store.removeProduct(productName);
        System.out.println("Product removed from inventory: " + productName);
    }

    public void restockProductInInventory(String productName, int quantity, Store store) {
        store.restockProduct(productName, quantity);
        System.out.println("Product restocked: " + productName);
    }

    public void showInventory(Store store) {
        List<Product> inventory = store.getProducts();
        if (inventory.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("-- Product Inventory --");
            for (Product product : inventory) {
                System.out.println("Product: " + product.getProductName() + ", Quantity: " + product.getQuantity());
            }
        }
    }

}
