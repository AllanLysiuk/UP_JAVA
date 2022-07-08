import java.util.Scanner;

class Task {
    public static boolean task6(double x, double y) {
        if (y > 4 || y < -3 || x > 4 || x < -4) {
            return false;
        }
        if (y > 0) {
            if (x > 2 || x < -2) {
                return false;
            }
            return true;
        }
        double dist = Math.pow(x,2) + (y + 0.5)*(y+0.5);
        if (dist < 0.25) {
            return false;
        }
        return true;
    }
}

class TaskExecutor {
    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 arguments for task 1");
        int a;
        int b;
        int c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        double answer=((a - 3) * b / 2) + c;
        System.out.println("Task1 answer: "+ answer);
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2 args:");
        double a;
        double b;
        double c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        double answer=(b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b);
        System.out.println("Task2 answer:  " + answer);
    }

    public static void Task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 3 args:");
        double x;
        double y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        double answer=((Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.sin(y)));
        System.out.println("Task 3 answer: "+answer);

    }

    public static void Task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 4 args:");
        Double x;
        x = scanner.nextDouble();
        int a = x.intValue() % 1000;
        double tmp = 1000 * x;
        int b = (int) tmp % 1000;
        double answer = (double) (b + (double) a / 1000);
        System.out.println("Task 4 answer: " + answer);
    }

    public static void Task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 5 args:");
        int t;
        t = scanner.nextInt();
        int hours = t / 3600;
        hours %= 24;
        t %= 3600;
        int minutes = t / 60;
        t %= 60;
        String answer = "";
        if (hours < 10) {
            answer += '0';
        }
        answer += hours + "ч ";
        if (minutes < 10) {
            answer += '0';
        }
        answer += minutes + "мин ";
        if (t < 10) {
            answer += '0';
        }
        answer += t + "с";
        System.out.println("Task 5 answer: " + answer);

    }

    public static void Task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 6 args:");
        double x;
        double y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        System.out.println("Task 6 answer:  "  + Task.task6(x, y));

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
    }
}
