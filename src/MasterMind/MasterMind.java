
package MasterMind;

import java.util.ArrayList;
import java.util.Arrays;


public class MasterMind {
    private static String[] couleurs = {"Acajou", "Brique", "Cyan", "Denim", "Ecru", "Fuchsia", "Gris", "Havane", "Indigo", "Jaune", "Kola", "Lavande"};
    private static ArrayList lettreCouleur = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"));
    private static String codeSecret = "";
    private static int nbColorTrue = 0;
    private static int nbColorOrder = 0;
    // on nesaie un truc bidon
    
    // METTHODE qui GENERE le CODE SECRET
    public static String genererCodeSecret() {
        ArrayList<String> newList = lettreCouleur;
        for (int nb = 1; nb <= 4; nb++) {
            int index = (int) Math.floor(Math.random() * newList.size());
            codeSecret += newList.get(index);
            newList.remove(index);
        }      
        return codeSecret;
    }
    
    public void nbCouleurInvalid() {
        if (codeSecret.length() > 4) {
            System.out.println("Vous avez saisie trop de lettres !");
        }else {
            
        }
    }
}
