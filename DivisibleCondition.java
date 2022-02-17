import java.util.Scanner;
class DivisibleCondition {
    public static void main(String[] args)
    {
    	Scanner get=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int num=get.nextInt();
    	if(num%3==0 && num%5==0) {
    		System.out.println("fizzbuzz");
    		
    	}else if(num%5==0) {
    		System.out.println("buzz");
    	}else if(num%3==0 )	
    		
    	{
    		System.out.println("fizz");	
    	}else 
    	{
    		
    		System.out.println("The number is neither divisible by 3 nor by 5");
    	}
    }
}
