// print x^n

public class problem9 {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return (x * power(x, n-1));
    }
    public static void main(String args[]) {
        System.out.print(power(2, 5));
    }
}
