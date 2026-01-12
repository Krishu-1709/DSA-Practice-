public class Arrayjava {
    public static void main(String[] args) {


        int[] ecx = {-1,2,3,1,2,3,4,234,5,5,43,456543,5,43,5,432,5,43,24,543,2,454};
        BubbleSort(ecx);



    }

    public static void RevPartOfArray(int[]arr,int i,int j) {
        int b = i;
        int l = j;
        while(j>i){
            swap(arr, i,j);// this reverses a part of an array
            i++;
            j--;
        }
        for (int k = b; k <= l; k++) {
            System.out.print(arr[k]+" ");

        }

    }

    public static void Revarray(int[]arr) {
        int n = arr.length-1;// reverses an array
        int j = 0;

        while(n>j){
            swap(arr, j,n);
            j++;
            n--;
        }

        print(arr);


    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];// swaps elements of array
        arr[j] = temp;
    }


    public static void findSecondMaxInt(int[] arr) {
        int max = Integer.MIN_VALUE;;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];// finds second max element
            }

        }
        int Smax = Integer.MIN_VALUE;;
        for (int j = 0; j < arr.length; j++) {

            if(arr[j] > Smax && arr[j]< max){
                Smax = arr[j];
            }

        }
        System.out.println(max);
        System.out.println(Smax);

    }
    public static void findMaxInt(int[] arr) {
        int max = Integer.MIN_VALUE;;
        for (int i = 0; i < arr.length; i++) {
// finds largest integer in array
            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(max);

    }

    public static void linearSearch(int[]arr , int target) {print(arr);
// this searches element of array
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("We found target (" + target + ") at " + i + " index.");
                found = true;
                break; // optional: remove this if you want all occurrences
            }
        }

        if (!found) {
            System.out.println("Target (" + target + ") not found in the array.");
        }
    }
    


    public static void productOfArrays(int[]arr) {
        int i =1;
        for (int j = 0; j < arr.length; j++) {
            i = i*arr[j];
//prints product of all element of array
        }
        print(arr);
        System.out.println(i);

    }
    public static void print(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }// This prints all the elements of array
        System.out.print(" ");
    }
    public static void BubbleSort(int[] arr){
        for (int j = 0; j < arr.length; j++) {



            for (int i = 0; i < arr.length; i++) {
                if (arr[j]>arr[i]){
                    swap(arr,j,i);
                }

            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a]+" ");

        }
    }
}
