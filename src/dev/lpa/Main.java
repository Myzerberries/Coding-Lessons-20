package dev.lpa;

import java.util.Arrays;

public class Main {

    //Notice that the parameter to the main method is an array of String.

    //This means we can pass an array of Strings to this method, when it's called.

    //Or, if we use this method as the entry point to our application, we can pass data on the command line to this
    //method.

    //But this signature can be written in a slightly different way.

    //We can replace the brackets after the String type, which we know tells us this method will take an array of String.

    //And we can instead replace that with three periods.

    //This is a special designation for Java, that means Java will take zero, one, or many Strings as arguments to this
    //method, and create an array with which to process them in the method.

    //public static void main(String... args){}

    //The array will be called args, and be of type String.

    //So what's the difference?

    //The difference is minor within the method body, but significant to the code that calls the method.

    public static void main(String[] args) {

        int [] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        modifyArray(myIntArray);

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        //In the code above, since there are two references to the same object (myIntArray and anotherArray), if either
        //reference assigns a value to the array, the object itself will change. So both reference values change when
        //printed.

        //The same also works if we introduce a method, seen below.
        //We are passing the array, myIntArray, into the modifyArray method, which takes then has its parameter  set
        //the value of our array (Now we have 3 references to the same object).

        //A general tip: If you don't want the elements in your array to change, it's a good idea to pass a copy of
        //your array to a method, if you're not sure what that method might do.

    }

    private static void modifyArray(int[] array){

        array[1] = 2;

    }

}


//Reference vs. Object vs. Instance vs. Class:

//When you assign an object to a variable, the variable becomes a reference to that object.

//This is true of arrays, but the array has yet another level of indirection, if it's an array of objects.

//This means every array element is also a reference.