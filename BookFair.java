import java.util.Scanner;
public class BookFair {
    String Bname;
    double price;
    BookFair()
    {
        Bname=" ";
        price=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        Bname = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }
    void calculate()
    {
        double d;
        if (price <=1000)
            d = 2.0/100 * price;
        else if (price <= 3000)
            d = 10.0/100 * price;
        else
            d = 15.0/100 * price;
        price = price - d;
    }
    void display()
    {
        System.out.println("Book name: " +Bname);
        System.out.println("Price: " +price);
    }
    public static void main (String args[])
    {
        BookFair b = new BookFair();
        b.input();
        b.calculate();
        b.display();
    }

}
