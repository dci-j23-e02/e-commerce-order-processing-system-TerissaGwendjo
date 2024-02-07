import java.util.EnumSet;

public enum ProductCategory {
    ELECTRONICS,
    CLOTHING,
    HOME;

    public record Product(String name, double price, EnumSet<ProductCategory> categories) {
    }

}

