package pglp_3;

public class Employe extends Compta {
    private final String nom;
    private final String adresse;

    public Employe(String nom, String adresse) {
        this.nom = nom;
        this.adresse= adresse;
    }

    public void afficheCoordonnees(){System.out.println(nom+". "+adresse);}

    @Override
    public double calculSalaire() {
        return 0;
    }
}
