import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = recFunc1(n);
        recFunc2(m+5,n);
    }
    static int recFunc1(int n)
    {
        //System.out.print(n + " ");
        if (n > 0)
        {
            System.out.print(n + " ");
            return recFunc1(n-5);
        }
        System.out.print(n + " ");
        return  n;
    }
    static int recFunc2(int m, int n )
    {
        if (m != n) {
            System.out.print( m + " " );
            return recFunc2(m + 5, n);
        }
        System.out.print(m);
        return m;
   }
}