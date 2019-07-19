public class User {
    private String name;
    private String emailAddress;
    private ShoppingCart shoppingCart;

    public User(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ShoppingCart createShopingCart() {
        this.shoppingCart = new ShoppingCart(this);
        return this.shoppingCart;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}