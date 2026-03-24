import java.util.*;
public class pizza {
    protected int price;
    private Boolean veg;

    protected int extracheese=100;
    protected int extratopping=150;
    protected   int pack=20;

    protected int baseprice;

    private boolean isextracheese=false;
    private boolean isextratooping=false;
    private boolean takeaway=false;
      Scanner sc=new Scanner(System.in);

      public pizza(boolean veg){
          this.veg=veg;

          if(this.veg){
              this.price=300;
          }else {
              this.price=400;
          }
          baseprice=this.price;
      }
      public void addextracheese(){
          System.out.println("add cheese(y/n)");
          char ch=sc.next().charAt(0);
          switch (ch){
              case ('y'):
                  isextracheese=true;
                  this.price+=extracheese;
                  break;
              case ('n'):
                  isextracheese=false;
                  break;
          }
      }
      public void addextratopping(){
          System.out.println("want extra tooping(y/n)");
          char ch=sc.next().charAt(0);
          switch (ch){
              case ('y'):
                  isextratooping=true;
                  this.price+=extratopping;
                  break;
              case ('n'):
                  isextratooping=false;
                  break;
          }

      }
      public void setTakeaway(){
          System.out.println("take away(y/n)");
          char ch=sc.next().charAt(0);
          switch (ch){
              case ('y'):
                  takeaway=true;
                  this.price+=pack;
                  break;
              case ('n'):
                  takeaway=false;
                  break;
          }

      }
      public void getbill(){
          String bill=" ";
          System.out.println("pizza:"+baseprice);
          if(isextracheese){
              bill+="extra cheese:"+extracheese+ "\n";
          }
          if (isextratooping){
              bill+="extra topping:"+extratopping+ "\n";
          }
          if (takeaway){
              bill+="take away:"+pack+ "\n";
          }
          bill += "\nTotal amount: " + this.price + "\n";

          System.out.println(bill);
          System.out.println("\n\n thank you!------visit again.....");



      }

}
