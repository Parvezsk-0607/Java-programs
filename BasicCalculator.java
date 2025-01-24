import java.util.Scanner;
class BasicCalculator{
public static void main(String[] args){
 Scanner s= new Scanner(System.in);
System.out.println("enter 2 numbers");
int n1=s.nextInt();
int n2=s.nextInt();
System.out.println("enter an operator");
char c=s.next().charAt(0);
int ans=0;
switch(c){
case '+': 
      ans=n1+n2;
      System.out.println("result" + ans);
      break;
case '-':
      ans=n1-n2;
      System.out.println("result" + ans);
      break;
case '*':
      ans=n1*n2;
      System.out.println("result" + ans);
      break;
case '/':
      if(n2!=0){
      ans=n1/n2;
      System.out.println("result" + ans);
}
      else{
      System.out.println("false");
}
      break;
case '%':
      if(n2!=0){
      ans=n1%n2;
      System.out.println("result" + ans);
}
      else{
      System.out.println("false");
}
      break;
default:
      System.out.println("Invalid operator");
}
}
}