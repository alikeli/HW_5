import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] arr = generateRandomArray();  // массив случайных чисел


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей.\n", sum);

        //Task 2
        arr = generateRandomArray();  // массив случайных чисел
        int maxCost = 99999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCost) {
                maxCost = arr[i];
            }
        }
        int minCost = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCost) {
                minCost = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей.Максимальная сумма трат за день составила %s рублей \n", minCost, maxCost);

        //Task 3
        arr = generateRandomArray();  // массив случайных чисел
        double averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        averageSum = (double) sum / arr.length;
        System.out.println(sum); //общая сумма

        System.out.printf("Средняя сумма трат за месяц составила %s рублей.\n", averageSum);
        //Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            //System.out.println(arr);
        }
        return arr;
    }


}
