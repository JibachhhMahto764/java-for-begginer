import java.util.Scanner;

public class Inputprogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Roll Number:");
        int rollno = input.nextInt();
        System.out.println("Your Rollno is:" + rollno);
    }

}

