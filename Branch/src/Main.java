import java.util.Scanner;

class Task {
    public static String task1(int x, int y) {
        String ans = "";
        if (x + y >= 180 || x <= 0 || x <= 0) {
            ans = "No";
            return ans;
        }
        ans += "Yes ";
        if (x + y == 90 || x == 90 || y == 90) {
            ans += "rectangular";
        } else {
            ans += "non-rectangular";
        }
        return ans;
    }

    public static boolean task3(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 == x2 || x1 == x3 || x2 == x3 || y1 == y2 || y1 == y3 || y2 == y3) {
            if ((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
                return true;
            }
            return false;
        }
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            return true;
        }
        return false;
    }
}

class TaskExecutor {
    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1 args: ");
        int x;
        int y;
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("Task 1 answer " + Task.task1(x, y));
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2 args:");
        int a;
        int b;
        int c;
        int d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        int tmp1 = a;
        if (b < tmp1) {
            tmp1 = b;
        }
        int tmp2 = c;
        if (d < tmp2) {
            tmp2 = d;
        }
        int answer = Math.max(tmp1, tmp2);

        System.out.println("Task2 answer:  " + answer);
    }

    public static void Task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 3 args:");
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        System.out.println("Task 3 answer: " + Task.task3(x1, y1, x2, y2, x3, y3));

    }

    public static void Task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 4 args:");
        int a;
        int b;
        int x;
        int y;
        int z;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        boolean flag = false;
        int min1 = a;
        int max1 = b;
        if (b < min1) {
            min1 = b;
            max1 = a;
        }
        int min2 = x;
        int min3 = y;
        if (y >= z && y >= x) {
            min3 = z;
        } else {
            min2 = z;
        }
        if (min2 > min3) {
            int tmp = min2;
            min2 = min3;
            min3 = tmp;
        }
        if (min2 <= min1 && min3 <= max1) {
            flag = true;
        }
        System.out.println("Task 4 answer: " + flag);
    }

    public static void Task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 5 args:");
        double x, answer;
        x = scanner.nextDouble();
        if (x <= 3) {
            answer = x * x - 3 * x + 9;
        } else {
            answer = 1. / (x * x * x + 6);
        }
        System.out.println("Task 5 answer: " + answer);

    }

}

public class Main {
    public static void main(String args[]) {
        TaskExecutor.Task1();
        TaskExecutor.Task2();
        TaskExecutor.Task3();
        TaskExecutor.Task4();
        TaskExecutor.Task5();
    }
}

