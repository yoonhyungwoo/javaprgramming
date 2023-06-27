// 아이템 주석
public class Item{

    private String name;
    private String price;
    private String quantity;

    public Item(String name, String price, String quantity)
    {
        super();

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getprice() {
        return price;
    }
    public void setprice(String price) {
        this.price = price;
    }
    public String getquantity() {
        return quantity;
    }
    public void setquantity(String quantity) {
        this.quantity = quantity;
    }
    public String toString() {
        return name+price+quantity;
    }

}
