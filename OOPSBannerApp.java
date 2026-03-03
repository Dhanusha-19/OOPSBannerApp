import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Centralized Pattern Storage using HashMap
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize all character patterns
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        });

        patternMap.put('S', new String[]{
                " ****** ",
                "**      ",
                "**      ",
                " *****  ",
                "     ** ",
                "     ** ",
                " ****** "
        });
    }

    // Reusable Banner Rendering Function
    private static void renderBanner(String word) {

        int height = 7; // Each character is 7 lines tall

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                } else {
                    line.append("       "); // Space for unknown characters
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";

        renderBanner(word);
    }
}