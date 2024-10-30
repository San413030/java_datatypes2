package main;

public class Example2 {
    public static void main(String[] args) {
        double d1= 10.5;
        float f1= (float) d1;
        float f2= 10.5F;

        d1=f1;
        f1= (float) d1;
        int i1= (int) d1;
        System.out.println(i1);
    }
}
