package Learn.java;

public class Encapsu {
	
	private int a=10;
	private String  b= "hi this is my fees rate ";
	private String c="this is not your fees give me more 20 coins ";
	private int d=23;
public void setA(int a) {
	this.a=a;
}
public int getA()
{
	return a;
	}
public void setB(String b) {
	this.b=b;
	
}
public String getB() {
	return b;
}
public void setC(String c) {
	this.c=c;
	
}
public String getC() {
	return c;
}
public void setD(int d)
{
	this.d=d;
	}
public int getD() {
	return d;	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsu ob=new Encapsu();
		ob.setA(10);
		System.out.println(ob.getA());
		ob.setB("hi this is naveen");
		System.out.println(ob.getB());
		ob.setC("hi this is your 10 dollar money ");
		System.out.println(ob.getC());
        ob.setD(22);
        System.out.println(ob.getD());
	}

}
