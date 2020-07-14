package FinalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * CONSTANT VARIABLES
         * GIRLS' AGE RANGES BY TROOP
         */
        final int DAISIES_MIN_AGE = 6;
        final int DAISIES_MAX_AGE = 7;
        final int BROWNIES_MIN_AGE = 8;
        final int BROWNIES_MAX_AGE = 9;
        final int JUNIORS_MIN_AGE = 10;
        final int JUNIORS_MAX_AGE = 11;
        final int CADETTES_MIN_AGE = 12;
        final int CADETTES_MAX_AGE = 13;
        final int SENIORS_MIN_AGE = 14;
        final int SENIORS_MAX_AGE = 15;
        final int AMBASSADORS_MIN_AGE = 16;
        final int AMBASSADORS_MAX_AGE = 18;

        /**
         * LOCAL VARIABLES DECLARATIONS
         */
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        ArrayList<GirlScout> girls = new ArrayList<>();;

        /**
         * REQUESTING USER INPUT
         */
        do {
            System.out.print("Please enter the name of the girl, or type \"quit\" if you want to exit: ");
            name = input.nextLine();
            if (name.equals("quit")){
                continue;
            }
            System.out.print("Please enter the age of the girl: ");
            age = input.nextInt();
            if (age >= DAISIES_MIN_AGE && age <= DAISIES_MAX_AGE){
                girls.add(new Daisies());
            }else if (age >= BROWNIES_MIN_AGE && age <= BROWNIES_MAX_AGE){

            }
            else if (age >= JUNIORS_MIN_AGE && age <= JUNIORS_MAX_AGE){

            }else if (age >= CADETTES_MIN_AGE && age <= CADETTES_MAX_AGE){

            }else if (age >= SENIORS_MIN_AGE && age <= SENIORS_MAX_AGE){

            }else if (age >= AMBASSADORS_MIN_AGE && age <= AMBASSADORS_MAX_AGE){

            }

            System.out.print("Please enter the number of Samoas Cookies sold: ");
            System.out.print("Please enter the number of Tagalongs Cookies sold: ");
            System.out.print("Please enter the number of Thin Mint Cookies sold: ");
        } while (!name.equals("quit"));

    }
}
