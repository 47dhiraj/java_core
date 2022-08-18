package FunctionConcept_11;

public class ReturningValue
{

    public static void main(String[] args)
    {
        int ans = add(5,10);           

        System.out.println("The Addition value = " + ans);
    }


    public static int add (int x, int y)
    {
        int answer = x + y;

        return (answer);
    }

}
