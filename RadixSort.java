package radixsort;

public class RadixSort {
    public static void main(String[] args)
    {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};

        System.out.println("Unsorted array:");
        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        radix_sort(intArray, 10, 4);

        System.out.println("Radix sorted array:");

        for (int i = 0; i < intArray.length ; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void radix_sort(int[] input, int radix, int width)
    {
        for(int i = 0; i < width; i++)
        {
            radix_single_sort(input, i, radix);
        }
    }

    public static void radix_single_sort(int[] input, int position, int radix)
    {
        int len = input.length;
        int[] counting_array = new int[radix];

        for(int value : input)
        {
            counting_array[get_digit(value, position, radix)]++;
        }

        for(int j = 1; j < radix; j++)
        {
            counting_array[j] += counting_array[j-1];
        }

        int[] temp = new int[len];
        for(int tmpIndex = len - 1; tmpIndex >= 0; tmpIndex--)
        {
            temp[--counting_array[get_digit(input[tmpIndex], position, radix)]] = input[tmpIndex];
        }

        for(int tmpIndex = 0; tmpIndex < len; tmpIndex++)
        {
            input[tmpIndex] = temp[tmpIndex];
        }
    }

    public static int get_digit(int value, int position, int radix)
    {
        return value / (int) Math.pow(10, position) % radix;
    }
}
