import java.util.*;
public class HarshadNumber{

    public static void main(String args[])
    	 {
    	 	Scanner sc=new Scanner(System.in);
    	 	int n,sum=0,rem;
    	 	System.out.println("Input a number");
    	 	n=sc.nextInt();
			int c=n;
    	 	while(n>0)
    	 	{
    	 		rem=n%10;
    	 		sum=sum+rem;
    	 		n=n/10;

    	 	}
    	 	if(c%sum==0)
    	 	System.out.println(c+" is a Harshad Number");
    	 	else
    	 	System.out.println(c+" is not a Harshad Number");
			 sc.close();
    }

}
