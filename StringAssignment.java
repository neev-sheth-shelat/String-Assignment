import java.util.*;

public class StringIntro{
    public static void main(String[] args){
        //Strings are immutable so the main string is never altered, a new one must be created

        String address = new String("1 Grizzly Way, Granite Bay, CA"); //AP Test Way to create string object

        String location = "Granite Bay High School"; //Autoboxed by the String class

        System.out.println(location + "\n" + address);

        //Methods for AP Test
        int length = address.length(); //Returns number of characters and stores in length variable
        System.out.println(length);
        System.out.println(address.length()); //Directly prints the number of characters in address

        String city = address.substring(15, 26); //A substring is stored from char 14 to char 25: the last number is exclusive, so it is not returned
        System.out.println(city);

        int letterLocation = location.indexOf("Bay"); 
        System.out.println(letterLocation); //Prints 8 because the B in Bay starts at location 8 within the String location,, the first character is always 0
        int notLetterLocation = location.indexOf("P");
        System.out.println(notLetterLocation); //prints -1 because there is no P in the String location

        System.out.println(location.equals(address)); //when comparing 2 objects, it returns a boolean value, it is case and order sensitive
        System.out.println("Granite Bay High School".equals(address)); //when comparing a string literal and object
        System.out.println("Granite Bay High School".equals("Granite Bay High School")); //when comparing 2 string literals

        String x = new String("hi");
        String y = new String("hi");
        
        System.out.println(y == x); //cannot compare 2 string objects using ==
        System.out.println(x == "hi"); //cannot compare a string object and string literal using ==
        System.out.println("hi" == "hi"); //can compare 2 string literals

        String z = "hi";
        System.out.println(z == "hi"); //can compare z with "hi" because z is defined as a string literal

        int compare = x.compareTo(y); //when the strings are the exact same 0 is returned
        System.out.println(compare);

        int compare2 = x.compareTo("Hi"); //returns 32 because h is 32 places higher than H on the askey chart
        System.out.println(compare2);
        
        int compare3 = "Hi".compareTo(x); //returns -32 because H is 32 places lower than h on the askey chart
        System.out.println(compare3);

        String[] listOfLetters = location.split("a"); //splits String location wherever there is an "a"
        System.out.println(Arrays.toString(listOfLetters));

        


    }  
}