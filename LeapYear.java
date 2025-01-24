import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("enter the year");
int num=scan.nextInt();
if(num%4==0 && num%100!=0 || num%400==0){
System.out.println("it is a leap year");
}
else{
System.out.println("it is not a leap year");
}
}
}
