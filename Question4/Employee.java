package Question4;

import java.util.Scanner;

public class Employee {
   
    public double calculateAverage(int[] age)
	{
		
	    if(age.length>=2)
		  {
			double averageAge;
			
			int sum=0;
			for(int x:age)
			{
				if(x>=28&&x<=40)
				{
					sum +=x;
				}
				else
				{
					return 2.0;
				}
				
			}
			averageAge = sum/age.length;
			
			return averageAge;
		}
		else
			return 0.0;
		
	}
	
	public static void main(String[] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter total no.of employees:");
		  int totalEmployee = sc.nextInt();
		  
		  int[] array=new int[totalEmployee]; 
		  
		  System.out.println("Enter the Age for "+totalEmployee+" employees:");
		   
		  for(int i=0;i<totalEmployee;i++)
		  {
			  array[i]=sc.nextInt();
		  }
		  
		  Employee e = new Employee();
		  double averageAge = e.calculateAverage(array);
		  
		  if(averageAge==0.0)
		  {
			  System.out.println("Please enter a valid employee count");
		  }
		  else if(averageAge==2.0)
		  {
			  System.out.println("Invalid age encountered!");
		  }
		  else
		  System.out.println("The average age is "+averageAge);
	
		  sc.close();
        }
    }
    