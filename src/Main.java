public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 7.");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_495_000) {
            month = month + 1;
            total = total + deposit;
            total = total + total/100;
            System.out.println("month " + month + " amount accumulated " + total);
        }
    }
}