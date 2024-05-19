package d.operators;

public class Logical {
    public static void main(String[] args) {
        int i=84;
        System.out.println(i<80 && i>25); // false
        System.out.println(i<90 || i>87); // true
        System.out.println(!(i<90 && i>105));// true


    }
}
