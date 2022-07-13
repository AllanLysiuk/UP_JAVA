class Tasks{
    public static void task1(int k,int[]a,int b[]){
       int count = 0;

        int[] sum = new int[(a.length+b.length)];
        for (int i = 0; i < sum.length; i++) {
            if (k > i){
                sum[i] = a[i];
            }else if (count < k) {
                sum[i] = b[count];
                count++;
            }else
                sum[i] = a[i - k - 1];
        }
        for (int x : sum){
            System.out.print(x+"|");
        }}
    public static void task2(int[] arr1, int[] arr2) {
        int n = 0;
        int p = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {
            if (n >= arr2.length || p < arr1.length && arr1[p] < arr2[n]) {
                arr3[i] = arr1[p];
                p++;
            } else {
                arr3[i] = arr2[n];
                n++;
            }
        }
    }
    public static void task3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
    public static void task4(int[] array) {
        boolean sorted = false;
        int temp,counter=0;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    counter++;
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.printf("Количество перестановок: %d%n", counter);
    }
    public static void task5(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    public static double[] task6(double[] arr) {
        double temp;
        int i = 0;

        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = i == 0 ? 0 : i - 1;
            }
        }
        return arr;
    }
    public static void task7(int[] arr1, int[] arr2) {

        int[] arr = new int[arr2.length];
        int n;

        for (int j = 0; j < arr2.length; j++) {
            n = binarySearch(arr1, 0, arr1.length - 1, arr2[j]);
            arr[j] = n + j + 1;
        }

        System.out.println("Элементы второго массива надо расположить "
                + "\nна следующих позициях первого массива: ");
            for (int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();

    }
    static int binarySearch(int arr[], int start, int end, int elem) {
        int mid = start + (end - start) / 2;
        if (elem < arr[start]) {
            return -1;
        }
        if (elem > arr[end]) {
            return end;
        }
        if (arr[mid] < elem && elem <= arr[mid + 1]) {
            return mid;
        }
        if (arr[mid] > elem) {
            return binarySearch(arr, start, mid - 1, elem);
        }
        return binarySearch(arr, mid + 1, end, elem);
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
