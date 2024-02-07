import java.util.EnumSet;
import java.util.List;

public class ProductManager {
    public ProductCategory.Product createProduct(String name, double price, ProductCategory... categories) {
        EnumSet<ProductCategory> categorySet = EnumSet.noneOf(ProductCategory.class);
        for (ProductCategory category : categories) {
            categorySet.add(category);
        }
        return new ProductCategory.Product(name, price, categorySet);
    }

    public record Product(String name, double price, List<ProductCategory> categories) {}
    public record OrderLine(Product product, int quantity) {}
    public record Order(int orderId, List<OrderLine> orderLines, OrderStatus status) {}
}

