package javaprogram;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=6;
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.println("Its a prime number");
        }else {
            System.out.println("Its not a prime number");
        }
    }
}
