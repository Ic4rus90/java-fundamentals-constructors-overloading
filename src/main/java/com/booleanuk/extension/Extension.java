package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*
        Implement the following methods:

        1. add, which accepts two floats and returns a float (both floats added together)

        2. add, which accepts two doubles and returns a double (both doubles added together)

        3. subtract, which accepts two floats and returns a float (first float minus second float)

        4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed

        5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

        6. multiply, which accepts a string and an int, and returns a string containing the provided string
        as many times as the provided int separated by a comma. E.g.
        multiply("Hello", 3) -> "Hello,Hello,Hello"

        7. multiply, which accepts an array of Strings that each contain a number, and an int
        The method should return an array of ints that contain the value of multiplying each String number by the provided int
        E.g.
        multiply(["2", "7", "3"], 3) -> [6, 21, 9]
     */

    public float add (float one, float two){
        return one + two;
    }

    public double add (double one, double two){
        return one + two;
    }

    public float subtract (float one, float two){
        return one - two;
    }

    public String subtract (String s, char c){
        String new_string = "" + c;
        return s.replace(new_string, "");
    }

    public int multiply (int one, int two){
        return one * two;
    }

    public String multiply(String s, int number){
        StringBuilder new_string = new StringBuilder();

        for (int i = 0; i < number; i++){
            if (i != number-1){
                new_string.append(s).append(',');
            }
            else new_string.append(s);

        }

        return new_string.toString();
    }

    public int [] multiply(String [] numbers, int number){
        int [] new_array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            new_array[i] = Integer.parseInt(numbers[i]) * number;
        }
        return new_array;
    }
}



