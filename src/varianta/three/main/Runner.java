package varianta.three.main;

import varianta.three.action.Action;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Runner {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите несколько чисел и нажмите <Enter>:");
        Action action = new Action();
        String[] arrayOfNumbers = action.numbers();
        if (arrayOfNumbers != null) {
        action.compareNumbers(arrayOfNumbers);
        }
        
    }
  
}
