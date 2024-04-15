package Stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Add_stock {
    public static ArrayList<HashMap<Integer,Stock_details>> stock = new ArrayList<>();
    public Add_stock(){}

    public void add_stock()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the branchId : ");
        int branch_id=sc.nextInt();
        System.out.println("Enter medicine name: ");
        String medicine=sc.next();
        System.out.println("Enter available quantity: ");
        int quantity=sc.nextInt();
        System.out.println("Enter the price: ");
        double price=sc.nextDouble();
        double single_quantity_price=price/quantity;

        Stock_details stock_details=new Stock_details();
        stock_details.setBranch_id(branch_id);
        stock_details.setMedicine(medicine);
        stock_details.setQuantity(quantity);
        stock_details.setPrice(price);
        stock_details.setSingle_quantity_price(single_quantity_price);

        add_new_stock(branch_id,stock_details);


    }

    public void add_new_stock(int branchId, Stock_details stockDetails) {
        HashMap<Integer,Stock_details> details = new HashMap<>();
        details.put(branchId,stockDetails);

        stock.add(details);
    }


}
