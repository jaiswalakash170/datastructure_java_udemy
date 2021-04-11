package countingsort;

public class CountingSort {
    public static void main(String[] args)
    {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        System.out.println("Unsorted array:");
        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        counting_sort(intArray);

        System.out.println("Counting sorted array:");

        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void counting_sort(int[] input)
    {
        int min = find_min(input);
        int max = find_max(input);

        int[] counting_array = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++)
        {
            counting_array[input[i] - min]++;
        }
        int j = 0;
        for(int i = min; i <= max; i++)
        {
            while(counting_array[i - min] > 0)
            {
                input[j++] = i;
                counting_array[i - min]--;
            }
        }
    }

    public static int find_min(int[] input)
    {
        int min = 0;
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] < min)
            {
                min = input[i];
            }
        }
        return min;
    }

    public static int find_max(int[] input)
    {
        int max = 0;
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] > max)
            {
                max = input[i];
            }
        }
        return max;
    }
}
