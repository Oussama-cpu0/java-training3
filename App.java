import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputStream = new Scanner(new File("C:\\Users\\pc\\Desktop\\Rapports\\Classeur2.csv"));
        String line = inputStream.nextLine();
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;
        double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
        double min1 = Double.MAX_VALUE;
        double min2 = Double.MAX_VALUE;
        double min3 = Double.MAX_VALUE;
        double min4 = Double.MAX_VALUE;
        double max1 = Double.MIN_VALUE;
        double max2 = Double.MIN_VALUE;
        double max3 = Double.MIN_VALUE;
        double max4 = Double.MIN_VALUE;

        while (inputStream.hasNextLine()) {
            line = inputStream.nextLine();
            String[] tableau = line.split(";");
            String Capteur = tableau[0];
            double Valeur = Double.parseDouble(tableau[1]);
            System.out.println("Capteur : " + Capteur + " Valeur : " + Valeur);
            
            // Utilisation de .equals() pour comparer les chaînes
            if (Capteur.equals("Capteur 1")) {
                i1++;
                s1 += Valeur;
                if (Valeur < min1) min1 = Valeur;
                if (Valeur > max1) max1 = Valeur;
            }
            if (Capteur.equals("Capteur 2")) {
                i2++;
                s2 += Valeur;
                if (Valeur < min2) min2 = Valeur;
                if (Valeur > max2) max2 = Valeur;
            }
            if (Capteur.equals("Capteur 3")) {
                i3++;
                s3 += Valeur;
                if (Valeur < min3) min3 = Valeur;
                if (Valeur > max3) max3 = Valeur;
            }
            if (Capteur.equals("Capteur 4")) {
                i4++;
                s4 += Valeur;
                if (Valeur < min4) min4 = Valeur;
                if (Valeur > max4) max4 = Valeur;
            }
        }
        

        System.out.println("La moyenne des valeurs pour le capteur 1 c'est : " + s1/i1);
        System.out.println("La valeur minimale pour le capteur 1 c'est : " + min1);
        System.out.println("La valeur maximale pour le capteur 1 c'est : " + max1);

        System.out.println("La moyenne des valeurs pour le capteur 2 c'est : " + s2/i2);
        System.out.println("La valeur minimale pour le capteur 2 c'est : " + min2);
        System.out.println("La valeur maximale pour le capteur 2 c'est : " + max2);

        System.out.println("La moyenne des valeurs pour le capteur 3 c'est : " + s3/i3);
        System.out.println("La valeur minimale pour le capteur 3 c'est : " + min3);
        System.out.println("La valeur maximale pour le capteur 3 c'est : " + max3);

        System.out.println("La moyenne des valeurs pour le capteur 4 c'est : " + s4/i4);
        System.out.println("La valeur minimale pour le capteur 4 c'est : " + min4);
        System.out.println("La valeur maximale pour le capteur 4 c'est : " + max4);
    }
}
