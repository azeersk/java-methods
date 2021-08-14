import java.util.Scanner;
public class PracticeOne {
    public static void main(String[] args){
        Scanner inobj = new Scanner(System.in);
        PracticeMethod costumer = new PracticeMethod();
        costumer.costumer_name = inobj.nextLine();
        costumer.costumer_id = inobj.nextInt();
        costumer.costumer_phone_no = inobj.nextLong();
        costumer.costumer_address = "telangana,khammam,nelakondapalli,chennaram";
        costumer.costumerDetails();
        double no_of_items = inobj.nextDouble();
        double cost_of_order = inobj.nextDouble();
        costumer.orderDetails(no_of_items,cost_of_order);
        costumer.customerContact = 6302757469L;
        System.out.println(costumer.customerContact);
        costumer.updateCustomerNo(costumer);
        System.out.println("ofter update the contact.....");
        System.out.println(costumer.customerContact);
    }
}
