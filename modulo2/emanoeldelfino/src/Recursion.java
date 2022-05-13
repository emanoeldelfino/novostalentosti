public class Recursion {
    private static long fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
    private static long sum(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sum(num - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(14332));
        System.out.println(sum(14333));
        System.out.println(sum(14334));
        System.out.println(fact(5));
    }
}
