package SimpleProlemsAndSolutions;

public class SwapTwoNumbers {

    private static void swapTwoNumber(int a, int b){
        var temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+a+ " b= "+ b);
    }
    public static void main(String[] args){
        var a= 10;
        var b= 20;
        swapTwoNumber(a,b);
    }
}
