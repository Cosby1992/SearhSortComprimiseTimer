public class Comprimise {


    public static String runLengthEncoding(String textInput) {

        String text = textInput.replaceAll("\\s","");


        String encodedString = "";

        for (int i = 0, count = 1; i < text.length(); i++) {
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1))
                count++;
            else if (count > 1) {
                encodedString = encodedString.concat(Integer.toString(count))
                        .concat(Character.toString(text.charAt(i)));
                count = 1;
            } else if (count == 1) {
                encodedString = encodedString.concat(Character.toString(text.charAt(i)));
                count = 1;
            }
        }

        return encodedString;
    }

    public static int getNumberOfChars(String text){
        int sum = 0;

        sum = text.length();

        return sum;

    }





}
