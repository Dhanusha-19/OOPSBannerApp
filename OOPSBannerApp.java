import java.util.Map;
import java.util.HashMap;
public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    private static final Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                " ***** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ****** ",
                "**      ",
                "**      ",
                " *****  ",
                "     ** ",
                "     ** ",
                " ****** "
        }));
    }

    public static void main(String[] args) {

        String word = "OOPS";

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPatternMap cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}