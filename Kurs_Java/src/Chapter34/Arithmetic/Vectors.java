package Chapter34.Arithmetic;

import java.util.Scanner;

public class Vectors implements IArithmetic {
    private final double[] vector;

    public Vectors(){
        Scanner s = new Scanner(System.in);
        int size;

        System.out.print("Enter size: ");
        do {
            while (!s.hasNextInt())
                s.next();
            size = s.nextInt();
        } while (size <= 0);

        vector = new double[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter " + (i + 1) + " vector element: ");
            while (!s.hasNextDouble())
                s.next();
            vector[i] = s.nextDouble();
        }
    }

    public void compareLengthVector(double[] vector){
        System.out.println(this.vector.length == vector.length ?
                "Length is equal!" : "length isn't equal!");
    }

    @Override
    public void add(Object value) {
        double[] vector = (double[]) value;

        try{
            if (this.vector.length != vector.length)
                throw new SizeMismatchExceptionClass();

            for (int i = 0; i < this.vector.length; i++)
                this.vector[i] = this.vector[i] + vector[i];
        } catch (SizeMismatchExceptionClass sme) {
            System.out.println(sme);
        }
    }

    @Override
    public void compare(Object value) {
        double[] vector = (double[]) value;
        boolean isEqual = true;

        try{
            if (this.vector.length != vector.length)
                throw new SizeMismatchExceptionClass();

            for (int i = 0; i < this.vector.length; i++)
                if (this.vector[i] != vector[i]){
                    isEqual = false;
                    break;
                }

            if (isEqual)
                System.out.println("Equals!");
            else
                System.out.println("Is not equals!");
        } catch (SizeMismatchExceptionClass sme) {
            System.out.println(sme);
        }
    }

    public void printVector(){
        for (double v : this.vector) System.out.print(v + " ");
        System.out.println();
    }

    public double[] getVector() {
        return vector;
    }
}