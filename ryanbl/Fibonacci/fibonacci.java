/*
 * Much like C's stdio.h, the java.io.* classes will let us access stdin and stdout.
 */

import java.io.*;

/*
 * Like Ruby, in java, everything is an object. To write a program, you'll need to
 * start by declaring a class. As in C, our program execution starts with the main
 * function. Also like C, Java is a compiled language, so you'll need to compile 
 * the code and then run the class using the java interpreter.
 */

class Fibonacci {

  /*
   * So here we are defining the main function. Remember that this is supposed to
   * actually run this program, so the function needs to be `public`, in addition,
   * it's `static`, meaning we can call this method without an object of the Fibonacci
   * class being instantiated, and it doesn't need to return anything, as it will
   * run by the interpreter, which will handle the exit status. 
   */

  public static void main(String args[]) {

    /* 
     * We are using System.out.println here, but newer versions of Java have the printf method.
     */

    System.out.println("How many numbers of the sequence would you like?");

    /*
     * I'm sure there's more than one way to skin a cat, but to read stdin here, we
     * are creating a new BufferedReader, which will read one line of input.
     */

    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br    = new BufferedReader(sr);

    /*
     * Now here is a concept we haven't addressed yet. The java compiler complains if
     * you try to call a method that could throw an exception (error), so I've included
     * an example here of how to handle the exceptions that could be thrown. Also, like
     * in our previous examples, we are casting the input to an integer.
     */

    try {
      String input = br.readLine();
      int n = Integer.valueOf(input).intValue();
      fibonacci(n);
    } catch (NumberFormatException e){
      System.out.println("That is not an integer. Please enter an integer value");
    } catch (IOException e) {
      System.out.println("I did not recieve an input");
    }
  }

  /*
   * So here is our Fibonacci function. like the main function, it is public and can be
   * called without creating a Fibonacci object. We've also introduced a new method of 
   * calculating the sequence without using a temporary variable. In a later post, I will
   * examine the different algorithms used to calculate the Fibonacci sequence, and compare
   * performance in multiple languages.
   */

  public static void fibonacci(int n){
    int a=0,b=1;

    for (int i=0;i<n;i++){
      System.out.println(a);
      a=a+b;
      b=a-b;
    }
  }
}