package Purchase;

public interface Purchase {
    void purchase();
    boolean product_available(int branch_id,String product,int quantity,int customer_id);
    boolean alternate_product_available(int branch_id,String product,int quantity);
    int next_branch_availability(String product,int quantity);
}
