package interface_prac;

import java.util.Scanner;

interface Payment{
    void Pay();
}

class UpiPayment implements Payment{
   public void Pay(){
        System.out.println("UpiPayment");
    }
}
class NetBanking implements Payment{
    public void Pay(){
        System.out.println("NetBanking");
    }
}

class Checkout{
    void ProcessPayment(Payment payment){
        payment.Pay();
    }
}
public class Loose_coupling {
    public static void main(String[] args) {
        Payment p = new NetBanking();
        Payment pp = new UpiPayment();

        Checkout ck = new Checkout();
//        ck.ProcessPayment(p);
//        ck.ProcessPayment(pp);

        System.out.println("1: Net banking");
        System.out.println("2: upi banking");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        switch (userInput){
            case 1 :
                ck.ProcessPayment(p);
                break;

            case 2 :
                ck.ProcessPayment(pp);
                break;
            default:
                System.out.println("Invalid input");
        }

    }


}
