import java.util.Arrays;
import java.util.Random;

class Tasks {
    public static void task1(int[][] a) {
        for (int i = 0; i < a[0].length; ++i) {
            if (i % 2 == 0) {
                if (a[0][i] > a[a.length - 1][i]) {
                    for (int j = 0; j < a.length; ++j) {
                        System.out.print(a[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void task2(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i][i]);
        }
        System.out.println();
    }

    public static void task3(int[][] a, int k, int p) {
        for (int i = 0; i < a[k - 1].length; ++i) {
            System.out.print(a[k - 1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i][p - 1] + " ");
        }
        System.out.println();
    }

    public static int[][] task4(int n) {
        int[][] A = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i % 2 == 0) {
                    A[i][j] = j + 1;
                } else {
                    A[i][j] = n - j;
                }
            }
        }
        return A;
    }

    public static int[][] task5(int n) {
        int[][] A = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i + j <= n - 1) {
                    A[i][j] = i + 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

    public static int[][] task6(int n) {
        int[][] A = new int[n][n];
        for (int i = 0; i < n / 2; ++i) {
            for (int j = i; j < n - i; ++j) {
                A[i][j] = 1;
            }
        }
        for (int i = n - 1; i >= n / 2; --i) {
            for (int j = n - i - 1; j < i + 1; ++j) {
                A[i][j] = 1;
            }
        }
        return A;
    }

    public static double[][] task7(int n) {
        double[][] A = new double[n][n];
        int counter = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                A[i][j] = Math.sin((double) (i * i - j * j) / n);
                if (A[i][j] > 0) {
                    counter++;
                }
            }
        }
        System.out.println("Amount of positive elements: " + counter);
        return A;
    }

    public static void task8(int[][] a, int x, int y) {
        for (int i = 0; i < a[x].length; ++i) {
            int tmp = a[i][x];
            a[i][x] = a[i][y];
            a[i][y] = tmp;
        }
    }
}

public class Main {
    public static void main(String args[]){

    }
}