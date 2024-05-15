package operations;

public class StringComparison {

	public static void main(String[] args) {
		
		String a = "Welcome";
		String b = "Welcome";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
		String a1 = "Java";
		String b1 = "java";
		
		System.out.println(a1==b1);
		System.out.println(a1.equals(b1));
		
		String c = "Welcome";
		String d = "java";
		
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		String c1 = "Welcome";
		String d1= new String("Welcome");
		//== --> comparing variable,  .equals --> comparing the object 
		System.out.println(c1==d1);
		System.out.println(c1.equals(d1));
		
		String a2 = "Java";
		String b2 = new String("java");
		
		System.out.println(a2==b2);
		System.out.println(a2.equals(b2));
		
		
		//case3
		
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		
		System.out.println(s3);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3==s2);
		System.out.println(s3.equals(s2));
		
		//ex
		String s4="ABC";
		String s5=new String("Aabc");
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		String s6=new String("ABC");
		System.out.println(s4==s6);
		System.out.println(s4.equals(s6));
		
		
		
	}

}
