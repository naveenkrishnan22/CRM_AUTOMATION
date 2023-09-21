package maven.brokenlink;

public class Swapping {
 public static void main(String[] args) {
	int a = 122;
	int b = 200;
//	int c;
//	System.out.println("A value "+a+" B value "+b);
//	c=a;
//	a=b;
//	b=c;
//	
//	System.out.println("A value "+a+" B value "+b);
	
	//this is the formula methods in swapping programming 
	System.out.println("first"+a+"second"+b);
	a=a-b;
	b=a+b;
	a=b-a;
	System.out.println(" after swapping first"+a+"second"+b);
			 
			 }
}
