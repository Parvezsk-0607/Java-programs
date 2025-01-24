
class Primenumbers
{
public static void main(String args[])
{
int n=49;
int f=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
System.out.println("is not a prime");
f=1;
break;
}
}
if(f==0)
{
System.out.println("is prime");
}

}
}

