/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_1_intro_program;

/**
 *
 * @author Aulas Heredia
 */
public class Name {
    // cree la entrada Nombre y le hice su respectivo constructor para que el getter se esncargara de almacenar los datos en Nombre
    // y el setter se encargara de darme la posibilidad de utilizarlos en el main
    // cavo recalcar que no pude hacerle un ciclo while para poder almacenar muchos datos
    String Nombre;

    public Name(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getNombre() {
        String nombre;
        nombre = this.Nombre;
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}

