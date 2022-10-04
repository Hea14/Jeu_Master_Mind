
package MasterMind;


public class MasterMind {
    private String[] couleurs = {"Acajou", "Brique", "Cyan", "Denim", "Ecru", "Fuchsia", "Gris", "Havane", "Indigo", "Jaune", "Kola", "Lavande"};
    private String[] lettreCouleur = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
    private String codeSecret = "";
    private int nbColorTrue = 0;
    private int nbColorOrder = 0;
    // on nesaie un truc bidon
    
    
    public void nbCouleurInvalid() {
        if (codeSecret.length() > 4) {
            System.out.println("Vous avez saisie trop de lettres !");
        }else {
            
        }
    }
}
