package Day8;
import java.util.Scanner;


public class Demo {

    public Hotel provideFood(int amount){
      if(amount>1000){
          Hotel h1 = new TajHotel();
          return h1;
      }
      else if(amount>200&&amount<=1000){
          Hotel h2 = new RoadSideHotel();
          return h2;
      }
      return null;
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Amount");
         int amount = sc.nextInt();
         Demo d1 = new Demo();

         Hotel h = d1.provideFood(amount);

         if(h!=null){
             h.chickenBiryani();
             h.masalaDosa();

             if(h instanceof TajHotel){
                 TajHotel taj = (TajHotel)h;
                 taj.WelcomeDrink();
             }
         }
         else{
             System.out.println("please enter valid Amount");
         }
         sc.close();
    }
    
}
