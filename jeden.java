import java.util.*;

class jeden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String imput = scanner.nextLine();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int z = 0;
        int y = 0;

        for (int ii = imput.length() - 1; ii > -1; ii--) {
            String iii = String.valueOf(imput.charAt(ii));
            iii = iii.toLowerCase();

            switch (iii) {
                case "a":
                    a++;
                    break;
                case "b":
                    b++;
                    break;
                case "c":
                    c++;
                    break;
                case "d":
                    d++;
                    break;
                case "e":
                    e++;
                    break;
                case "f":
                    f++;
                    break;
                case "g":
                    g++;
                    break;
                case "h":
                    h++;
                    break;
                case "i":
                    i++;
                    break;
                case "j":
                    j++;
                    break;
                case "k":
                    k++;
                    break;
                case "l":
                    l++;
                    break;
                case "m":
                    m++;
                    break;
                case "n":
                    n++;
                    break;
                case "o":
                    o++;
                    break;
                case "p":
                    p++;
                    break;
                case "q":
                    q++;
                    break;
                case "r":
                    r++;
                    break;
                case "t":
                    t++;
                    break;
                case "u":
                    u++;
                    break;
                case "v":
                    v++;
                    break;
                case "w":
                    w++;
                    break;
                case "x":
                    x++;
                    break;
                case "y":
                    y++;
                    break;
                case "z":
                    z++;
                    break;
                case "s":
                    s++;
                    break;

            }
        }

        System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d + " E: " + e + " F: " + f + " G: " + g + " H: " + h + " I: " + i + " J: " + j + " K: " + k + " L: " + l + " M: " + m + " N: " + n + " O: " + o + " P: " + p + " Q: " + q + " R: " + r + " S: " + s + " T: " + t + " U: " + u + " V: " + v + " W: " + w + " X: " + x + " Y: " + y + " Z: " + z);
    }
}