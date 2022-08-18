package StringConcept_10;

public class StringConcept
{
    public static void main(String[] args) {

        String myString = "Hello, it's me Agent 47 from Nawalpur, Kawasoti.";
        System.out.println(myString);

        int myStringLength = myString.length();
        System.out.println(myStringLength);

        String myStringLowerCase = myString.toLowerCase();
        System.out.println(myStringLowerCase);

        String myStringUpperCase = myString.toUpperCase();
        System.out.println(myStringUpperCase);

        System.out.println(myString.replace('A', 'H'));

        System.out.println(myString.indexOf('g'));

    }
}
