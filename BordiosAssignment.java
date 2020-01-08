package bordioslab;

import java.util.Scanner;

public class BordiosLab {

    int x, count, counter;
    String words, lowcas;
    char vow, cons;

    public BordiosLab() {
        Scanner in = new Scanner(System.in);
        try {

            System.out.print("Input a Word : ");
            words = in.nextLine();
            lowcas = words.toLowerCase();

            System.out.println("");

            x = 0;
            System.out.println("Vowels : " + "\t\t\t" + "Consonant : ");
            while (x < words.length()) {
                vow = words.charAt(x);

                if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u') {
                    System.out.println("" + vow);
                    count++;
                }
                x++;
            }
            x = 0;
            while (x < words.length()) {
                cons = words.charAt(x);
                if (cons == 'b' || cons == 'c' || cons == 'd' || cons == 'f' || cons == 'g' || cons == 'h' || cons == 'j' || cons == 'k'
                        || cons == 'l' || cons == 'm' || cons == 'p' || cons == 'q' || cons == 'r' || cons == 's' || cons == 't' || cons == 'v' || cons == 'w' || cons == 'x' || cons == 'y' || cons == 'z') {
                    System.out.println("\t\t\t\t" + "" + cons);
                    counter++;
                }
                x++;
            }
            System.out.print("Total : " + counter + "\t\t\t Total : " + counter);

        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new BordiosLab();
    }
}
