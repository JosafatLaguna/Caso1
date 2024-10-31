/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_1_intro_program;

/**
 *
 * @author Aulas Heredia
 */
public class ProductosConstru {
   // Aqui pensaba hacer lo mismo que en Nombre pero esta vez al ser numeros utilizo otra entrada y la intencion era que el usuario ingresara
  // la cantida de productos de construccion que llevaba
    int CantidadC = 0;
    
    public ProductosConstru (int CantidadC) {
        this.CantidadC = CantidadC;
        
    }

    public int getroductosConstr() {
        int CantidadC;
        CantidadC = this.CantidadC;
        return CantidadC;
    }

    public void setroductosConstr(int roductosConstr) {
        this.CantidadC = CantidadC;
    }
}
