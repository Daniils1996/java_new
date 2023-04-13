import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any word you want to reverse:");
        Scanner myObj = new Scanner(System.in);
        String word = myObj.nextLine();
        String r = reverse(String.valueOf(word));
        System.out.println(r);
    }

    public static String reverse (String s) {

        char[] letters = new char[s.length()];

        int letterIndex = 0;
        for (int i = s.length() - 1; i>=0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }

        String reverse = "";
        for (int i = 0; i<s.length(); i++){
            reverse = reverse + letters[i];
        }
        return reverse;

    }
}