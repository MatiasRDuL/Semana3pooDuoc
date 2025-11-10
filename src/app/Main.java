package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

/** Clase principal donde se instancian los objetos
 * @author Matias Rosales
 * @version 1.0 */

public class Main {
    public static void main(String[] args) {

        /** Creacion y asignacion de valores para objeto Direccion, Empleado y Persona */

        Direccion nuevaDir1 = new Direccion("Avenida Siempreviva", 742, "Springfield", "Oregon");
        Empleado nuevoEmp1 = new Empleado("Inspector de seguridad", 35);
        Persona nuevaPer1 = new Persona("Homero Jay Simpson", "homero.j.simpsons@yahoo.com", "939-555-0113", nuevoEmp1, nuevaDir1);

        System.out.println(nuevaPer1);
        System.out.println();

        Direccion nuevaDir2 = new Direccion("Avenida inventada", 258, "Ciudad inventada", "Region inventada");
        Empleado nuevoEmp2 = new Empleado("Cargo inventado", 10);
        Persona nuevaPer2 = new Persona("Aquiles Brinco", "aquiles.brinco@hotmail.com","11223344", nuevoEmp2, nuevaDir2);

        System.out.println(nuevaPer2);
        System.out.println();

        Direccion nuevaDir3 = new Direccion("Maragaño", 147, "Puerto Williams", "Magallanes y Antartica Chilena");
        Empleado nuevoEmp3 = new Empleado("CEO", 50);
        Persona nuevaPer3 = new Persona("Elvis Tek", "elvis.tek@gmail.com", "99887766",  nuevoEmp3, nuevaDir3);

        System.out.println(nuevaPer3);
        System.out.println();

    }
}