package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] Trial = {1,2,3,4,6,7,6,5,4,3,44,3,4,34,3,43,4,4,4,49,4,43,678,67,8,34567,8,4567,78,8,8,9,4567,9,678,98,99,34567,9,9,9,999,};
    BSort(Trial);
    }

    public static void BSort(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {


            for (int i = 0; i < arr.length-j-1; i++) {
                if (arr[i] > arr[i+1]) {
                    Swap(arr, i, i+1);
                }

            }
        }
        print(arr);

    }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }

    public static void Swap(int[] arr,int x,int y) {
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y]= temp;

    }
}
