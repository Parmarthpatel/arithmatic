package d.operators;

public class Assignment {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        int c;
        System.out.println(c=a+b);// c=30
        System.out.println(c+=a);// c=c+a 40
        System.out.println(c-=a);// c=c-a 30
        System.out.println(c*=a);// c=c*a 300
        System.out.println(c/=a);// c=c/a 30
        System.out.println(c%=a);// c=c%a 0
        System.out.println(c^=a);// c=c^a 10
   }
}
