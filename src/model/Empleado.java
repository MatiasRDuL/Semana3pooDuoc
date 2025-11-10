package model;

/** Representa un empleado. Incluye cargo y tiempo en la empresa */

public class Empleado extends Persona {

    //variables privadas

    private String cargo;
    private int tiempoEnEmpresa;

    /** Constructor que inicializa los datos de un empleado
     * @param cargo cargo que desempeña en la empresa
     * @param tiempoEnEmpresa tiempo (en años) que lleva trabajando en la empresa
     *  */

    public Empleado(String cargo, int tiempoEnEmpresa) {
        this.cargo = cargo;
        this.tiempoEnEmpresa = tiempoEnEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTiempoEnEmpresa() {
        return tiempoEnEmpresa;
    }

    public void setTiempoEnEmpresa(int tiempoEnEmpresa) {
        this.tiempoEnEmpresa = tiempoEnEmpresa;
    }

    /** Metodo toString
     * @return Datos de empleado personalizado */

    public String toString() {
        return "|| Cargo: " + cargo + " " + " || Tiempo en la empresa: " + tiempoEnEmpresa + " años ||";
    }
}
