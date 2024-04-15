package Branch;

import java.util.*;

public class Branch {


    static ArrayList<HashMap<Integer,Branch_details>> branches = new ArrayList<>();


    public Branch(){}



    public void addBranch() {

        HashMap<Integer,Branch_details> new_branch= new HashMap<>();

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter branch id:");
        int branch_id=sc.nextInt();

        if(already_branch_exist(branch_id))
        {
            System.out.println("Sorry branch already exists! Try adding another");
            return;
        }

        System.out.println("Enter Branch Location");
        String branch_location=sc.next();
        System.out.println("Enter phone number");
        long phone_no=sc.nextLong();

        Branch_details branch=new Branch_details();
        branch.setBranch_id(branch_id);
        branch.setBranch_location(branch_location);
        branch.setPhone_no(phone_no);

        new_branch.put(branch_id,branch);
        branches.add(new_branch);

    }

    public static void print_branch()
    {
        System.out.println("BranchId           "+"Branch Location                 "  +"Phone number           ");
        System.out.println("----------------------------------------------------------------------------------");
        for(Map<Integer,Branch_details> branch:branches)
        {
            for(Map.Entry<Integer,Branch_details> details:branch.entrySet())
            {


                System.out.print(details.getKey() + "         |             ");
                System.out.print(details.getValue().getBranch_location() + "            |            ");
                System.out.println(details.getValue().getPhone_no()+"            |   ");
                System.out.println("----------------------------------------------------------------------------------");

            }
        }
    }

    public boolean already_branch_exist(int branch_id)
    {
        for(HashMap<Integer,Branch_details> branch:branches)
        {
            if((branch.containsKey(branch_id)))
            {
                return true;
            }
        }

        return false;
    }

}
