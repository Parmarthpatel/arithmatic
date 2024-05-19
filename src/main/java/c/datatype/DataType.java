package c.datatype;

public class DataType {

    public static void main(String[] args) {
//    Integer Family
//    Byte rang is -128 to 127
        byte a= 100;
        System.out.println(a);

//    Short rang is -32768 to 32767
        short b=-32765;
        System.out.println(b);

//    Int rang is -2,147,483,648 to 2,147,483,647
        int c=-2147483648;
        System.out.println(c);

//    Long rang is -9,223,372,036,854,775,808 to 9,223 372,036,854,775,807
        long d=9223372036854775805L;
        System.out.println(d);

//    Float Family
//    float rang is 3.4E-38 to 3.4E+38
        float e = 5656545654811114545123545365656.1111111111111111111111111111111111111111111111111111f;
        System.out.println(e);

//    double rang is approximately 1.8*10(308)
        double f = -1212212312121311.1111111111111111111111111111111111111111111111111111111111;
        System.out.println(f);

//    Character Family
//    character rang is unicode value (Single rang value)
        char g= '=';
        System.out.println(g);

//    Boolean Family
//    Boolean don't ave any range. It's fix value as True or False.
        boolean h=false;
        System.out.println("h="+h);

//    String Family
//    String range is 0 to 2,147,483,647.
        String i = "I am a tester";
        System.out.println(i);

//     Software Tester
        String j="Software ";
        String k ="Tester";
        System.out.println(j+k);


    }
}
