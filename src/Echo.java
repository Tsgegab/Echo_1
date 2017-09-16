
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Echo{
    public static void main(String[] args){
        Byte byteValue;
        char charValue;
        Short shortValue;
        Long longValue;
        int intValue;
        Float floatValue;
        Double doubleValue;
        boolean blooneanValue;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a byte value(number from -128 and 127");
        byteValue = keyboard.nextByte();
        JOptionPane.showMessageDialog(null, " You have just entered " + byteValue);
        System.out.println(" Enter a char value");
        charValue = keyboard.next().charAt(0);
        JOptionPane.showMessageDialog(null, "You just entered " + charValue);
        System.out.println("Enter a short value(number from -32,768 and 32,767");
        shortValue = keyboard.nextShort();
        JOptionPane.showMessageDialog(null, " You have just entered " + shortValue);
        System.out.println("Enter a long value (number from -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807");
        longValue = keyboard.nextLong();
        JOptionPane.showMessageDialog(null, "You just entered " + longValue);
        System.out.println("Enter a int value ( number from -2,147,483,648 and 2,147,483,647");
        intValue =  keyboard.nextInt();
        JOptionPane.showMessageDialog(null, "You just entered " + intValue);
        System.out.println("Enter a float value ( number from 3.40282347*10^38 and 1.40239846*10^-45");
        floatValue = keyboard.nextFloat();
        JOptionPane.showMessageDialog(null, "You just entered " + floatValue);
        System.out.println("Enter a double value ( number from 1.79769313486231570*10^308 and 4.94065645841246544*10^-324");
        doubleValue = keyboard.nextDouble();
        JOptionPane.showMessageDialog(null, "You just entered " + doubleValue);
        System.out.println("Enter a blooean value ( True and False");
        blooneanValue = keyboard.nextBoolean();
        JOptionPane.showMessageDialog(null, "You just entered " + blooneanValue);
    }

}


