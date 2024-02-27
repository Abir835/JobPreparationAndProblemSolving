package leeetcode;

import java.util.Arrays;

public class ValidAnagram {

    String s = "abir";
    String t = "hasan";

    public static void main(String[] args){

        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.validsAangram(validAnagram.s,validAnagram.t));

    }

    private boolean validsAangram(String n, String m) {
        char[] s = n.toCharArray();
        char[] t = m.toCharArray();

        Arrays.sort(s);
        Arrays.sort(t);
        return Arrays.equals(s,t);
    }
}
