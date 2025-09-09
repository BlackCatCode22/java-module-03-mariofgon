public class RevStrWarmUp2 {

    public static void main(String[] args) {

        String myStr = "abcdefghijk";
        String myRevStr = "";
        System.out.print("");


        int strLength = myStr.length();

        System.out.println("\n strLength is " + strLength);
        System.out.println("\n char at index 10 is " + myStr.charAt(10));

        for (int i = (strLength - 1); i >= 0; i--) {
            System.out.print("\n the char at "+ i + " is " + myStr.charAt(i));
            myRevStr += myStr.charAt(i);

        }

        System.out.println("\n\n myRevStr is: " + myRevStr + "\n\n");




    }
}