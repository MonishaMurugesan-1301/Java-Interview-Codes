package operations;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Monisha";
		String b = new String("cibi");
		
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println(b.length());
		
	    String c = "kavi";
		System.out.println(a.concat(b));
		System.out.println(a+b+c);
		System.out.println(a.concat(b).concat(c));
		
		
		String d = "      Eclipse         ";
		
		System.out.println(d.trim());
		System.out.println(d.trim().length());
		System.out.println(d.length());
		//charAt---
	
		String str = "Feature";
		System.out.println(str.charAt(5));
		
		
		//Contains --it return booleans values
		
		String e = "Selenium";
		System.out.println(e.contains("se"));
		
		
		//equals--returns boolean values
		String f = "Selenium";
		String f1 = "selenium";
		
		System.out.println(f==f1); 
		System.out.println(f.equals(f1));
		//equalsIgnore--returns boolean values
		System.out.println(f.equalsIgnoreCase(f1));
		
		
		
		//replace()
		String g="Please login to your OfficePass application and complete the check-in.";
		
		System.out.println(g.replace('e','X'));
		System.out.println(g.replace("to","and"));
		
		//substring() - to extract substring from main string
				String h="Application";
				//s.substring(s, e)
				System.out.println(h.substring(3, 7)); 
				System.out.println(h.substring(0,8)); 
				
				
				//Split
				
				
				String i  = "monisha.murugesan@capgemini.com";
				
				String arr[]=i.split("g");
					
				System.out.println(arr[0]);  
				System.out.println(arr[1]); 
				System.out.println(arr[2]); 
				
				// + - . ? # --spcl chars
				//
				
				String j="welcome";
				
				System.out.println(j.toUpperCase());
		
		
	}

}
