package javaprogram;

public class ReverseString {
    public static void main(String[] args) {
        String str="MADAM1";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);
        if(rev.equalsIgnoreCase(str)){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("Its not a palindrome");
        }

    }
}
