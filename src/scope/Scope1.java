package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if m = " + x);
        } //x 생존 종료
        //System.out.println("main x " + x);
        System.out.println("main x " + m);

    } //m 생존 종료
}
