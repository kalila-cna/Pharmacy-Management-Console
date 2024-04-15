package Transaction;

import java.util.ArrayList;
import java.util.HashMap;

public class Transaction {

    public static ArrayList<HashMap<Integer,Transaction_details>> transactions= new ArrayList<>();

    public void add_transaction(int customer_id,Transaction_details transactionDetails){
        HashMap<Integer,Transaction_details> add_transaction = new HashMap<>();
        add_transaction.put(customer_id,transactionDetails);

        transactions.add(add_transaction);
    }
}
