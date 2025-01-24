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
void printDetails(){
System.out.println(empno+empname+"earns"+salary);
}//pd
}//clas

public static void main(String[] args)
{
Employee e1= new Employee(22132,"parvez",150000);
e1.printDetails();
}