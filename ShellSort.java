package shellsort;

public class ShellSort {
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

        shell_sort(intArray);

        System.out.println("Shell sorted array:");

        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void shell_sort(int[] arr)
    {
        int len = arr.length;
        int gap = len/2;

        for(; gap > 0; gap = gap/2)
        {
            for(int i = gap; i < len; i++)
            {
                int element = arr[i];
                int j = i;
                for(; j >= gap && arr[j - gap] > element; j -= gap)
                {
                    arr[j] = arr[j - gap];
                }
                arr[j] = element;
            }
        }
    }
}
