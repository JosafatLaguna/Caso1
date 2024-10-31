/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_1_intro_program;

/**
 *
 * @author Aulas Heredia
 */
public class ID {
    // Aqui pensaba hacer lo mismo que en ID pero esta vez al ser numeros utilizo otra entrada para almacenar las cedulas
    Double Cedula;
    
    public ID(Double Cedula){
        this.Cedula = Cedula;
    }
    
    public Double getCedula(){
        Double cedula;
        cedula = this.Cedula;
        return Cedula;
    }

    public void setCedula(Double Cedula) {
        this.Cedula = Cedula;
    }
    
    
}

