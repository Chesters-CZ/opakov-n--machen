import java.util.*;
import java.util.concurrent.*;

public class prumer {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("zadej kolik opaku");
            int opaky = 0;
            int kloik = scanner.nextInt();
            int[] cisla = new int[kloik];
            boolean iesorno = false;
            for (; kloik > 0; kloik--) {
                System.out.println("zadej " + opaky);
                cisla[opaky] = scanner.nextInt();
                opaky++;
            }

            for (opaky = 0; opaky < cisla.length; opaky++) {
                kloik = kloik + cisla[opaky];
            }

            System.out.println("Prumer zadanych cisel je " + (kloik / cisla.length));
        }
    }
}