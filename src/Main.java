public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 7.");
        System.out.println(" ");
        System.out.println("task 1.");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_495_000) {
            month = month + 1;
            total = total + deposit;
            total = total + total/100;
            System.out.println("month " + month + " amount accumulated " + total);
        }
        System.out.println(" ");
        System.out.println("task 2.");
        int up = 0;
        while (up < 10) {
            up++;
            System.out.print(up + " ");
        }
        System.out.println(" ");
        up = 10;
        while (up >= 1) {
            System.out.print(up + " ");
            up--;
        }
        System.out.println(" ");
        System.out.println("task 2.");
        int year = 0;
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int diff = born - death;
        while (year < 10) {
            population = population + population / 1000 * diff;
            year++;
            System.out.println("Year " + year + " population " + population);
        }
    }
}