package SimpleProlemsAndSolutions;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int sum = 0;
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            sum += a;
        }

        System.out.println(sum);
    }
}
