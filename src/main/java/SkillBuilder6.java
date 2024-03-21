
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {
    private static final char BEGINNING = 't';
    private static final char FINISHING = 'y';


    public static String findTYPattern(String s) {
        String stringy = "";
        boolean startingChar = false;
        int index = 0;

        while (index < s.length()) {

            char c = s.charAt(index);

            if (!startingChar) {
                if (Character.toLowerCase(c) == BEGINNING) {

                    startingChar = true;

                    stringy += c;
                } else if (Character.toLowerCase(c) == FINISHING) {

                    index++;
                }
            } else {
                stringy += c;
                if (Character.toLowerCase(c) == FINISHING) {

                    return stringy;
                }
            }
            index++;
        }
        return "";
    }
}


