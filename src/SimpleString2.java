import java.util.ArrayList;
public class SimpleString2 {

    private ArrayList<Character> array; // creating a new array list

    public SimpleString2() {
        this.array = new ArrayList<>();
        array.add('h');
        array.add('e');
        array.add('l');
        array.add('l');
        array.add('o');

    } // making a default constructor for array

    public SimpleString2(ArrayList<Character> a){ // creating another constructor
        this.array = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){ // looping through the array
            array.add(a.get(i)); // setting the arrays values equal
        }
    }

    public SimpleString2(SimpleString2 str) { // creating a constructor
        this.array = new ArrayList<>(str.length()); // initializing the array list
        for(int i = 0; i < str.length(); i++){ // making a for loop for to match the characters with the array
            array.add(str.charAt(i)); // adding the characters at the index of i in str to array
        }
    }

    public SimpleString2 substring(int from) { // creating a substring method
        ArrayList<Character> array2 = new ArrayList<>(); // creating a new array to be from "from" to the end of the string
        for(int i = from; i < array.size(); i++){  // creating a for loop to fill in the matching characters to the array
            array2.add(array.get(i));
        }
        SimpleString2 str = new SimpleString2(array2); // creating a new simple string equal to the array created
        return str; // returning the string
    }

    public SimpleString2 substring(int from, int to) { // creating another sub string, but from "from" to "to"
        ArrayList<Character> array2 = new ArrayList<>(); // finding the distance between the two and creating a new array
        for(int i = from; i < to ; i++){
            array2.add(array.get(i));
        }SimpleString2 str = new SimpleString2(array2);
        return str;
    }

    public char charAt(int val) { // accessing the value of the array
        return array.get(val);
    }

    public int indexOf(SimpleString2 myStr) { // creating a method to find the index of a sting/ character
        int index = -1; // creating an index variable
        char character = myStr.charAt(0);
        for(int i = 0; i < array.size(); i++){ // creating a for loop to check the arrays
            if(character == array.get(i)){ // checking to see if the array matches the index
                index = i; // if so, setting them equal
            }
        } return index; // returning the characters
    }

    public SimpleString2 concat(SimpleString2 str) { // creating a concat method
        for (int i = 0; i < str.length(); i++){ // looping through the number of characters in str
            array.add(str.charAt(i)); // adding the values at that index to array
        }
        SimpleString2 string = new SimpleString2(array); // creating a new simple string from array
        return string; // returning array
    }

    public String toString() { // creating a .toString method to format the string
        String c = "";
        for(char item: array){
            c+= item + "";
        }
        return c;
    }

    public int length() { // getting the length of the array
        int length = array.size();
        return length;
    }
}
