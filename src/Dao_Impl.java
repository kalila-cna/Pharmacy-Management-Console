import Branch.Branch;
import Purchase.Purchase_products;
import Stock.Add_stock;
import Stock.Alternate_product;
import Stock.Print_stock_details;
import Transaction.Print_transaction_details;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Dao_Impl {
    public static void run(){
        System.out.println("Welcome to pharmacy");
        boolean flag=true;

        while(flag)
        {
            System.out.println("\n1.Add branch");
            System.out.println("2.Add stock to pharmacy branch");
            System.out.println("3.Associate alternate products");
            System.out.println("4.Add customer");
            System.out.println("5.Purchase Products");
            System.out.println("6.Print customer purchase summary");
            System.out.println("7.Print branch summary");
            System.out.println("8.Print Stocks summary");
            System.out.println("9.Exit");

            System.out.println("Enter an option:");
            Scanner sc=new Scanner(System.in);
            int choice;
            try {
                choice = sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Input Mismatch. Try again!");
                continue;
            }


            switch (choice)
            {
                case 1:
                    Branch new_branch=new Branch();
                    new_branch.addBranch();
                    break;
                case 2:
                    Add_stock new_stock = new Add_stock();
                    new_stock.add_stock();
                    break;
                case 3:
                    Alternate_product alternate=new Alternate_product();
                    alternate.add_alternate();
                    break;
                case 5:
                    Purchase_products purchaseProducts = new Purchase_products();
                    purchaseProducts.purchase();
                    break;
                case 6:
                    Print_transaction_details t_details = new Print_transaction_details();
                    t_details.print_t_details();
                    break;
                case 7:
                    Branch.print_branch();
                    break;
                case 8:
                    Print_stock_details details=new Print_stock_details();
                    details.print_stock_details();
                    break;
                case 9:
                    System.out.println("Thank you for visiting the pharmacy !");
                    flag=false;
                    break;
                default:
                    System.out.println("You have entered wrong option");
            }
        }
    }
}