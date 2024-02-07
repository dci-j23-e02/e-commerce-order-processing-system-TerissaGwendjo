
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.EnumSet;
import java.util.List;

class MainTest {

    @Test
    void testProductCreation() {
        // Create products
        ProductCategory.Product product1 = new ProductCategory.Product("Laptop", 999.99, ProductCategory.ELECTRONICS);
        ProductCategory.Product product2 = new ProductCategory.Product("T-Shirt", 19.99, ProductCategory.CLOTHING);

        // Assertions for product creation
        Assertions.assertEquals("Laptop", product1.name());
        Assertions.assertEquals(999.99, product1.price());
        Assertions.assertTrue(product1.categories().contains(ProductCategory.ELECTRONICS));

        Assertions.assertEquals("T-Shirt", product2.name());
        Assertions.assertEquals(19.99, product2.price());
        Assertions.assertTrue(product2.categories().contains(ProductCategory.CLOTHING));
    }

    @Test
    void testOrderCreation() {
        // Create products
        ProductCategory.Product product1 = new ProductCategory.Product("Laptop", 999.99, ProductCategory.ELECTRONICS);
        ProductCategory.Product product2 = new ProductCategory.Product("T-Shirt", 19.99, ProductCategory.CLOTHING);

        // Create order lines
        ProductManager.OrderLine orderLine1 = new ProductManager.OrderLine(product1, 2);
        ProductManager.OrderLine orderLine2 = new ProductManager.OrderLine(product2, 3);

        // Create order
        ProductManager.Order order = new ProductManager.Order(1, List.of(orderLine1, orderLine2), OrderStatus.PENDING);

        // Assertions for order creation
        Assertions.assertEquals(1, order.orderId());
        Assertions.assertEquals(2, order.orderLines().get(0).quantity());
        Assertions.assertEquals(product1, order.orderLines().get(0).product());
        Assertions.assertEquals(3, order.orderLines().get(1).quantity());
        Assertions.assertEquals(product2, order.orderLines().get(1).product());
        Assertions.assertEquals(OrderStatus.PENDING, order.status());
    }

    @Test
    void testUpdateOrderStatus() {
        // Create order
        ProductManager.Order order = new ProductManager.Order(1, List.of(new ProductManager.OrderLine(new ProductCategory.Product("Laptop", 999.99, ProductCategory.ELECTRONICS), 1)), OrderStatus.PENDING);

        // Update order status
        //order = order.withStatus(OrderStatus.SHIPPED);
        ProductManager.Order updatedOrder = new ProductManager.Order(order.orderId(), order.orderLines(), OrderStatus.SHIPPED);

        // Assertions for updated order status
        Assertions.assertEquals(OrderStatus.SHIPPED, order.status());
    }


}