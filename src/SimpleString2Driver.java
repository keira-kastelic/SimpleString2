import java.lang.reflect.Array;
import java.util.ArrayList;

public class SimpleString2Driver extends SimpleString2 {
    public static void main(String[] args) {
        SimpleString2 string = new SimpleString2();
        System.out.println(string);
        ArrayList<Character> a = new ArrayList<>();
        a.add('h');
        a.add('e');
        SimpleString2 string2 = new SimpleString2(a);
        System.out.println(string2);
        System.out.println(string.substring(2));
        System.out.println(string.substring(1,3));
        System.out.println(string.charAt(2));
        System.out.println(string.indexOf(string2));
        System.out.println(string.concat(string2));
        string.toString();
        System.out.println(string.length());



    }
}
