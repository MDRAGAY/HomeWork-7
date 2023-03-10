public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int savings = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + savings;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого месяцев " + i + ", итого сумма равна " + total + " рублей");
        {
            System.out.println();
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int d = 0;
        while (d < 10) {
            d++;
            System.out.print(d + " ");
        }
        System.out.println();
        for (; d > 0; d--) {
            System.out.print(d + " ");
        }
        System.out.println();
        {
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPeople = 12_000_000;
        int birthPeople = 17;
        int deadPeople = 8;
        int dynamicsPopulation = totalPeople / 1000 * (birthPeople - deadPeople);
        int year = 0;
        while (year < 10) {
            year++;
            totalPeople = dynamicsPopulation + totalPeople;
            System.out.println("В " + year + " год, численность населения составляет " + totalPeople);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int savings = 15000;
        int i = 0;
        while (savings < 12_000_000) {
            i++;
            savings = savings + savings / 100 * 7;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("Всего месяцев " + i + ", итого накоплений " + savings + " рублей");
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        int savings = 15000;
        int i = 0;
        while (savings < 12_000_000) {
            i++;
            savings = savings + savings / 100 * 7;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        int savings = 15000;
        int i = 0;
        while (i < 9 * 12) {
            i++;
            savings = savings + savings / 100 * 7;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число");
            friday += 7;
        }
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        int comet = 79;
        int start = 1823;
        int end = 2123;
        int begin = 0;
        for (int years = begin; years < end; years += comet) {
            if (years >= start) {
                System.out.println(years);
            }
        }
    }
}