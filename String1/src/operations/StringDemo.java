package operations;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Java";
		String S1 = "abcdef";
		
		String s1 = new String("demoo");
		
		System.out.println(s);
		
		System.out.println(S1);
		System.out.println(s1);
		
		System.out.println(S1.length());
		System.out.println(s1.length());
		
		//concat--return the adding of the two strings 
	
		String a = "Automation";
		String b = "Testing";
		//no space in o/p
		String c = "Java";
		
		System.out.println(a.concat(b));
		System.out.println(a.concat(b).concat(c));
		
		System.out.println(a+b+c+c);
		
		String d = "      Automation           Selenium";
		System.out.println(d.trim()); //not trimming the space for 2 words
		
		//System.out.println(d);
		System.out.println(d.trim().length());
		
		System.out.println(d.length());
		
		//charAt----
		String str = "Eclipse";
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(0));
		
		//Contains --it returns boolean values
		
		String e = "Eclipse";
		System.out.println(e.contains("cli"));
		System.out.println(e.contains("Cli"));
		//false bcoz upper case letter
		
		String f = "Java";
		String f1 = "java";
		
		System.out.println(f.equals(f1));
		
		System.out.println(f.equalsIgnoreCase(f1));
		
		//replace()
		String g ="Welcome to Capgemini";
		
		System.out.println(g.replace('e','z'));
		System.out.println(g.replace("to","at"));
		
		//substring() - to extract substring from main string
		String h ="Welcome";
		//h.substring(
		
		System.out.println(h.substring(2, 5));
		System.out.println(h.substring(0, 6));
		
		//split
		String i = "zxc@gmail.com";
		String arr[]=i.split("@"); 
		System.out.println(arr[0]);   //zxc
		System.out.println(arr[1]);   //gmail.com
		//+ - . ? # --spcl characters
		
		//upper case -- lower case
		
		String j = "capgemini";
		System.out.println(j.toUpperCase());
		
		String k = "AUTOMATION TESTING";
		System.out.println(k.toLowerCase());
		
	}
	

}
