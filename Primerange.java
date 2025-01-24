
class Primerange
{
public static void main(String args[])
{
int start=1,end=100;
for(int k=start;k<=end;k++){
int n=k;
if(n==1){
System.out.println("1 is not a prime");
continue;
}
int f=0;
for(int i=2;i<n;i++) //for(int i=2;i<=(int)Math.sqrt(n);i++) //efficient logic
{
if(n%i==0)
{
//System.out.println("is not a prime");
f=1;
break;
}
}
if(f==0)
{
System.out.println("is prime"+k);
}}

}
}

