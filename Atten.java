import java.util.*;
public class Atten
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    for(int i=1;i<=1;i++)
	    {
	        System.out.println("Enter the name:");
	        String name = sc.next();
	        
	        System.out.println("Enter the attendance");
	        int attendance=sc.nextInt()/10;
	        
	        switch(attendance)
	        {
	            case 10:
	            case 9: System.out.println(name+" grade is A"); break;
	            
	            case 8: System.out.println(name+" grade is B"); break;
	            
	            case 7: System.out.println(name+" grade is C"); break;
	            
	            case 6: System.out.println(name+" grade is D"); break;
	            
	            case 5 : System.out.println(name+" grade is E"); break;
	            
	            default : System.out.println(name+" grade is F"); 
	        }
	    }
	}
}
