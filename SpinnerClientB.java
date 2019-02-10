import java.util.Scanner;
public class SpinnerClientB
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
int ansUser;
System.out.print("How many sections do you want in the spinner?");
ansUser=scan.nextInt();
SpinnerB d1=new SpinnerB();
SpinnerB d2=new SpinnerB(4);
int a,b;
a=d1.GetArrow();
b=d2.GetArrow();
System.out.println("The value of the first object is:"+a);
System.out.println("The value of the second object is:"+b);
int sum;
sum=a+b;
System.out.println("The sum of the arrow values is:"+sum);
d1.spin(ansUser);
d2.spin(ansUser);
boolean ans;
ans=d1.equals(d2);
if(ans=true)
System.out.println("The arrow values are equal.");
else
System.out.println("The arrow values are not equal."); 
a=d1.GetArrow();
b=d2.GetArrow();
System.out.println("The value of the first object is:"+a);
System.out.println("The value of the second object is:"+b);
sum=a+b;
System.out.println("The sum of the arrow values is:"+sum);
}
}