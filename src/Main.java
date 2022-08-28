public class Main {
    public static void main(String[] args) {
        /*int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0
        };
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }*/



        int[] arr = new int[10];

        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + " ");
        }

    }
}