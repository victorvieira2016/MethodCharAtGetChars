//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MethodCharAtGetChars {
    public static void main(String[] args) {

        String s1 = "Hello there";
        char[] arrayChar = new char[5];

        System.out.printf("s1 = %s",s1);

        System.out.printf("%nLength of s1 = %d", s1.length());

        System.out.printf("%nString reversed = ");
        for(int count = s1.length() - 1; count >= 0; count --)
            System.out.printf("%c", s1.charAt(count));

        s1.getChars(0, 5, arrayChar, 0);

        System.out.printf("%nGet character, result = ");
        for(char character: arrayChar)
            System.out.printf("%s", character);
    }
}