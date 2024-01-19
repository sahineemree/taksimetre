import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km, startMoney = 10;
        double perKm = 2.20, total;

        System.out.print("Kaç Km gideceğinizi girin : ");
        Scanner input = new Scanner(System.in);

        km = input.nextInt();

        total = (km * perKm) + startMoney;

        total = (total < 20) ? 20 : total;

        System.out.print("Ödeyeceğiniz Ücret : " + total);

    }
}