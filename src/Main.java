public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] expenses = new int[5];
        expenses[0] = 75_000;
        expenses[1] = 85_000;
        expenses[2] = 87_000;
        expenses[3] = 93_000;
        expenses[4] = 100_000;
        int sum = 0;
        for (int element : expenses) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача №2");
        int max = 1;
        int min = 150_000;
        for (final int current : expenses) {
            if (current > max) {
                max = current;
            }
        }
        for (final int current : expenses) {
            if (current < min) {
                min = current;
            }
        }
        System.out.println("Минимальяная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");

        System.out.println("Задача №3");
        double average = 0;
        for (double element : expenses) {
            average = average + element / 5;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей ");

        System.out.println("Задача № 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print( reverseFullName[i]);
        }

    }
}