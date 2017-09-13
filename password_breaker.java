import java.util.Scanner;
/**
 * password_breaker: uses brute force to break a password 5 characters in length
 *
 * @author  andrewberendsen
 * @version 3/9/17.
 */
public class password_breaker {
final static String alphabet = "012345689!@#$%^&*abcdefghijklmnopqrstuvwxyzACDEFGHIJKLMNOPQRSTUVWXYZ";
final static int length = alphabet.length();

    private String breaker(String s) {
      if (s == null) return null;
      if (s.length() > 8) return s;
      int i, j, k, x, y, q, w, n;
      for (i = 0; i < length; i++) {
        char one = alphabet.charAt(i);
        String guess = "" + one;
        if (guess.equals(s)) {
          return guess;
        }
        for (j = 0; j < length ; j++) {
          char two = alphabet.charAt(j);
          guess = "" + one + two;
          if (guess.equals(s)) {
            return guess;
          }
          for (k = 0; k < length ; k++) {
            char three = alphabet.charAt(k);
            guess = "" + one + two + three;
            if (guess.equals(s)) {
              return guess;
            }
            for (x = 0; x < length; x++) {
              char four = alphabet.charAt(x);
              guess = "" + one + two + three + four;
              if (guess.equals(s)) {
                return guess;
              }
              for (y = 0; y < length; y++) {
                char five = alphabet.charAt(y);
                guess = "" + one + two + three + four + five;
                if (guess.equals(s)) {
                  return guess;
                }
                /*for (q = 0; q < length; q++) {
                  char six = alphabet.charAt(q);
                  guess = "" + one + two + three + four + five + six;
                  if (guess.equals(s)) {
                    return guess;
                  }
                  for (w = 0; w < length; w++) {
                    char seven = alphabet.charAt(w);
                    guess = "" + one + two + three + four + five + six + seven;
                    if (guess.equals(s)) {
                      return guess;
                    }
                    for (n = 0; n < length; n++) {
                      char eight = alphabet.charAt(n);
                      guess = "" + one + two + three + four + five + six + seven + eight;
                      if (guess.equals(s)) {
                        return guess;
                      }

                    }
                  }
                }*/
              }
            }
          }
          //System.out.println("Guess = " + guess);

        }
      }
        return null;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        password_breaker pb = new password_breaker();
        password = pb.breaker(password);
        System.out.println("Here is your password: " + password);
    }
}
