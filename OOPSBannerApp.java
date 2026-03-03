public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                buildO(),
                buildO(),
                buildP(),
                buildS()
        };

        // Print each character pattern
        for (String letter : banner) {
            System.out.println(letter);
            System.out.println(); // space between letters
        }
    }

    // Method to build letter O
    public static String buildO() {
        return  " ***** \n" +
                "*     *\n" +
                "*     *\n" +
                "*     *\n" +
                " ***** ";
    }

    // Method to build letter P
    public static String buildP() {
        return  " ***** \n" +
                "*     *\n" +
                " ***** \n" +
                "*      \n" +
                "*      ";
    }

    // Method to build letter S
    public static String buildS() {
        return  " ***** \n" +
                "*      \n" +
                " ***** \n" +
                "      *\n" +
                " ***** ";
    }
}
