package Purchase;

import Stock.Add_stock;
import Stock.Alternate_product;
import Stock.Stock_details;
import Transaction.Transaction_details;
import Transaction.Transaction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Purchase_products implements Purchase{

    public void purchase()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer id : ");
        int customer_id=sc.nextInt();
        System.out.println("Enter Branch : ");
        int branch_id=sc.nextInt();
        System.out.println("Enter product : ");
        String product=sc.next();
        System.out.println("Enter the Quantity : ");
        int quantity=sc.nextInt();

        if(product_available(branch_id,product,quantity,customer_id)) {
            System.out.println("Product Successfully Purchased");

        }
        else if(alternate_product_available(branch_id,product,quantity)) {
            System.out.println("Alternate Product available - "+ Alternate_product.alternates.get(product));
        }
        else{
            if(next_branch_availability(product,quantity) != -1){
                int branch_no=next_branch_availability(product,quantity);
                System.out.println("It is available in branch "+ branch_no);
            }
        }


    }

    public boolean product_available(int branch_id,String product,int quantity,int customer_id)
    {
        for(HashMap<Integer, Stock_details> stock_details: Add_stock.stock) {
            if (stock_details.containsKey(branch_id)) {
                String medicine = stock_details.get(branch_id).getMedicine();
                Stock_details stock_object= stock_details.get(branch_id);
                if (medicine.equalsIgnoreCase(product) && stock_object.getQuantity() >= quantity) {
                    stock_object.setQuantity(stock_object.getQuantity() - quantity);
                    stock_object.setPrice(Math.round(stock_object.getPrice() - quantity * stock_object.getSingle_quantity_price()));

                    Transaction_details t_details=new Transaction_details();
                    t_details.setBranch_id(branch_id);
                    t_details.setProduct(product);
                    t_details.setQuantity(quantity);
                    t_details.setTransaction_id(Transaction.transactions.size() + 1);
                    t_details.setPrice(Math.round(stock_details.get(branch_id).getSingle_quantity_price() * quantity));
                    Transaction transaction = new Transaction();
                    transaction.add_transaction(customer_id,t_details);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean alternate_product_available(int branch_id,String product,int quantity)
    {
        for(HashMap<Integer, Stock_details> stock_details: Add_stock.stock) {
            String alternate_product_name=Alternate_product.alternates.get(product);
            if (stock_details.containsKey(branch_id) && stock_details.get(branch_id).getMedicine().equalsIgnoreCase(alternate_product_name)) {
                return true;
            }
        }
        return false;
    }

    public int next_branch_availability(String product,int quantity){
        for(HashMap<Integer,Stock_details> stock_details : Add_stock.stock){
            for(Map.Entry<Integer,Stock_details> details:stock_details.entrySet()){
                if(details.getValue().getMedicine().equalsIgnoreCase(product) && details.getValue().getQuantity() >= quantity){
                    return details.getKey();
                }
            }
        }
        return -1;
    }
}
