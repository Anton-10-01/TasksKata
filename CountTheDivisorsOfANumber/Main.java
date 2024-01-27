package TasksKata.CountTheDivisorsOfANumber;

public class Main{
    public static void main(String[] args) {
        numberOfDivisors(30);
    }
    public static void numberOfDivisors(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}