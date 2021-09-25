import java.util.Scanner;
class empdb {
public static void main(String[] args ){
Scanner in = new Scanner(System.in);
System.out.println("Enter emp id: ");
int x = in.nextInt();
System.out.print("Enter a emp name: ");
Scanner sc= new Scanner(System.in);
String str= sc.nextLine();
System.out.println("Enter emp salary : ");
Double sal = in. nextDouble();
double da , hra ,pf, gp =0.00, np=0.00,esi;
da = 0.01*sal;
hra=0.02*sal;
pf=0.03*sal;
esi=0.025*sal;
gp = sal+ da+hra+pf+esi;
np = gp - pf;
System.out.println(" emp name: "+str);
System.out.println(" emp id: "+x);
System.out.println("Basic salary: "+sal);
System.out.println("HRA: "+hra);
System.out.println("PF: "+pf);
System.out.println("TA: "+da);
System.out.println("GP: "+gp);
System.out.println("NP "+np);
System.out.println("ESI "+esi);
}
}