package Class_5;

public class Reverse {

    void intValue(int digit) {
        int temp = digit;
        int r;
        int reverse = 0;
        while (temp != 0) {
            r = temp % 10;
            reverse = reverse * 10 + r;
            temp = temp / 10;
        }
        System.out.println("the digit is " + digit + " = " + reverse);
    }

    void stringValue(String value) {
        String reverse = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            reverse = reverse + value.charAt(i);
        }
        System.out.println("The String value is " + value + " = " + reverse);
    }

    public static void main(String[] args) {

        Reverse obj = new Reverse();
        obj.intValue(12345);
        obj.stringValue("Abu Masum Didar");
    }

}
