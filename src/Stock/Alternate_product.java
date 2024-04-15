package Stock;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alternate_product {
    public static HashMap<String,String> alternates= new HashMap<>();

    public void add_alternate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the medicine name: ");
        String medicine=sc.next();
        System.out.println("Enter the alternate medicine name: ");
        String alternate_medicine=sc.next();

        alternates.put(medicine,alternate_medicine);
    }

    public void print_alternates()
    {
        System.out.println("-------------------------------------------------");
        System.out.println("     Medicine     |   "+ "     Alternate     |   ");
        System.out.println("-------------------------------------------------");
        for(Map.Entry<String,String> alternates:alternates.entrySet())
        {
            System.out.println("     "+alternates.getKey() +"     |"+ "     "+alternates.getValue()+"     |");
            System.out.println("-------------------------------------------------");
        }
    }
}
