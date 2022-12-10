package practice;
import java.lang.Integer;

public class Wrapper {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			//variabal a
			Integer a=10;
			
		//int to byte
		
         Byte byteval=a.byteValue();
         System.out.println("after converting int to byte " + byteval);
         
    
        
 		
 		//int to double
 		Double doubleval = a.doubleValue();
 		System.out.println("after converting int to double " + doubleval);
        
 		
 		//int to long 
 		
 		Long longval = a.longValue();
 		System.out.println("after converting int to long " + longval);
        
 		//int to float
 		
 		Float floatval=a.floatValue();
 		System.out.println("after converting int to float " + floatval);
        
 		
 		//int to string 
 		String stringval=a.toString();
 		System.out.println("after converting int to string " + stringval);
        
 		
 				
		String myString = " 10";
		//String to Integer

		int numberval = Integer.parseInt(myString.trim());
		System.out.println( "value is  "+numberval);
		
		//chat to string
		char c='A';
		  String s = Character.toString(c);
		  System.out.println("value after coversion is " + s);
		  
		  // call append method  and capacity method
		  StringBuilder str = new StringBuilder();
		  
	        str.append("mystringappend");
	        int capacity= str.capacity();
	        
	        System.out.println(str + " " +"capacity is  "+ capacity );
		}}