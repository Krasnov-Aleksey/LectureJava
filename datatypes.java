public class datatypes {
    public static void main(String[] args) {
        dataTypes7();
    }

    public static void dataTypes1() {
        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary);; //123456 
    }

    public static void dataTypes2() {
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); //2.7
        System.out.println(pi); // 3.1415
    }

    public static void dataTypes3() {
        char ch = '1';
        System.out.println((Character.isDigit(ch))); //true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); //false
    }

    public static void dataTypes4() {
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); //true
        boolean flag2 = 123 >=234;
        System.out.println(flag2); //false
        boolean flag3=flag1^flag2;
        System.out.println(flag3); //true  
    }
    public static void dataTypes5() {
        String msg = "Hello word";
        System.out.println(msg);
    }

    public static void dataTypes6() {
        var a = 123;
        System.out.println(a); //123
        var b =123.456;
        System.out.println(b); //123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(b)); // Double
        b = 1022;
        System.out.println(b); //1022
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    public static void dataTypes7() {
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        
    }
    
}
