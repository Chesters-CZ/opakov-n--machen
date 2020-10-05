import java.util.*;
import java.util.concurrent.*;

public class mendian{

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("zadej kolik opaku");
            int opaky = 0;
            int kloik = scanner.nextInt();
            int[] cisla = new int[kloik];
            boolean iesorno = false;
            for(; kloik > 0; kloik--){
                System.out.println("zadej " + opaky);
                cisla[opaky] = scanner.nextInt();
                opaky++;
            }

            /*TimeUnit.SECONDS.sleep(1);
            System.out.println("");
            System.out.println("Pracuji");
            TimeUnit.SECONDS.sleep(2);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(3);
            System.out.print(".");
            System.out.println("");*/

            if (cisla.length % 2 == 1) {
                double pul = cisla.length / 2;
                pul = pul + 0.5;
                System.out.println("Median je " + cisla[(int)pul]);
            }
            else {
                int jednapulka = (((cisla.length) / 2));
                int druhapulka = (((cisla.length) / 2)+1);

                System.out.println(jednapulka);
                System.out.println(druhapulka);
                System.out.println(cisla.length);

                double vysledek = (cisla[jednapulka] + cisla[druhapulka]);
                vysledek = vysledek/2;

                System.out.print(vysledek);

                System.out.println("Median je " + vysledek);
            }


        }

        catch (Exception e) {
            System.out.println("error.");
        }
    }
}