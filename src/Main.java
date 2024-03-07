public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 7.");
        System.out.println(" ");
        System.out.println("task 1.");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        int targetAmount = 2_495_000;
        while (total < targetAmount) {
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
        int targetAmountVasi = 12_000_000;
        double percentPerMonth = 0.07;
        int monthVasi = 0;
        while (depositVasi < targetAmountVasi) {
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
        while (monthsVasi < totalMonths) {
            monthsVasi++;
            depositVasi2 += depositVasi2 * percentPerMonth2;
            if (monthsVasi % 6 == 0) {
                System.out.println("month " + monthsVasi + " amount " + depositVasi2);
            }
        }
        System.out.println(" ");
        System.out.println("task 7.");
        int firstFriday = 1;
        int day = 1;
        do {
            System.out.println(day + " today is friday. need go home erlier.");
            day = day + 7;
        }
        while (day < 31); {
            System.out.println(day + " today is friday. need go home erlier.");
        }
        System.out.println(" ");
        System.out.println("task 8.");
        int currentYear = 2024;
        int cometCome = 0;
        int startYear = currentYear - 200;
        int endYear = currentYear +100;
        startYear += (79 - (startYear % 79));
        cometCome = startYear;
        do {
            System.out.println(cometCome + " the comet come.");
            cometCome = cometCome + 79;
        }
        while (cometCome < endYear); {
            System.out.println(cometCome + " the comet come.");
        }
    }
}