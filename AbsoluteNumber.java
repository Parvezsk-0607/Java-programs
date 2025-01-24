import java.util.Scanner;
class AbsoluteNumber{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int num=scan.nextInt();
if(num>0){
System.out.println("it is a positive number");
}
else
{
System.out.println("it is a absolute number"+ num*-1);
}
}
}