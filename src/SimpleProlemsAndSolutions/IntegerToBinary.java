package SimpleProlemsAndSolutions;

public class IntegerToBinary {

    private static void decimalToBinary(int n){
        int[] storeBinary = new int[1000];
        int i = 0;
        while(n>0){
            storeBinary[i] = n%2;
            n = n /2;
            i++;
        }
        StringBuilder s = new StringBuilder();
        for(int j = i-1; j>=0; j--){
            s.append(String.valueOf(storeBinary[j]));
            System.out.print(storeBinary[j]);
        }
    }
    public static void main(String[] args){
        int n = 17;
        System.out.println("Decimal Number: "+ n);
        System.out.println("Binary Number: ");
        decimalToBinary(n);
    }
}
