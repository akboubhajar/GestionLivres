class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;

    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email + ", Téléphone: " + tel + ", Âge: " + age;
    }
}

class Auteur extends Personne {
    private int numAuteur;

    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    public String toString() {
        return super.toString() + ", Numéro Auteur: " + numAuteur;
    }
}

class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur;

    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    public String toString() {
        return "ISBN: " + ISBN + ", Titre: " + titre + ", Auteur: " + auteur.toString();
    }
}

