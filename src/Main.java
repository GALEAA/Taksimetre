import java.util.Scanner;
//Taxi costs 2.20TL per km
//Min. amount is 20TL. Below amounts will charge as 20TL.
//Taximeter fee starts with 10TL

public class Main {
    public static void main(String[] Args) {
        int km;
        double perKm = 2.20;
        double taximeterFee = 10;
        double total;


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter distance as kilometers unit: ");
        km = input.nextInt();

        total = (km * perKm);
        total += taximeterFee;

        total = (total < 20) ? 20 : total;
        System.out.println("Total Amount:   " + total);


    }
}

