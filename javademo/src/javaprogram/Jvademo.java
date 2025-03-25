package javaprogram;

public class Jvademo {

    static void checkWord(String name, String word) {
        String res = "";
        if (name.contains(word.toLowerCase())) {

            for (String temp : name.split(" ")) {
                if (temp.toLowerCase().equalsIgnoreCase(word)) {
                    StringBuilder str = new StringBuilder(temp);
                    res = str.reverse().toString();

                    if (temp.equalsIgnoreCase(res)) {
                        System.out.println(temp + "  is a palindrom word");
                    } else {
                        System.out.println(temp + "  is not a palendrom word");
                    }
                }
            }

        } else {
            System.out.println(word + "  is not present in the given sentence");
        }
    }


        public static void main(String[] args) {


            String name ="The is going to market madam";
            checkWord(name,"madam");
        }
    }

