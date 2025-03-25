package javaprogram;

public class Fibonacii {
    public static void main(String[] args) {
        int num=10;
        int fn=0;
        int sn=1;

        System.out.println(fn);
        System.out.println(sn);
        for(int i=3;i<=num;i++){
           int tn=fn+sn;
            System.out.println(tn);
            fn=sn;
            sn=tn;
        }
    }
}
