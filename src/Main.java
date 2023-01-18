public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int savings = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + savings;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");}
        System.out.println("Итого месяцев " + i + ", итого сумма равна " + total + " рублей");
        { System.out.println();}

    }
    public static void task2 (){
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
}