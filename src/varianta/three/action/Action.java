package varianta.three.action;

import java.util.Scanner;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Action {
    
    private String pattern = "(\\s)+|($)";

    /**
     *
     * @return
     */
    public String[] numbers() {
        boolean result;
        float number;
        String[] arrayOfNumbers = null;
        try (Scanner scan = new Scanner(System.in)) {
            result = false;
            String str = scan.nextLine();
            for (String currentValue : str.split(pattern)) {
                try {
                    if (!currentValue.isEmpty()) {
                        number = Float.valueOf(currentValue);
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
                arrayOfNumbers = str.split(pattern);
            }
        }
        return arrayOfNumbers;
    }
    
    /**
     *
     * @param arrayOfNumbers
     */
    public void compareNumbers(String[] arrayOfNumbers) {
        String strOutDec = "";
        String strOutInc = "";
        int averageLength = 0;
        for (String str : arrayOfNumbers) {
            averageLength += str.length();  
        }
        averageLength = averageLength/arrayOfNumbers.length;
        
        for (String str : arrayOfNumbers) {
            if (averageLength > str.length()){
               strOutDec = strOutDec + " " + str + "(" + String.valueOf(str.length()) + ")";
             }
            if (averageLength < str.length()){
               strOutInc = strOutInc + " " + str + "(" + String.valueOf(str.length()) + ")";
             }
        }
        System.out.println("Числа, длина которых меньше средней длины:" + strOutDec);
        System.out.println("Числа, длина которых больше средней длины:" + strOutInc);
    }
}
