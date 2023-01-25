public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
            if (i == arr.length - 1) {
                System.out.println("«Сумма трат за месяц составила "+ summ + " рублей».");
            }
        }
    }
}