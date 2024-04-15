package Transaction;

import java.util.HashMap;
import java.util.Scanner;

public class Print_transaction_details {

    public void print_t_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer Id : ");
        int customer_id=sc.nextInt();

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("     CustomerId     | "+"     BranchId     | "+"     TransactionId     | "+"     Product     | "+"     Quantity     | "+"     Price     | ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for(HashMap<Integer,Transaction_details> details: Transaction.transactions)
        {
            if(details.containsKey(customer_id)){
                System.out.print("      "+customer_id+"     | ");
                System.out.print("      "+details.get(customer_id).getBranch_id()+"     | ");
                System.out.print("      "+details.get(customer_id).getTransaction_id()+"     | ");
                System.out.print("      "+details.get(customer_id).getProduct()+"     | ");
                System.out.print("      "+details.get(customer_id).getQuantity()+"     | ");
                System.out.println("      "+details.get(customer_id).getPrice()+"     | ");
                System.out.println("--------------------------------------------------------------------------------------------------------------");



            }
        }
    }

}
