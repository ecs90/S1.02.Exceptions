package n1exercici1;

public class Producte {
    float   preu;
    String  nom;

    public Producte(float preu, String nom) {
        this.preu = preu;
        this.nom = nom;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
