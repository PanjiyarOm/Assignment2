import java.util.Scanner;
class WeekDay {
    public static void main(String[] args)
    {
    	
    	Scanner get=new Scanner(System.in);
    	System.out.println("Enter the week number");
    	int weeknumber=get.nextInt();
    	String weekdays[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    	for(int i=1; i<=7; i++)
    	{
    		
    		if(weeknumber==i){
    				System.out.println("The weekday is "+ weekdays[i-1]);
    			
    		}
    	}
    	System.out.println("There is no such weeknumber");
    }
}
