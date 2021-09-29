package edu.cnm.deepdive;

public class FizzBuzz {

  public String getFizzBuzz(int value) {
    String str;
    /*Remember, everything else goes here, similar to Flowgarithm Chart!! */
    if (value % 3 == 0) {
      if (value % 5 == 0) {
        str = "FizzBuzz";
      } else {
        str = "Fizz";
      }
    } else if (value % 5 == 0) {
      str = "Buzz";
    } else {
      str = String.valueOf(value);
    }
    return str;
  }
}
