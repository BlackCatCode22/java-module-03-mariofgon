public class RevStrWarmUp {
    public static void main(String[] args) {
        String myStr = "SNOWBOARD";
        String myRevStr = "";

        for (int i = myStr.length() - 1; i >= 0; i--) {
            myRevStr += myStr.charAt(i);
        }

        System.out.println(myRevStr);

    }
}
