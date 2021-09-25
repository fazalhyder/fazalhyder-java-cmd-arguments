import java.util.Scanner;
public class Test {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.println("Enter student id: ");
int x = in.nextInt();
System.out.print("Enter a student name: ");
Scanner sc= new Scanner(System.in); 
String str= sc.nextLine();
System.out.println(" student id: "+x);
System.out.println(" student name: "+str);

String arg1 = args[0];
String arg2 = args[1];
String arg3 = args[2];
String arg4 = args[3];
String arg5 = args[4];
String arg6 = args[5];
int a = Integer.parseInt(arg1);
int c = Integer.parseInt(arg2);
int d = Integer.parseInt(arg3);
int e = Integer.parseInt(arg4);
int f = Integer.parseInt(arg5);
int g = Integer.parseInt(arg6);
int avg,tm=a+c+d+e+f+g;
System.out.println(" student marks subject 1 : "+a);
System.out.println(" student marks subject 2 : "+c);
System.out.println(" student marks subject 3 : "+d);
System.out.println(" student marks subject 4 : "+e);
System.out.println(" student marks subject 5 : "+f);
System.out.println(" student marks subject 6 : "+g);
avg = tm/6;
System.out.print("total marks  "+tm);
System.out.print(" avg marks "+avg);

}
}