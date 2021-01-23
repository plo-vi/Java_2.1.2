public class Main {
    public static void main(String[] args) {
        double currentBalance = 100.55;
        double payment = 1500.74;

        double bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        /*System.out.printf("%.0f", bonus);*/

        double newBalance = currentBalance + payment + bonus;
        System.out.printf("%.2f",newBalance);
    }
}
