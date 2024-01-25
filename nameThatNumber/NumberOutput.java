package TasksKata.nameThatNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOutput {
    public static void main(String[] args) {
        System.out.println(numberOutput(20));
    }

    public static String numberOutput(int n) {
        List<String> unit = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"));
        List<String> tens = new ArrayList<>(
                Arrays.asList("twenty", "thirty", "forty", "fifty", "sixteen", "seventeen", "eighteen", "nineteen"));
        if (n < 20) {
            return unit.get(n);
        } else if (n < 100) {
            int n1 = n / 10;
            int n2 = n % 10;
            if (n2 == 0) {
                return tens.get(n1 - 2);
            } else {
                return tens.get(n1 - 2) + " " + unit.get(n2);
            }
        } else {
            return "Error!";
        }
    }
}