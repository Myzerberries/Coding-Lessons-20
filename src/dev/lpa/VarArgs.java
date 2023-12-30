package dev.lpa;

public class VarArgs {

    public static void main(String... args) {

        System.out.println("Hello world");


        //The split method splits a String into a string array, by whatever delimiter you tell it to use.

        //This method takes a String, which can support regular expressions, which tells the method what the String
        //should be split on. In this case, we're going to split by the spaces in the sentence.

        //This means the String will get split into pieces, and the method returns an array of the parts, and array of String.

        //This will give us an array of two Strings back, printed on separate lines using our method.
        String[] splitStrings = "Hello World".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        //Here we are passing multiple strings as arguments to the method:
        System.out.println("_".repeat(20));
        printText("Hello", "World", "again", "again", "again");

        //We can also pass no arguments to the method as well:
        System.out.println("_".repeat(20));
        printText();

        //Below, we create a String array using an anonymous array initializer. It's called anonymous because the type
        //isn't included, but Java can figure it out because it's being used in a declaration statement.
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        //Here, we print out the result of the String.join method, with a comma as the first value, and our array as
        //the last argument.
        System.out.println(String.join(",", sArray));
    }

    //In the method below, if we change String[] to String..., we can pass both the array from our main method, but
    //we can also pass a simple String if we want.
    private static void printText(String... textList){

        for(String t : textList){
            System.out.println(t);
        }

    }

}

//When can you use variable arguments(varargs)?

//There can be only one variable argument in a method.

//The variable argument must be the last argument.
