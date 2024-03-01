package SimpleProlemsAndSolutions;

public class SwapTwoNumberWithOutThirdVariable {
    private static void swapTwoNumber(int a, int b){
        a = a-b;
        b = b-a;
        a = a+b;
        System.out.println("a = "+a+ " b= "+ b);
    }
    public static void main(String[] args){
        var a= 10;
        var b= 20;
        swapTwoNumber(a,b);
    }
}
