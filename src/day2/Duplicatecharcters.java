package day2;

public class Duplicatecharcters {



    public static void main(String[] args) {

        String str = "programming";

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ' || str.indexOf(ch) != i) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(ch + " = " + count);
            }
        }
    }



}
