/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.three.action;

import java.util.Scanner;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Action {
    
    String pattern = "(\\s)+|($)";

    /**
     *
     * @return
     */
    public String[] Numbers() {
        boolean result;
        float number;
        String[] masNum = null;
        try (Scanner scan = new Scanner(System.in)) {
            result = false;
            String str = scan.nextLine();
            for (String retval : str.split(pattern)) {
                try {
                    if (!retval.isEmpty()) {
                        number = Float.valueOf(retval);
                        result = true;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Неверный формат чисел!");
                    result = false;
                    break;
                }
            }
            scan.close();
            if (result) {
                masNum = str.split(pattern);
            }
        }
        return masNum;
    }
    
    /**
     *
     * @param mas
     */
    public void CompareNumbers(String[] mas) {
        String strOutDec="";
        String strOutInc="";
        int AverageLength = 0;
        for (String str:mas) {
            AverageLength+=str.length();  
        }
        AverageLength=AverageLength/mas.length;
        
        for (String str:mas) {
            if (AverageLength>str.length()){
               strOutDec=strOutDec+" "+str+"("+String.valueOf(str.length())+")";
             }
            if (AverageLength<str.length()){
               strOutInc=strOutInc+" "+str+"("+String.valueOf(str.length())+")";
             }
        }
        System.out.println("Числа, длина которых меньше средней длины:"+strOutDec);
        System.out.println("Числа, длина которых больше средней длины:"+strOutInc);
    }
}
