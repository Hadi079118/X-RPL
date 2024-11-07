public class operatortugas9 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && a); // true && true --> output: true
        System.out.println(a && b); // true && false --> output: false
        System.out.println(b && a); // false && true --> output: false
        System.out.println(b && b); // false && false --> output: false
    }
}
