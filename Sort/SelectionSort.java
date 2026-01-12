package Sort;

public class SelectionSort {
    public static void main(String[] args) {
int[] axc = {1,2,3,4,5,-1,444,1};
SSort(axc);
print(axc);
    }

    public static void SSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1+i; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    Swap(arr, j,i);
                }

            }


        }
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
