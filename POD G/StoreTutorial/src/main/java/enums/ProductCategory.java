package enums;

public enum ProductCategory {
    JUICE("Juice"), BREAD("Bread");

    private final String name;

    ProductCategory(String categoryName) {
        this.name = categoryName;
    }

    public String getName() {
        return name;
    }
}
