public class PracticeMethod {
    public String costumer_name;
    public int costumer_id;
    public long costumer_phone_no;
    public String costumer_address;
    public long customerContact;

    public void costumerDetails(){
        System.out.println("**************** Costumer Detail ***************");
        System.out.println("costumer name: "+costumer_name);
        System.out.println("costumer ID: "+costumer_id);
        System.out.println("costumer phone no: "+costumer_phone_no);
        System.out.println("costumer address: "+costumer_address);
        System.out.println();
    }
    public void orderDetails(double a, double b){
        System.out.println("****************************************************");
        if (a>=1){
        System.out.println("your order is placing...");
        System.out.println("Total Cost is : "+ a*b);
        }
        else{
            System.out.println("please select any order");
        }
    }
    public void updateCustomerNo(PracticeMethod Number){
        Number.customerContact = 9381587797L;
    }
}
