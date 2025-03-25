package javaprogram;

public class Occurance {
    public static void main(String[] args) {
        String input = "AABACCBC";
        int[] count = new int[256]; // Assuming ASCII characters

        // Counting occurrences
        for (char ch : input.toCharArray()) {
            count[ch]++;
            System.out.println(ch);
        }

        // Printing character counts
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.print((char) i + "" + count[i]);
            }
        }

    }
}
