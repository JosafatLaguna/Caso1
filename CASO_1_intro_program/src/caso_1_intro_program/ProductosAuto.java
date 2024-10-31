/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_1_intro_program;

/**
 *
 * @author Aulas Heredia
 */
public class ProductosAuto {
    // Aqui pensaba hacer lo mismo que en nombre pero esta vez al ser numeros utilizo otra entrada y la intencion era que el usuario ingresara
  // la cantida de productos de autos que llevaba
    int CantidadA = 0;
    
    public ProductosAuto(int CantidadA) {
        this.CantidadA = CantidadA;
        
    }

    public int getProductosAuto() {
        int CantidadA;
        CantidadA = this.CantidadA;
        return CantidadA;
    }

    public void setProductosAuto(int roductosConstr) {
        this.CantidadA = CantidadA;
    }
}
