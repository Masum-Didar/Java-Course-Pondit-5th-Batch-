
package Class_5;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter any decimal value : ");
        int dNumber = userInput.nextInt();
        int temp = dNumber;
        int binary[] = new int[100];
        int i =0;
        while(temp!=0){
            binary[i] = temp%2;
           temp = temp/2; 
           i++;
        }
        
        for(int j = i-1; j>=0; j--){
            System.out.print(binary[j]);
        }
        System.out.println();
    }
    
}
