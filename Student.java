class Student
{
int vtuno;
String name;
String dept;
String fathername;
String mothername;
long contactnumber;
float marks[]=new float[15];

float findCGPA(int nSubjects){
flaot x=0;
for(int i=0;i<nSubjects;i++)
x=x+mark[i];
return x/nsubjects;
}
void printdetails(){
System.out.println(vtuno);
System.out.println(name);
System.out.println(dept);
System.out.println(fathername);
System.out.println(mothername);
System.out.println(contactnumber);
marks={70,80,88,75,90,95};
}
Student(int vtuno,String name,String dept,long contactnumber,String fathername,String mothername)
{
this.vtuno=vtuno;
this.name=name;
this.dept=dept;
this.contactnumber=contactnumber;
this.fathername=fathername;
this.mothername=mothername;
}
public static void main(String args[]){
Student s1=new Student(22722,"akhilan","CSE",9988776655L,"Karthikeyan","Niranjana");
s1.marks=new float[]{70,80,88,75,90,95};
float ans1=s1.findCGPA(9);
System.out.println(ans1);
s1.printdetails();
s1.findCGPA();

Student s2=new Student(221322,"parvez","CSE",9988776655L,"khadarbasha","shakeela banu");
s2.marks=new float[]{70,80,88,75,90,95};
float ans2=s2.findCGPA(9);
System.out.println(ans2);
s2.printdetails();
s2.findCGPA();
}
}
