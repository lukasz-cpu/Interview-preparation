public class Palidrome {

    public static void main(String[] args) {

        System.out.println(checkIfPalidrome("level"));
        System.out.println(checkIfPalidrome("levell"));


    }


    static boolean checkIfPalidrome(String word) {
        int length = word.length();
        int forward = 0;
        int backward = length - 1;

        char[] wordChars = word.toCharArray();

        while (backward > forward) {
            char backwardWordChar = wordChars[backward];
            char forwardWordChar = wordChars[forward];
            if(forwardWordChar != backwardWordChar){
                return false;
            }
            forward++;
            backward--;

        }
        return true;

    }
}


