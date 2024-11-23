package LengthOfLastWord;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] splitStr = s.split(" ");
        return splitStr[splitStr.length - 1].length();
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));
    }
}
