package ExceptionalHandling_12;

public class ExceptionHandling
{
    public static void main(String[] args)
    {

        try
        {
            int a = 10/0;

            int b[] = new int[2];
            System.out.println(b[3]);

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e)   
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("----------------------------");
        }

    }
}
