package mypack;

import java.util.Scanner;
import temperature.Conversion;

/**
 * Temperature
 */
public class Temperature {
    double ctemp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperature temp= new Temperature();
        Conversion cv = new Conversion();
        System.out.print("input the temperature in fahrenheit: ");
        temp.ctemp= sc.nextDouble();
        System.out.println("converted temp to celcius : "+ cv.convert(temp.ctemp));
        sc.close();

    }
}