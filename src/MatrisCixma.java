public class MatrisCixma {

    static int[][] cix(int[][] A, int[][] B) {
        int setir = A.length, sutun = A[0].length;
        int[][] netice = new int[setir][sutun];
        for (int i = 0; i < setir; i++)
            for (int j = 0; j < sutun; j++)
                netice[i][j] = A[i][j] - B[i][j];
        return netice;
    }

    static void matrisiYaz(int[][] M) {
        for (int[] setir : M) {
            for (int x : setir) System.out.print(x + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] B = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        System.out.println("A - B:");
        matrisiYaz(cix(A, B));
    }
}