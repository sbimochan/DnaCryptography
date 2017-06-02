import java.util.*;

public class OptimizedOtp {
    public static void main(String[] args) {
       getOTP();
   }

   public static int calculateLength() {
       System.out.println("Enter your word:");
       String word = new Scanner(System.in).nextLine();
       int count = word.length();
       return count;
   }

   public static void getOTP() {
       String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
       StringBuilder salt = new StringBuilder();
       Random rnd = new Random();
       int i = calculateLength();
       while (salt.length() < i) { // length of the random string.
           int index = (int) (rnd.nextFloat() * SALTCHARS.length());
           salt.append(SALTCHARS.charAt(index));
       }
       System.out.println(salt.toString());
   }
 }
