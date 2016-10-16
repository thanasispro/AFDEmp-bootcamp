import java.util.Scanner;
import java.util.Arrays;



public class Pinakes {
    public static void main(String[] args) {
        Scanner pinakaki = new Scanner(System.in);
        int[] stoixeia = new int[10];
        generateArray(stoixeia);
        System.out.println(Arrays.toString(stoixeia)+"\n");
        System.out.print("How many times you want the array shifts????:");
        Scanner ela=new Scanner(System.in);
        int number = ela.nextInt();
        shiftRightArray(stoixeia,number, 1);
        
    }

  
    private static void generateArray(int[] pinakas) {
        for (int i = 0; i < 10; i++) {
            pinakas[i] = i + 1;
        }
    }
       
       
    
    
    private static void shiftRightArray(int[] pinakas, int number, int counter) {
        int[] temporaryArray = new int[10];
        temporaryArray[0] = pinakas[9];
        for (int i = 1; i < 10; i++) {
            temporaryArray[i] = pinakas[i - 1];
        }
        System.out.println(Arrays.toString(temporaryArray));
        counter ++;
        if (counter <= number) {
            shiftRightArray(temporaryArray, number, counter);
        } else {
            return;
        }
    }

}   
   
