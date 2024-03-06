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
            total = total + total / 100;
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
        System.out.println("task 3.");
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
        System.out.println(" ");
        System.out.println("task 4/5.");
        int depositVasi = 15000;
        double percentPerMonth = 0.07;
        int monthVasi = 0;
        while (depositVasi < 12_000_000) {
            monthVasi++;
            depositVasi += depositVasi * percentPerMonth;
            if (monthVasi%6 == 0) {
            System.out.println("month " + monthVasi + " amount " + depositVasi);}
        }
        System.out.println(" ");
        System.out.println("task 6.");
        int depositVasi2 = 15000;
        double percentPerMonth2 = 0.07;
        int year2 = 9;
        int totalMonths = year2 * 12;
        System.out.println(totalMonths);
        int monthsVasi = 0;
        while (monthsVasi < 108) {
            monthsVasi++;
            depositVasi2 += depositVasi2 * percentPerMonth2;
            if (monthsVasi % 6 == 0) {
                System.out.println("month " + monthsVasi + " amount " + depositVasi2);
            }
        }
        System.out.println(" ");
        System.out.println("task 7.");
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day = day + 7){
            System.out.println(day + " today is friday. need go home erlier.");
        }

    }
}