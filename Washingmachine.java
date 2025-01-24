import java.util.Scanner;
class Washingmachine
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//enter the weight and the level of the water
int weight= sc.nextInt();
String level=sc.next();
if(weight <= 2000)
{
    if(level.equals("L"))
	System.out.println("Time Estimated: 25 Minutes");
 else
   	System.out.println("invalid");
 
	}
else if(weight >2000||weight<=4000)
{
	if(level.equals("M"))
		System.out.println("Time Estimated:35 Minutes");
	else
		System.out.println("invalid");
}
else if(weight>4000||weight<=7000)
{
	if(level.equals("H"))
		System.out.println("Time Estimated:45 Minutes");
	else
		System.out.println("invalid");
}
else if(weight>7000)
{
		System.out.println("OVERLOADED");
	
}

	else{
		System.out.println("Invalid input");
}


}
}