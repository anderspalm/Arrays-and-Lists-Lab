package ga.lab;


import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args){

        String charString;
        double summedDoubles;
        int middleValue;
//
//        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");
        stringLengthOrValue("hello");

//        //Problem 2:
        reversedOrder();
//
//        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});
////
//        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line
//
//
//        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        //how do we print a variable to the command line
        System.out.println(charString);
        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        //how do we print a variable to the command line
        System.out.println(charString);
        charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        //how do we print a variable to the command line
        System.out.println(charString);
        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        //how do we print a variable to the command line
        System.out.println(charString);
//
//        //Problem 6:
//        //Put your code for problem 6 here


            List<String> myStringList = new ArrayList<>();
            myStringList.add("one");
            myStringList.add("two");
            myStringList.add("three");
            myStringList.add("four");
            myStringList.add("five");

//
//        //Problem 7:
//        reversedStringOrder(/*use the List you created in problem 6*/);
            reversedStringOrder("Hello!");
//
//        //Problem 8:
//        printOrAdd(/*use the List you created in problem 6*/);
            printOrAdd(myStringList);
//
//        //Problem 9:
//        //Create an int array of an odd size, with the variable name 'oddSizedArray'
//        //Make sure the size is at least 5.
            int[] oddSizedArray = new int[25];
        //Problem 10:
        findMiddle(oddSizedArray);
        //how do we print a variable to the command line

        findMiddle(new int[]{2,7,9,12,15});
        //how do we print a variable to the command line

        findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        //how do we print a variable to the command line

        findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        //how do we print a variable to the command line

    }

    public static String stringLengthOrValue(String word) {
        if (word.length() > 5) {
            System.out.println(word);
        }
        else if (word.length() == 5) {
            System.out.println("Computer says no...");
        }
        else {
            System.out.println(word.length());
        }
        return null;
    }

    public static void reversedOrder() {
        int[] intarray = new int[10];
        for(int i = 0; i < intarray.length -1; i ++) {
            intarray[i] = 1;
        }
         for(int i = intarray.length -1; i >= 0; i --) {
             System.out.print(i);
        }

    }

    /* Write a function maxValue that accepts one int array parameter.
    This function should loop through the array to return the max value in that array.
    If the array is of size 1, the max value is the only item in the array. If the array is of size 10,
    how do we keep a record of the current max value when looping through the array?
     */

    public static int[] maxValue(int[] array) {
        int largest_num = array[0];
        System.out.print(array[0] + " ");
        for(int i = 0; i <array.length; i ++) {
            if (array[i] > largest_num)  {
                largest_num = array[i];
                System.out.print(largest_num + " ");
            }
            else {
                continue;
            }
        }
        return null;
    }

    // Write a function sumOfValues that accepts a double array parameter. This function should loop through the array
    // and ADD all the values in the array. It should then return the sum of the values. The sum must then be assigned
    // to the variable summedDoubles and the value of the variable should then be printed to the command line.

    public static double sumOfValues(double[] one){

        double one_total = 0;
        for(int i = 0; i <one.length -1; i ++) {
            one_total += one[i];
        }
    return one_total ;
    }

    // Write a function charsToString that takes in a char array parameter. This function should loop through the
    // array and concatenate each char value into a String. It should then return the String that was created. The
    // String must then be assigned to the variable charString and the value of the variable should then be printed
    // to the command line.

    public static String charsToString(char[] one) {

        String one_string = "";
        for (int i = 0; i < one.length; i++) {
            String word = String.valueOf(one[i]);
            one_string += word;
        }
        return one_string;
    }



//    Create a List of type String with the variable name myStringList. At least 5 String values to the list.
// (You can put any 5 String values you want).


//
//    Write a function reversedStringOrder that accepts a List parameter of type String. The function should
// loop through the List and print each String in reverse order to the command line (last String first). Use the
// List you created in problem 6 as the parameter you give to the function.

    public static String reversedStringOrder(String word) {
        System.out.println("\n");
        for(int i = word.length() -1; i >= 0; i --) {
           System.out.print(word.charAt(i));
       }
        return word;
    }
//
//    Write in a function printOrAdd that accepts a List parameter of type String. The function should print all
// values in the list if the size of the List is equal to 10. If the size of the list is less than 10, add a String
// value to the list that consists of the word "Java" concatenated with the current size of the list. Use the List
// you created in problem 6.

    public static String printOrAdd(List<String> List) {
        if (List.size() == 10) {
            System.out.println(List);
        }
        else if (List.size() < 10) {
            String new_list = "Java";
            List.add(new_list);
        }
        System.out.println("\n");
        System.out.println(List);
        return List.toString();
    }


//
//    Create an int array of an odd size with the variable name oddSizedArray. Make sure the size is at least 5.





//
//    Write a function findMiddle that accepts a int array parameter. The function should access the value of the
// item at the middle of the array. The function should then return that value and assign it to the int variable
// middleValue. Print the value of middleValue to the command line. Use the array you created in problem 9 for one
// of the examples.

    public static int findMiddle(int[] middle) {

        int middleValue = middle[middle.length/2];
        System.out.println(middleValue);
        return middle[middle.length/2];

    }
//
//    //declare your functions
}
