package javaprogram;

public class Javademo2 {
    public static void main(String[] args) {
        String str="The madam is going to market";
        int count=0;
        String[] str1=str.split(" ");
        for(String word:str1){
            if(word.equalsIgnoreCase("madam")){
                count++;

            }
        }
        if(count==1){
            System.out.println("its palindrome");
        }else {
            System.out.println("Its not a palindrome");
        }
    }
}
