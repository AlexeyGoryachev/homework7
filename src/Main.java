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
    }
}