package Stock;

import java.util.HashMap;
import java.util.Map;

public class Print_stock_details {
    public Print_stock_details(){}
    public void print_stock_details()
    {
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("     BranchId         |"+"     Medicine          |"+"     Quantity         |"+"     Price      |");
        System.out.println("------------------------------------------------------------------------------------------------");
        for(HashMap<Integer,Stock_details> details:Add_stock.stock)
        {
            for(Map.Entry<Integer,Stock_details> stock_details : details.entrySet())
            {
                System.out.print("     "+stock_details.getKey()+"         |");
                System.out.print("     "+stock_details.getValue().getMedicine()+"         |");
                System.out.print("     "+stock_details.getValue().getQuantity()+"         |");
                System.out.println("     "+stock_details.getValue().getPrice()+"         |");
                System.out.println("------------------------------------------------------------------------------------------------");
            }
        }

    }
}
