package operations;

public class StringBufferTest {

	public static void main(String[] args) {
		
		//immutable
		/*String a = "Monisha";
		a = a + "Murugesan";
		System.out.println(a); */
		
		//mutable
		StringBuffer sb = new StringBuffer("Monisha");
		sb = new StringBuffer("Monisha Murugesan");
		System.out.println(sb);
		sb = sb.append("Murugesan");
		System.out.println(sb);
		
		StringBuffer c = new StringBuffer("Monisha");
		c = new StringBuffer("Monisha Murugesan");
		System.out.println(c);
		c = c.append("pranesh");
		System.out.println(c);
		
		StringBuilder d = new StringBuilder("Monisha");
		c = new StringBuffer("Monisha Murugesan");
		System.out.println(c);
		c = c.append("pranesh");
		System.out.println(c);
		
	}

}
