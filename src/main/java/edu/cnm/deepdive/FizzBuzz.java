package edu.cnm.deepdive;

/**
 * Implements a method that computes the FizzBuzz {@link String} value for any non-negative integer.
 * This implementation ignores the common form of the FizzBuzz challenge (i.e. "Write the numbers
 * from 1 to 100, but replace all multiples of 3 with the word 'fizz', all multiples of 5 with the
 * word 'buzz', and all multiples of both 3 and 5 with the word 'fizzbuzz'.") Instead, this
 * implementation includes a method that produces the single FizzBuzz value for a single integer.
 * This allows for more direct unit testing.
 */
public class FizzBuzz {


  static final String FIZZ_BUZZ_VALUE = "FIZZ_BUZZ";
  static final String FIZZ_VALUE = "Fizz";
  static final String BUZZ_VALUE = "Buzz";

  /**
   * Computes and returns {@link String} FizzBuzz value for a specified non-negative integer. Return
   * value will be "Fizz", "Buzz", or "FizzBuzz", or the string representation of {@code value}
   * depending on whether it is divisible by 3, 5, 15, or none of the above.
   *
   * @param value {@code int} for which the FizzBuzz value will be computed.
   * @return {@link String} corresponding to {@code value}
   */
  public String getFizzBuzz(int value) {
    String str;
    /*Remember, everything else goes here, similar to Flowgarithm Chart!! */
    if (value % 3 == 0) {
      if (value % 5 == 0) {
        str = FIZZ_BUZZ_VALUE;
      } else {
        str = FIZZ_VALUE;
      }
    } else if (value % 5 == 0) {
      str = BUZZ_VALUE;
    } else {
      str = String.valueOf(value);
    }
    return str;
  }
}
