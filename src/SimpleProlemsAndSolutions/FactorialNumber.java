package SimpleProlemsAndSolutions;

public class FactorialNumber {

    private static int factNumber(int number) {
        if(number == 0){
            return 1;
        }
        else {
            return (number * factNumber(number-1));
        }
    }
    public static void main(String[] args){
        int i, fact = 1;
        int number = 3;
        fact = factNumber(number);
        System.out.println(fact);
    }
}
