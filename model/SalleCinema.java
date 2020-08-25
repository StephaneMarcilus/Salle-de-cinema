package model;

public class SalleCinema{

    private String film; //nom du film
    private int nbPlaces; //capacité de la salle
    private double tarif; //prix d'une place
    private int nbPlacesVendues = 933; //arbitraire

    public SalleCinema(String film, double tarif, int nbPlaces){

        this.film = film;
        this.tarif = tarif;
        this.nbPlaces = nbPlaces;
    }

    public void vendrePlace(){

        if (!estPleine()) {
            nbPlacesVendues++;
        }
    }

    public int nbPlacesDisponibles(){

        return nbPlaces - nbPlacesVendues;
    }

    public boolean estPleine(){

        if (nbPlacesVendues == nbPlaces) {

            return true;
        }
        else return false;
    }

    public double tauxRemplissage(){

        return (double)nbPlacesVendues/(double)nbPlaces; //cast
    }

    public double chiffreAffaires(){

        return nbPlacesVendues * tarif;
    }

    @Override
    public String toString(){
        
        return "Film projeté        : " + this.film + "\n" +
               "Tarif               : " + this.tarif + "\n" +
               "Nombre de places    : " + this.nbPlaces + "\n" +
               "Taux de remplissage : " + tauxRemplissage() + "\n" +
               "Chiffre d'affaires  : " + chiffreAffaires();
    }
}