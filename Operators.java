import java.util.*;
public class Operators
{
public static void main(String args[])
{
int a, b, c, d, e, f;
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers : ");
a = sc.nextInt();
b = sc.nextInt();
c = a+b;
d = a-b;
e = a*b;
f = a/b;
System.out.println("Sum : " + c);
System.out.println("Difference : " + d);
System.out.println("Product : " + e);
System.out.println("Quotient : " + f);
}
}