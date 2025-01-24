import java.util.Scanner;
class Addition{
public static void main (String args[]){
Scanner scan = new Scanner (System. in);
System.out.println("Addition of two numbers:");
int num1 = scan.nextInt();
int num2 = scan.nextInt();
int sum = 0;
sum = num1+num2;
System.out.print(sum + "is the sum of two numbers");
}
}