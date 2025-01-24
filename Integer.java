import java.util.Scanner;
class Integer{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int num=scan.nextInt();
if(num%2==0)
{
  System.out.println("even number");
}
else
{
System.out.println("odd number");
}
}
}
