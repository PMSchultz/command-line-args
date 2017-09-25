package edu.cnm.deepdive.intro;



/**
 * This class demonstrates iteration over command line arguments
 *
 * @author paulaschultz
 */

public class CommandLineArgs {

  /**
   * Iterates through the arguments <code>args</code>, printing each one.
   *
   * @param args command line arguments
   */
  public static void main (String[] args) {

    //for (String argument : args){ Enhanced for loop (do not need a counter, must start at 0, ending n-1, cannot modify
    //System.out.println(argument);} cannot iterate backwards

    //for (int i = 0; i < args.length; i++){ to go through array from 0 to n
    //  String argument = args[i];
    //  System.out.println (i + ": " + argument);

    for (int i = args.length - 1; i >= 0; i--){
      String argument = args[i];
      System.out.printf ("%d: %s%n", i, argument);

    }
  }
}
