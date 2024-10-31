/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_1_intro_program;

/**
 *
 * @author Aulas Heredia
 */
public class ProductosElec {
  // Aqui pensaba hacer lo mismo que en nombre pero esta vez al ser numeros utilizo otra entrada y la intencion era que el usuario ingresara
  // la cantida de prodcutos electronicos que llevaba
 int Elec = 0;
 
 public ProductosElec(int Elec) {
        this.Elec = Elec;
        
    }

    public int getProductosElec() {
        int elec;
        elec = this.Elec;
        return Elec;
    }

    public void setProductosElec(int ProductosElec) {
        this.Elec = Elec;
    }
}
   
