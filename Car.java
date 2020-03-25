import java.util.Scanner;

/**
 * Car
 */
public class Car {
    String color;
    int speed;
    String model;
    int price;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car obj= new Car();
        System.out.println("Enter model");
        obj.model= sc.next();
        System.out.println("Enter speed");
        obj.speed= sc.nextInt();
        System.out.println("Enter color");
        obj.color= sc.next();    
        System.out.println("Enter price");
        obj.price= sc.nextInt();

        System.out.println("model: "+obj.model+ " \nspeed: "+ obj.speed+ " \ncolor: "+ obj.color+ " \nPrice: "+ obj.price);
        sc.close();
    }
    

    

    // void getColor(){

    // }
    // void getSpeed(){

    // }
    // void getCost(){

    // }
}