package factorial;

public class Factorial {
    public static void main(String[] args)
    {
        int num = 4;
        System.out.println("Factorial of : " + num + " is - " + factorial(num));
        num = 5;
        System.out.println("Factorial of : " + num + " is - " + factorial(num));
        num = 6;
        System.out.println("Factorial of : " + num + " is - " + factorial(num));
    }
    public static int factorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
