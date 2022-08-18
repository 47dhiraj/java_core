package FunctionConcept_11;

public class ParameterToMethod
{
    public static void main(String[] args)
    {
        sayHello("Dhiraj Kafle");             

        Add(5,10);                            
    }


    public static void sayHello(String name)
    {
        System.out.println("Hello " + name);
    }


    public static void Add(int x, int y)
    {
        int add = x + y;
        System.out.println("Addition Value = " + add );
    }
}
