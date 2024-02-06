### Project: E-Commerce Order Processing System

#### Project Overview
In this project, you will develop a model for an e-commerce order processing system using Java. This system will manage products, orders, and their statuses. You will leverage Enum Types, EnumSet, Varargs, and Java 14 Records to model the data and functionalities of the system. Additionally, you will explore the differences between using records and final classes in Java, implement a command-line interface (CLI) for interaction, and use JUnit 5 for testing.

#### Objectives:
- Model e-commerce system entities using Java 14 Records.
- Utilize Enum Types and EnumSet for order statuses and product categories.
- Implement Varargs for flexible product categorization.
- Develop a CLI for system interaction.
- Write JUnit 5 tests to ensure system reliability.

### Step 1: Define Order Status Enum

#### Objective:
Create an Enum to represent the status of orders in the system.

#### Task:
1. Define an Enum named `OrderStatus` with the values `PENDING`, `PROCESSING`, `SHIPPED`, and `DELIVERED`.
2. Attach a string description to each Enum value for better readability.

#### Code Snippet:
```java
public enum OrderStatus {
  /* Your code is here */
}
```

### Step 2: Use EnumSet for Product Categories

#### Objective:
Model product categories using EnumSet for efficient storage and retrieval.

#### Task:
1. Define an Enum named `ProductCategory` with values like `ELECTRONICS`, `CLOTHING`, `HOME`, etc.
2. In your product model, use an EnumSet to store multiple categories for a product.

#### Code Snippet:
```java
public enum ProductCategory {
   /* Your code is here */
}

public record Product /* Your code is here */
```

### Step 3: Implement Varargs in Product Creation

#### Objective:
Allow creating a product with a variable number of categories using Varargs.

#### Task:
1. Create a method in your product manager class that accepts Varargs for `ProductCategory`.
2. Use this method to instantiate a product with multiple categories.

#### Code Snippet:
```java
public class ProductManager {
   /* Your code is here */
}
```

### Step 4: Model Orders and Order Lines

#### Objective:
Use Java 14 Records to model orders and their line items.

#### Task:
1. Define a `Product` record with fields like `name`, `price`, and `categories`.
2. Create an `OrderLine` record that links products to quantities.
3. Define an `Order` record with fields for the order ID, a list of `OrderLine` items, and the order status.

#### Code Snippet:
```java
public record /* Your code is here */

public record /* Your code is here */
```

### Step 5: Develop a Command-Line Interface (CLI)

#### Objective:
Create a CLI to manage products, create orders, and update order statuses.

#### Task:
Implement a `CommandLineTool` class with a main method for system interaction. Provide options for adding products, creating orders, listing orders, and updating order statuses.

### Step 6: Implement JUnit 5 Tests

#### Objective:
Write unit tests to ensure the correctness of the e-commerce order processing system.

#### Task:
Create test cases for product creation, order creation, and order status updates. Use assertions to validate expected outcomes.

### Deliverables:
- Enum Types and EnumSet to model order statuses and product categories.
- Varargs usage for flexible product category assignment.
- Java 14 Records to model products, orders, and order lines.
- A `CommandLineTool` class for system interaction.
- A set of JUnit 5 tests to validate system functionalities.

This project will provide you with a comprehensive understanding of modern Java features and best practices for developing an e-commerce order processing system, from data modeling to interaction and testing.
