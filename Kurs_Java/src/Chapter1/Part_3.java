package Chapter1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.StrictMath.*;

public class Part_3 {
    public static void solve_21(int seconds){
        if (seconds >= 0 && seconds <= 28800){
            int hours = seconds / 3600;

            if (hours >= 1){
                if (hours > 2)
                    System.out.printf("%d\n%d hours left\n", seconds, hours);
                else
                    System.out.printf("%d\n%d hour left\n", seconds, hours);
            }
            else
                System.out.printf("%d\nLess than hour left\n", seconds);
        }
    }

    public static void solve_22(){
        int[] a = new int[8];

        for (int i = 0; i < a.length; i++){
            if (i % 2 == 0)
                a[i] = 1 + (int)(random() * 10);

            System.out.print(a[i] + "\t");
        }

        System.out.println();
    }

    public static void solve_23(){
        final int size = 5;
        int[] a = new int[size];
        int[] b = new int[size];
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < a.length; i++){
            a[i] = (int)(random() * 6);
            b[i] = (int)(random() * 6);
        }

        for (int i = 0; i < size; i++){
            sum1 += a[i];
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < size; i++){
            sum2 += b[i];
            System.out.print(b[i] + "\t");
        }
        System.out.println();

        if (sum1 > sum2)
            System.out.println("First average!");
        else if (sum1 == sum2)
            System.out.println("Both averages!");
        else
            System.out.println("Second average!");
    }

    public static void solve_24(){
        final int size = 4;
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++){
            a[i] = (int)(random() * 90) + 10;
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        if (a[0] < a[1] && a[1] < a[2] && a[2] < a[3])
            System.out.println("Yes, array is increase!");
        else
            System.out.println("No, array isn't increase!");
    }

    public static void solve_25(){
        int[] fib = new int[20];
        fib[0] = 1;
        fib[1] = 1;
        System.out.print(fib[0] + " ");
        System.out.print(fib[1] + " ");

        for (int i = 2; i < fib.length; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }

    public static void solve_26(){
        final int size = 12;
        int[] a = new int[size];
        int max, maxI;

        for (int i = 0; i < a.length; i++){
            a[i] = (int)(random() * 31) - 15;
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        max = a[0];
        maxI = 0;
        for (int i = 0; i < a.length; i++)
            if (max < a[i]){
                max = a[i];
                maxI = i;
            }

        System.out.printf("Max value: %d, index: %d\n", max, maxI);
    }

    public static void solve_27(){
        final int size = 10;
        int[] a = new int[size];
        int[] b = new int[size];
        float[] c = new float[size];
        int countInt = 0;

        for (int i = 0; i < size; i++){
            a[i] = 1 + (int)(random() * 9);
            b[i] = 1 + (int)(random() * 9);
            c[i] = (float)a[i] / b[i];

            if (c[i] - (int)c[i] == 0)
                countInt++;
        }

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + "\t");
        System.out.println();

        for (int i = 0; i < size; i++)
            System.out.print(b[i] + "\t");
        System.out.println();

        for (int i = 0; i < size; i++)
            System.out.print(c[i] + "\t");
        System.out.println();

        System.out.printf("Count of integer numbers: %d\n", countInt);
    }

    public static void solve_28(){
        final int size = 11;
        int[] a = new int[size];
        int n_one = 0, zero = 0, p_one = 0, max;

        for (int i = 0; i < size; i++){
            a[i] = (int)(random() * 3) - 1;
            System.out.print(a[i] + "\t");

            if (a[i] == -1) n_one++;
            else if (a[i] == 0) zero++;
            else p_one++;
        }
        System.out.println();

        max = max(max(n_one, zero), p_one);

        if (n_one != zero && zero != p_one){
            if (n_one == max)
                System.out.println("More frequent: -1");
            else if (zero == max)
                System.out.println("More frequent:  0");
            else
                System.out.println("More frequent: +1");
        }
    }

    public static void solve_29(){
        Scanner s = new Scanner(System.in);
        int size, sum1 = 0, sum2 = 0;

        do {
            System.out.print("Enter even positive number: ");
            while (!s.hasNextInt())
                s.next();
            size = s.nextInt();
        } while (size <= 0 || size % 2 != 0);

        int[] a = new int[size];

        for (int i = 0; i < size; i++){
            a[i] = (int)(random() * 11) - 5;
            System.out.print(a[i] + "\t");

            if (i < size / 2)
                sum1 += abs(a[i]);
            else
                sum2 += abs(a[i]);
        }
        System.out.println();

        String message = sum1 > sum2 ? "Left!" : sum1 == sum2 ? "Both equals!" : "Right!";
        System.out.printf("%s\n", message);
    }

    public static void solve_30(){
        final int size = 12;
        int[] a = new int[size];
        int[] neg = new int[size / 2], pos = new int[size / 2];

        for (int i = 0; i < size / 2; i++){
            neg[i] = -(1 + (int)(random() * 10));
            pos[i] = 1 + (int)(random() * 10);
        }

        for (int i = 0, j = size / 2; i < size / 2 && j < size; i++, j++){
            a[i] = neg[i];
            a[j] = pos[i];
        }

        List<Integer> list = Arrays.asList(Arrays.stream(a).boxed().toArray(Integer[]::new));
        Collections.shuffle(list);

        for (var i : list) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }
}