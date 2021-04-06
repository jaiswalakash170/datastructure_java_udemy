package selectionsort;

public class SelectionSort {

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

        selection_sort1(intArray);

        System.out.println("Selection sorted array:");

        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void selection_sort1(int[] arr)
    {

        int len = arr.length;

        for(int i = 0; i < len-1; i++)
        {
            int max = len-i-1;
            for(int j = 0; j < len-i-1; j++)
            {
                if(arr[j] > arr[max])
                {
                    max = j;
                }
            }
            swap(arr, len-i-1, max);
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        if(i == j)
        {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
