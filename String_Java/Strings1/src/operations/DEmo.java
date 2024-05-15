package operations;

public class DEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Java";
		//String s1 ="java";
		
		
		String S1 = new String("Java");
		   
		
		System.out.println(S1);
		System.out.println(s);
		//System.out.println(s1);
		
		System.out.println(S1.length());
		
		//Concat--return the adding of the two strings
		
		String a = "JAVA";
		String b = "Automation";
		System.out.println(a.concat(b));
		
		String c = "Testing";
		
		
		System.out.println(a+b+c);
		System.out.println(a.concat(b).concat(c));
		
		String a1 = "      Automation         ";
		
	//	System.out.println(a1.trim());
		System.out.println(a1.trim().length());
		System.out.println(a1.length());
		//charAt---
	
		//String str = "Selenium";
		//System.out.println(str.charAt(7));
		
		
		//Contains --it return booleans values
		
		String b1 = "Selenium";
		System.out.println(b1.contains("se"));
		
		
		//equals--returns boolean values
		String b2 = "Selenium";
		String b3 = "selenium";
		System.out.println(b2.equals(b3));
		//equalsIgnore--returns boolean values
		System.out.println(b2.equalsIgnoreCase(b3));
		
		
		
		//replace()
		String s1="welcome to selenium automation testing selenium training";
		
		System.out.println(s1.replace('e','X'));
		System.out.println(s1.replace("to","and"));
		
		//substring() - to extract substring from main string
				s="welcome";
				//s.substring(s, e)
				System.out.println(s.substring(2, 5)); 
				System.out.println(s.substring(0,6)); 
				
				
				//Split
				
				
				String s2  = "XYZ@GMAL.COM";
				
				String arr[]=s2.split("Y");
					
				System.out.println(arr[0]);  
				System.out.println(arr[1]); 
				
				// + - . ? #
				//
				
				s="welcome";
				
				System.out.println(s.toUpperCase());
		
		
		
		
		
		
		
	}

}
