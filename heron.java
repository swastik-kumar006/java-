import java.util.*;
public class heron
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s1,s2,s3;
        double area, resArea;
        System.out.println("Enter the values");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        area = (s1+s2+s3)/2.0d;
        resArea = Math.sqrt(area* (area - s1) * (area - s2) * (area - s3));
        System.out.println("Area of Triangle = " + resArea);
        sc.close();
    
    }
}