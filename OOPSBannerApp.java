public class OOPSBanner {

    public static void main(String[] args) {

        String line1 = String.join("   ",
                " OOOO ",
                " OOOO ",
                " PPPP ",
                " SSSS ");
        System.out.println(line1);

        String line2 = String.join("   ",
                "O    O",
                "O    O",
                "P    P",
                "S     ");
        System.out.println(line2);

        String line3 = String.join("   ",
                "O    O",
                "O    O",
                "PPPPP ",
                " SSSS ");
        System.out.println(line3);

        String line4 = String.join("   ",
                "O    O",
                "O    O",
                "P     ",
                "     S");
        System.out.println(line4);

        String line5 = String.join("   ",
                " OOOO ",
                " OOOO ",
                "P     ",
                " SSSS ");
        System.out.println(line5);
    }
}