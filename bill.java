import java.util.Scanner;

class bill {
    double bill;
    double units;
    double amt=0.0;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed: ");
        units=sc.nextInt();
    }
    void compute()
    {
        if (units <= 100) {
            bill = units * 5.5d;
        } else if (units >= 100 && units <= 200) {
            bill = units * 6.0d;
        } else {
            bill = units * 7.0d;
        }
        amt = bill +250;
    }
    void display()
    {
        System.out.println("Net Bill: "+amt);
    }
    public static void main(String args[])
    {
        bill b = new bill();
        b.accept();
        b.compute();
        b.display();
    }
}
