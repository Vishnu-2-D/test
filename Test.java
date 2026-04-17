public class Test {

    static void add() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("The sum is " + result);
    }

    static void sub() {
        int c = 20;
        int d = 10;
        int result1 = c - d;
        System.out.println("The diff is " + result1);
    }

    static void multi() {
        int x = 5;
        int y = 8;
        int result2 = x * y;
        System.out.println("The multiplication result is: " + result2);
    }

    static void div() {
        int s = 10;
        int t = 15;

        if (t != 0) {
            double result3 = (double) s / t;
            System.out.println("The division result is: " + result3);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    static void mod() {
        int a = 10;
        int b = 3;

        if (b != 0) {
            int result4 = a % b;
            System.out.println("The remainder is: " + result4);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        add();
        sub();
        multi();
        div();
        mod();  
    }
}
