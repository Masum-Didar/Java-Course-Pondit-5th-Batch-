
package Class_5;

import java.util.Scanner;

public class XpowerY {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the value of X : ");
        int x = userInput.nextInt();
        System.out.print("Please enter the value of Y : ");
        int y = userInput.nextInt();
        int result = 1;
        for(int i = 1; i<=y; i++){
            result = x * result;
        }
        System.out.println(result);
    }
    
}
