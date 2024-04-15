package Stock;

public class Stock_details {
    private int branch_id;
    private String medicine;
    private int quantity;
    private double price;
    private double single_quantity_price;

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSingle_quantity_price() {
        return single_quantity_price;
    }

    public void setSingle_quantity_price(double single_quantity_price) {
        this.single_quantity_price = single_quantity_price;
    }
}
