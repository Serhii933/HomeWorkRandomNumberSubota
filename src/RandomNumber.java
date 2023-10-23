import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100001 - 11) + 11;

        System.out.println("Згенероване число: " + number);
        int sum = 0;
        int number1 = number;
        while (number1 > 0) {
            sum += number1 % 10;
            number1 /= 10;
        }
        while (sum >= 10) {
            int sum1 = 0;
            while (sum > 0) {
                sum1 += sum % 10;
                sum /= 10;
            }
            sum = sum1;
        }
        System.out.println("Сума розрядів числа: " + sum);
    }
    }

