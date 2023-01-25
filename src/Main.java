public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double summ = 0;
        for (int j : arr) {
            summ += j;
        }
        double middle = summ / arr.length;
        System.out.println("«Средняя сумма трат за месяц составила " + middle + " рублей».");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}