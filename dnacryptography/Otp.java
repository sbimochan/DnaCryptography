import java.util.*;

public class Otp {
    public static String Scann(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:" );
        String word1 = scan.nextLine();
        return word1;
    }
    public static void main(String[] args) {
        //String maam = Scann();
        //int len = getLength();
//        System.out.println(len);
        String otp = getOTP();
        System.out.println(otp);
        
    }
    public static int getLength(){
        int len = Scann().length();
        return len;
    }
    public static String getOTP() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        int i = getLength();
        while (salt.length() < i) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}