/**
 * StringDemo
 */
public class StringDemo {

    public static void main(String[] args) {
        char[] str={'H','E','L','O','O'};
        String  str1 =new String("Hello");
        String str2= "Helllo";
        System.out.println("First String : "+ String.valueOf(str));
        System.out.println("Second array : "+str1);
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println("e at "+ str2.charAt(1));
        System.out.println(str2.indexOf("e"));

        String s1="New";
        String s2=" Delhi";
        String s3=s1+s2+s2;
        System.out.println("s1+s2 : "+ s1.concat(s2));
        System.out.println(s1.compareTo("New"));
        System.out.println(s1.compareTo("Delhi"));
        System.out.println(s1.compareToIgnoreCase("new"));
        System.out.println(s1.contentEquals("new"));
        System.out.println(s3.lastIndexOf("Delhi"));
        System.out.println(s3.lastIndexOf("D"));
        System.out.println(s3.lastIndexOf('D'));
        
        String state="Andhra Pradesh";
        System.out.println(state.substring(3));
        System.out.println(state.substring(3, 7));
        System.out.println(state.toLowerCase());
        System.out.println(state.toUpperCase());
        
    }
}