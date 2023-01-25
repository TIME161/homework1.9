public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
            if (i == arr.length - 1) {
                System.out.println("«Сумма трат за месяц составила " + summ + " рублей».");
            }
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int summMax = 0;
        int summMin = arr[0];
        for (int i = 0; i < arr.length && summMax < arr[i]; i++) {
            summMax = arr[i];
        }
        for (int i = 0; i < arr.length && summMin >= arr[i]; i++) {
            summMin = arr[i];
        }
        System.out.println("«Минимальная сумма трат за день составила " + summMin + " рублей. Максимальная сумма трат за день составила " + summMax + " рублей».");
    }
}