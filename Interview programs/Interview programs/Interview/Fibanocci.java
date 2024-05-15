package Interview;

public class Fibanocci {
    public static void main(String[] args) {
        int a= 0;
        int b= 1;
        for (int i=1;i<=40;i++){
           int c = a+b;
           if(c<=300)
            System.out.println(" "+c);
            a=b;
            b=c;


        }
    }
}
