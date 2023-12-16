package access.shoppingCart;

public class Item {
    private String product;
    private int price;
    private int count;

    public Item(String product, int price, int count) {
        this.product = product;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return price * count;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
