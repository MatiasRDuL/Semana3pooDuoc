package model;

/** Representa una direccion. Incluye calle, numero, ciudad y region */

public class Direccion {

    //variables privadas

    private String calle;
    private int numCasa;
    private String ciudad;
    private String region;

    /** Constructor que inicializa los datos de una direccion
     * @param calle calle de residencia
     * @param numCalle numero de casa
     * @param ciudad ciudad de residencia
     * @param region region de residencia
     *  */

    public Direccion(String calle, int numCalle, String ciudad, String region) {
        this.calle = calle;
        this.numCasa = numCalle;
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /** Metodo toString
     * @return Datos de direccion personalizado */

    public String toString(){
        return "|| Direccion: " + calle + " " + numCasa + " , " + ciudad + " , " + region + " ||";
    }

}
