import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */
        int n, r, sumN=1, sumR=1, subTotal=1, result;
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        n = input.nextInt();
        System.out.print("r sayısını giriniz : ");
        r = input.nextInt();

        for(int j = 1; j<=(n-r) ; j++){
            subTotal = subTotal * j;
        }
        for(int i = 1 ; i<=n ; i++){
            sumN = sumN * i;
        }
        for(int k = 1; k<=r ; k++){
            sumR = sumR * k;
        }
        result = sumN / (sumR * subTotal);
        System.out.println("C(" + n + "," + r + ")" + " = " + result);
    }
}