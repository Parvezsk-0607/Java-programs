import java.util.Scanner;
class Month{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("enter the month");
int num=scan.nextInt();
if(num==1){
System.out.println("January has 31 days");
}
else if(num==2){
System.out.println("February has 28 or 29 days");
}
else if(num==3){
System.out.println("march has 31 days");
}
else if(num==4){
System.out.println("april has 30 days");
}
else if(num==5){
System.out.println("may has 31 days");
}
else if(num==6){
System.out.println("june has 30 days");
}
else if(num==7){
System.out.println("july has 31 days");
}
else if(num==8){
System.out.println("august has 31 days");
}
else if(num==9){
System.out.println("september has 30 days");
}
else if(num==10){
System.out.println("october has 31 days");
}
else if(num==11){
System.out.println("november has 30 days");
}
else if(num==12){
System.out.println("december has 31  days");
}
else{
System.out.println("invalid input");
}
}
}
