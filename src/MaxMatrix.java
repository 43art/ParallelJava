// TODO: прописать логику разброса строк по потокам

import java.util.*;

public class MaxMatrix {

    public static void main(String [] args) {

        Scanner sr = new Scanner(System.in);
//        int n = sr.nextInt();
//        int m = sr.nextInt();
//        int ct = sr.nextInt();

        Matrix matrix = new Matrix(5, 5);
        Thread1[] myThread = new Thread1[5];

        matrix.getMatrix(5, 5);
        int max = 0;
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new Thread1(matrix.getRow(i), i);
        }

        for (int i = 0; i < myThread.length; i++) {
            try {
                myThread[i].getThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Thread1 myThread1: myThread) {
            System.out.print(myThread1.getMax() + " ");
            if (myThread1.getMax() > max) {
                max = myThread1.getMax();
            }
        }
        System.out.print("\n" + max);
    }
}