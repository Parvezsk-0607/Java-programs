class Employee
{
int empno;
String empname;
float salary;
Employee(int en,String n,float sal){
this.empno=en;
this.empname=n;
this.salary=sal;

}//con
Employee(int n,String m){
this.empno=n;
this.empname=m;
this.salary=10116;
}

void printDetails(){
System.out.println(empno+" "+empname+" earns "+" "+salary);
}//pd
}//clas
class InstanceDemo
{
public static void main(String[] args)
{
Employee e1= new Employee(22132,"parvez",150000);

Employee e2= new Employee(23908,"surya");

e1.printDetails();
e2.printDetails();

}
}