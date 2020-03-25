/**
 * ConstructorOverloading
 */
public class ConstructorOverloading {

    public ConstructorOverloading(){
        System.out.println("Child default");
    }
    public ConstructorOverloading(int i){
        System.out.println("Child Parameterised int i : " +i);
    }
    public ConstructorOverloading(String name){
        System.out.println("Child Parameterised name : "+name);
    }
    public static void main(String[] args) {
        ConstructorOverloading obj= new ConstructorOverloading();
        ConstructorOverloading obj1= new ConstructorOverloading(20);
        ConstructorOverloading obj2= new ConstructorOverloading("ABhi");
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
    }
}