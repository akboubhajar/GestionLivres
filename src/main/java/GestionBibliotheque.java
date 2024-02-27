public class GestionBibliotheque {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Dupont", "Jean", "jean.dupont@example.com", "123456789", 30, 1001);
        System.out.println("Informations de l'adhérent :");
        System.out.println(adherent);
        Auteur auteur = new Auteur("Martin", "Paul", "paul.martin@example.com", "987654321", 45, 2001);
        Livre livre = new Livre(123456789, "Java Programming", auteur);
        System.out.println("\nInformations du livre :");
        System.out.println(livre);
    }
}
