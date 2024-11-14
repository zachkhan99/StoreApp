# Store Inventory Management System

A simple Java-based console application to manage a store's inventory and customer accounts. This application allows an admin to create and delete customer accounts, add or remove products from inventory, restock products, and view the current inventory.

## Features

- **Customer Management**
  - Create a customer account
  - Remove a customer account
  - View list of customers

- **Inventory Management**
  - Add a product to inventory
  - Remove a product from inventory
  - Restock a product
  - Show the entire product inventory

## Requirements

- Java Development Kit (JDK) 11 or higher
- Make (for running the Makefile commands)

## Installation and Setup

1. Clone the repository to your local machine.
2. Make sure you have Java installed by running:
   ```bash
   java -version
   ```
3. Use the provided Makefile to compile, build, and run the program.

## Usage
To build and run the program, use the following commands in the root directory (Store/): 

1. Compile
```bash
make compile
```

2. Build JAR:
```bash
make build
```

3. Run:
```bash
make run
```

4. Clean:
```bash
make clean
```

## Example Usage

Once the program is running, you will see an Admin Menu with options: 
```bash
-- Admin Menu --
1. Create Customer Account
2. Remove Customer Account
3. Add Product to Inventory
4. Remove Product from Inventory
5. Restock Product in Inventory
6. Show Product Inventory
7. Show Customer List
8. Exit
Choose an option:
```
Enter a number from 1 to 8 to perform the respective action.

## Code Structure

- Admin: Manages customer and inventory actions.
- Customer: Represents a customer with a unique name.
- Product: Represents a product with a name and quantity.
- Store: Manages collections of Customer and Product objects.
- Menu: Displays the menu and handles user input.
- ShoppingCart: Represents a shopping cart (not used in the current version but made for future functionality).
- Main: Entry point of the program.

## Future Enhancements

- Enhanced shopping cart functionality for customers.
- Persistent storage of inventory and customer data.
- User authentication and role-based access.
