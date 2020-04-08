import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Set<Character> ch = new HashSet<>();
        String userName = in.nextLine();
        for (int i = 0; i < userName.length(); i++)
            ch.add(userName.charAt(i));
        if (ch.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

        in.close();

    }

}
    
