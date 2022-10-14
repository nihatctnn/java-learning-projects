public class Main {

    public static void main(String[] args) {

        byte a = 100 ;       // 8 bit uzunluğundadır. Max 127 , Min -128 değerleri arasındadır.
        short b = 1000 ;     // 16 bit uzunluğundadır. Max 32,767 , Min -32,768 değerleri arasındadır.
        int c = 100000 ;     // 32 bit uzunluğundadır. Max 2,147,483,647 , Min -2,147,483,648 değerleri arasındadır.
        long d = 1000000 ;   //64 bit uzunluğundadır. Max 9,223,372,036,854,775,807 , Min -9,223,372,036,854,775,808 değerleri arasındadır.
        float e = 3.14f ;    // 32 Bit boyutundadır ve 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
        double f = 3.14 ;    // 64 Bit boyutundadır ve 4.9×10^-324 ile 1.8×10^308 aralığında bir değer tanımlanabilir.
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

}
