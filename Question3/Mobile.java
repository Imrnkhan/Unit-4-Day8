package Question3;

public class Mobile {
    
   
	
        public void checkModel(String name,String...str)
        {
            if(name!=null)
            {
                System.out.println("Company Name: "+name);
                for(String a:str)
                {
                    System.out.println(a);
                }
            }
            else
            {
                for(String z:str)
                {
                    System.out.println(z);
                }
            }
            
            String[] outdatedModels = {"note4","note5","note6","note7"};
             for(String x:outdatedModels)
             {
                 for(String y:str)
                 {
                     if(x.equals(y))
                     {
                         System.out.println(x+"-OUTDATED");
                     }
                     
                 }
                 
             }
        }
        
        
        public static void main(String[] args) {
              
             Mobile m = new Mobile();
               m.checkModel("Samsung");
        }
}
