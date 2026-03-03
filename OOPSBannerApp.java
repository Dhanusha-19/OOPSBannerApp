import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static Inner Class to encapsulate Character and Pattern
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

    // Centralized Character Pattern Storage
    private static final Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

    // Static Block to initialize patterns
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

        int height = 7; // All characters are 7 lines tall

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