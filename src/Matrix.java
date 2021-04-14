import java.util.Random;

public class Matrix {
    int[][] m;

    Matrix(int p1, int p2) {
        m = new int[p1][p2];
        Random r = new Random();
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = r.nextInt(1000);
            }
        }
    }

    public void getMatrix(int p1, int p2) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.print('\n');
        }
    }

    public int [] getRow(int ind) {
        return m[ind];
    }
}