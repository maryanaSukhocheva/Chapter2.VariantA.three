/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.three.main;

import varianta.three.action.Action;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Runner {
        /**
     *
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите несколько чисел и нажмите <Enter>:");
        Action action = new Action();
        String[] masNum=action.Numbers();
        if (masNum!=null) {
        action.CompareNumbers(masNum);
        }
        
    }
  
}
