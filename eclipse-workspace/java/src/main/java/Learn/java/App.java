package Learn.java;


public class App {
	//this is constructor 
             App() {
	
                    }
             
             //this is multiline initializer 
             
             {
            	 System.out.println("this non static multiline initializer ");
             }
             

	//THIS IS WIDEING TYPE CASTING 
	static int a=35;
    public static void main( String[] args )
    {
    App a3= new App();
    }
   
    {
    	System.out.println("hi");
    }
    private void narr() {
		// TODO Auto-generated method stub
    	  double b=a;
          System.out.println(b);

	}
    //THIS IS THE WIDEING 
    public static  void mna() {
    	
	    short c = (short)a;
		System.out.println(c);
		c++;
	    		
	}
    
    
}

