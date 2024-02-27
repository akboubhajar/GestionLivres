public class GestionBibliotheque {
    public static void main(String[] args) {
        // Déclaration et instanciation d'un adhérentz
        Adherent adherent = new Adherent("Dupont", "Jean", "jean.dupont@example.com", "123456789", 30, 1001);
        System.out.println("Informations de l'adhérent :");
        System.out.println(adherent);

        // Déclaration et instanciation d'un auteur
        Auteur auteur = new Auteur("Martin", "Paul", "paul.martin@example.com", "987654321", 45, 2001);

        // Déclaration et instanciation d'un livre écrit par l'auteur précédent
        Livre livre = new Livre(123456789, "Java Programming", auteur);
        System.out.println("\nInformations du livre :");
        System.out.println(livre);
    }
}
