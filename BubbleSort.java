package bubblesort;

public class BubbleSort {
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

        bubble_sort1(intArray);
        //bubble_sort2(intArray);

        System.out.println("Sorted array:");

        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }
    public static void bubble_sort1(int[] arr)
    {
        int len = arr.length;
        if(len == 0)
        {
            return;
        }
        for(int i = len-1; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void bubble_sort2(int[] arr)
    {
        int len = arr.length;
        if(len == 0)
        {
            return;
        }
        for(int i = 0; i < len-1; i++)
        {
            for(int j = 0; j < len-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        if(i == j)
        {
            return;
        }
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
