/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *
 * @author Devansh
 */
public class EnumVal {
     public enum Val {
        ZERO, ONE, TWO, THREE
    };
     
     private Val value;

    public EnumVal(Val value) {
        this.value = value;
    }
     
     

    public Val getValue() {
        return value;
    }

    public void setValue(Val value) {
        this.value = value;
    }
     
     
     
}
