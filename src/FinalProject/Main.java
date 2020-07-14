package FinalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        ArrayList<GirlScout> girl;

        do {
            System.out.print("Please enter the name of the girl, or type \"quit\" if you want to exit: ");
            name = input.nextLine();
            if (name.equals("quit")){
                continue;
            }
            System.out.print("Please enter the age of the girl: ");
            age = input.nextInt();

            System.out.print("Please enter the number of Samoas Cookies sold: ");
            System.out.print("Please enter the number of Tagalongs Cookies sold: ");
            System.out.print("Please enter the number of Thin Mint Cookies sold: ");
        } while (!name.equals("quit"));

    }
}
