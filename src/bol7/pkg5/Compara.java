/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol7.pkg5;
import javax.swing.JOptionPane;
/**
 *
 * @author galle
 */
public class Compara {
    private int num1;
    private int num2;
    private int num3;

    public void setNum1() {
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog ("Teclea el numero 1"));
        
    }

    public void setNum2() {
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog ("Teclea el numero 2"));
    }

    public void setNum3() {
        this.num3 = Integer.parseInt(JOptionPane.showInputDialog ("Teclea el numero 3"));
    }
    public void comparar(){
        if (num1>num2&&num1>num3)
           JOptionPane.showMessageDialog(null,"El numero 1 es mayor que el numero 2 y 3");
        else if (num2>num1&&num2>num3)
            JOptionPane.showMessageDialog(null,"El numero 2 es mayor que el numero 1 y 3");
        else if (num3>num1&&num3>num2)
            JOptionPane.showMessageDialog(null,"El numero 3 es mayor que el numero 1 y 2");
        else
            JOptionPane.showMessageDialog(null,"Hay varios numeros iguales");
            
            
    





}
}