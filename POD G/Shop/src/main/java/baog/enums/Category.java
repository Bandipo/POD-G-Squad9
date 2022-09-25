package baog.enums;

public enum Category {
    JUICE("Juice"), BREAD("Bread");

    private final String name;

    Category(String categoryName) {
        this.name = categoryName;
    }

    public String getName() {
        return name;
    }
}
