public class Calculator {
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
        return ((double)a/(double)b);
    }
    public static double perecent(int a, int b){
        return ((double)b/100)*a;
    }

    public static void main(String[] args){
        System.out.println(plus(5,6));
        System.out.println(minus(10,5));
        System.out.println(multiply(6,6));
        System.out.println(divide(555,20));
        System.out.println(perecent(1000, 30));
    }
}
