import java.math.BigInteger;
import java.util.Scanner;

class Task {
    public static boolean[] task8(int x) {
        boolean num[] = new boolean[10];
        for (int i = 0; i < 10; i++) {
            num[i] = false;
        }
        if (x == 0) {
            num[0] = true;
        }
        while (x > 0) {
            num[x % 10] = true;
            x /= 10;
        }
        return num;
    }
}

class TaskExecutor {
    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1 args: ");
        int x;
        x = scanner.nextInt();
        int answer = 0;
        for (int i = 1; i <= x; i++) {
            answer += i;
        }
        System.out.println("Task 1 answer " + answer);
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2 args:");
        double a;
        double b;
        double h;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        h = scanner.nextDouble();
        String answer = "";
        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                answer += i + " ";
            } else {
                answer += -i + " ";
            }
        }
        System.out.println("Task2 answer:  " + answer);
    }

    public static void Task3() {
        int answer = 0;
        for (int i = 1; i <= 100; i++) {
            answer += i * i;
        }
        System.out.println("Task 3 answer: " + answer);
    }

    public static void Task4() {
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }

        System.out.println("Task 4 answer: " + s);
    }

    public static void Task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 5 args:");
        double eps;
        eps = scanner.nextDouble();
        double answer = 0;
        double power2 = 1. / 2;
        double power3 = 1. / 3;
        while (power2 + power3 >= eps) {
            answer += power2 + power3;
            power2 /= 2;
            power3 /= 3;
        }
        System.out.println("Task 5 answer: " + answer);

    }

    public static void Task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 6 args:");
        String answer = "";
        for (int i = 1; i < 111; i++) {
            answer += i + " " + (char) i + '\n';
        }
        System.out.println("Task 6 answer: " + answer);
    }

    public static void Task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 7 args:");
        int m;
        int n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        String answer = "";
        for (int i = m; i <= n; ++i) {
            answer += "(" + i + ") ";
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    answer += j + " ";
                }
            }
            answer += "\n";
        }
        System.out.println("Task 7 answer: " + answer);
    }

    public static void Task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 8 args:");
        int m;
        int n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        String answer = "";
        boolean ans1[] = Task.task8(m);
        boolean ans2[] = Task.task8(n);
        for (int i = 0; i < 10; ++i) {
            if (ans1[i] && ans2[i]) {
                answer += i + " ";
            }
        }
        System.out.println("Task 8 answer: " + answer);
    }
}

public class Main {
    public static void main(String args[]) {
        TaskExecutor.Task1();
        TaskExecutor.Task2();
        TaskExecutor.Task3();
        TaskExecutor.Task4();
        TaskExecutor.Task5();
        TaskExecutor.Task6();
        TaskExecutor.Task7();
        TaskExecutor.Task8();
    }
}

