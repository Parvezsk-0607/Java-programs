import java.util.Scanner;
class Fib
{
public static void main(String args[])
{
Scanner scan= new Scanner(System.in);
int n=scan.nextInt();
int a =1;
int b=1;

for(int i=0;i<n;i++){
int c=a+b;
System.out.println(c);
 a=b;
 b=c;
}
}
}