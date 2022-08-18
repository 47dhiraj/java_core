package SwitchStatement_7;

public class SwitchStatement
{
    public static void main(String[] args) {

        int score = 40;

        switch (score)
        {
            case 90:
                System.out.println("Excellent!!");
                break;
            case 60:
                System.out.println("good!");
                break;
            case 40:
                System.out.println("OK!");
                break;
            default:
                System.out.println("Score isn't Defined");
                break;
        }

    }
}
