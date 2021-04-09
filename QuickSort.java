package quicksort;

public class QuickSort {
    public static void main(String[] args)
    {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted array:");
        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        quick_sort(intArray, 0, intArray.length);

        System.out.println("Quick sorted array:");

        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }
    public static void quick_sort(int[] input, int start, int end)
    {
        if(end - start < 2)
        {
            return;
        }
        int pivotIndex = partition(input, start, end);
        quick_sort(input, start, pivotIndex);
        quick_sort(input, pivotIndex+1, end);
    }

    public static int partition(int[] input, int start, int end)
    {
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j)
        {
            // Empty loops to find the position of value less than pivot and is on right side
            while(i < j && input[--j] >= pivot);
            if(i < j)
            {
                input[i] = input[j];
            }
            // Empty loops to find the position of value greater than pivot and is on left side
            while(i < j && input[++i] <= pivot);
            if(i < j)
            {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
