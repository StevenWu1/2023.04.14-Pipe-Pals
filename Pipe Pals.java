import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] words = line.split(" ");
        String ans = "";
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[i].length(); j++){
                String curWord = words[i];
                char curChar = curWord.charAt(j);
                int curInt = (int) curChar;
                if ((curInt < 65 || curInt > 90) && (curInt < 97 || curInt > 122)){
                    ans += curChar;
                }
                else if (Character.isUpperCase(curChar))  {
                    char ch = (char)(((int)curWord.charAt(j) + s - 65) % 26 + 65);
                    ans += ch;
                } else {
                    char ch = (char)(((int)curWord.charAt(j) + s - 97) % 26 + 97);
                    ans += ch;
                }
            }
            ans += " ";
        }
        System.out.println(ans);
    }
}
