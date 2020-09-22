package adder;

public class Main {

    public static void main(String[] args) {
        try
        {
            int result = addArguments(args);
            System.out.println(result);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("There are not enough arguments in this array");
        }
        catch (NumberFormatException e)
        {
            System.err.println("It is an invalid argument");
        }
    }
    private static int addArguments(String[] args) {
        int sumVal = 0;
        for(int i = 0; i < args.length; i++)
        {
            sumVal = sumVal + Integer.valueOf(args[i]);
        }
        return sumVal;
    }
}
