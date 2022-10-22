import java.util.Scanner;

public class Username {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name: ");
        String str=s.nextLine();
        System.out.println("Welcome "+str);
    }

}
