package model;

/** Representa una persona. Incluye nombre, email, telefono, empleado y direccion */

public class Persona {

    //variables privadas

    private String nombre;
    private String email;
    private String telefono;
    private Empleado empleado;
    private Direccion direccion;

    /** Constructores de persona
     * @param nombre nombre de la persona
     * @param email correo electronico de la persona
     * @param telefono telefono de la persona
     * @param empleado incluye cargo y tiempo en la empresa
     * @see Empleado
     * @param direccion incluye calle, numero de casa, ciudad y region
     * @see Direccion
     *  */

    public Persona(String nombre, String email, String telefono, Empleado empleado, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleado = empleado;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /** Metodo toString
     * @return Datos de persona personalizado */

    public String toString() {
        return "|| Cliente: " + nombre + " || Correo electronico: " + email + " || Numero telefonico: " + telefono + " ||" + "\n" + empleado + "\n" + direccion;
    }
}
