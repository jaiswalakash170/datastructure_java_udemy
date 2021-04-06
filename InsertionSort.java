package insertionsort;

public class InsertionSort {

    public static void main(String[] args)
    {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        System.out.println("Unsorted array:");
        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        insertion_sort1(intArray);

        System.out.println("Insertion sorted array:");

        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void insertion_sort1(int[] arr)
    {
        int len = arr.length;

        for(int i = 1; i < len; i++)
        {
            int newElement = arr[i];
            int j = i-1;
            for(; j >= 0 && arr[j] > newElement; j--)
            {
                arr[j+1] = arr[j];
            }
            arr[j+1] = newElement;
        }
    }
}
