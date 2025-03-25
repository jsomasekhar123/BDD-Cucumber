package javaprogram;

import java.util.HashSet;

public class DuplicateString {
    public static void main(String[] args) {
        String st="I am am reading java java java reading";
        int count=0;
       // int flag=0;
         String[] str1=st.split(" ");
         HashSet<String> unique =new HashSet<>();
         HashSet<String> dupli=new HashSet<>();
         for(String word:str1){
            // count++;
             if(!unique.add(word)){
                 //flag++;
                 dupli.add(word);
                 //flag++;
             }
             if(word.equalsIgnoreCase("java")){
                  count++;
             }
         }
        System.out.println("Duplicate"+dupli);
        System.out.println(dupli.size());
        System.out.println(unique.size());
        System.out.println(count);

    }

}
