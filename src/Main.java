import java.util.Scanner;
import java.util.*;

class Main{
    public static void main(String[] args){
        System.out.println("------------ well come to pizza mall!---------");
        System.out.println("chose  \n 1.veg pizza \n 2.non-veg pizza \n 3.delux veg pizza \n 4.delux non-veg pizza ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

            switch (n){
                case 1:
                    pizza veg=new pizza(true);
                    veg.addextracheese();
                    veg.addextratopping();
                    veg.setTakeaway();
                    veg.getbill();
                    break;
                case 2:
                    pizza nonveg=new pizza(false);
                    nonveg.addextratopping();
                    nonveg.addextracheese();
                    nonveg.setTakeaway();
                    nonveg.getbill();
                    break;
                case 3:
                    deluxpizza dveg=new deluxpizza(true);
                    dveg.baseprice =550;
                    dveg.addextracheese();
                    dveg.addextratopping();
                    dveg.setTakeaway();
                    dveg.getbill();
                    break;
                case 4:
                    deluxpizza dnved=new deluxpizza(false);
                    dnved.baseprice=650;
                    dnved.addextracheese();
                    dnved.addextratopping();
                    dnved.setTakeaway();
                    dnved.getbill();

                    break;
                default:
                    System.out.println("invalid entry!");

            }

    }
}