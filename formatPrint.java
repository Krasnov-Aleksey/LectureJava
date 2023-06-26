public class formatPrint {

    static void fotmat1() {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " =" + c;
        System.out.println(res);
        String res1 = String.format("%d + %d = %d\n",a,b,c);
        System.out.printf("%d +%d=%d\n", a, b, c);
        System.out.println(res1);
    }
    public static void main(String[] args) {
        fotmat1();
    }
    
}
