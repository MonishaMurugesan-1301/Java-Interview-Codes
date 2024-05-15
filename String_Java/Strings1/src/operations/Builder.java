package operations;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder a = new StringBuilder("Monisha");
		StringBuilder a1 = new StringBuilder("monisha");
		System.out.println(a.equals(a1));
		System.out.println(a);
		System.out.println(a1);
		
		a= a.append("pranesh");
		System.out.println(a);

		
		a.insert(0, "kavi");
		System.out.println(a);
		
		a.deleteCharAt(0);
		System.out.println(a);
		
		a.delete(0, 4);
		System.out.println(a);
		
		a.reverse();
		System.out.println(a);
		
		a.capacity();
		System.out.println(a.capacity());
		System.out.println(a.compareTo(a1));
	}

}
