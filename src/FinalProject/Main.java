package FinalProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

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
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Create an ArrayList
        ArrayList<GirlScout> girls = new ArrayList<>();;


        // Explanation
        System.out.println("This program allows the user to input Girl Scouts\n" +
                "names, ages, and cookies sold, and tells them if they have\n" +
                "sold enough boxes to earn a reward, and what that reward is.\n" +
                "It saves the information to a file, and displays it at the end.\n");

        /**
         * REQUESTING USER INPUT & DISPLAY AN ERROR IF ITS NOT WITHIN THE RANGES
         * AND REPROMPT.
         */
        do {
            System.out.println("Please enter the name of the girl, \n" +
                    "or type \"quit\" if you want to exit: ");
            name = input.nextLine();
            if (name.equals("quit")){
                continue;
            }

            System.out.print("Please enter the age of the girl: ");
            age = input.nextInt();
            System.out.println();
            input.nextLine()
            /**
             * ASSIGN TO PROPER TROOP BASED ON AGE
             */
            if (age >= DAISIES_MIN_AGE && age <= DAISIES_MAX_AGE){
                girls.add(new Daisies(name, age, "Daisies"));
            } else if (age >= BROWNIES_MIN_AGE && age <= BROWNIES_MAX_AGE){
                girls.add(new Brownies(name, age, "Brownies"));
            } else if (age >= JUNIORS_MIN_AGE && age <= JUNIORS_MAX_AGE){
                girls.add(new Juniors(name, age, "Juniors"));
            } else if (age >= CADETTES_MIN_AGE && age <= CADETTES_MAX_AGE){
                girls.add(new Cadettes(name, age, "Cadettes"));
            } else if (age >= SENIORS_MIN_AGE && age <= SENIORS_MAX_AGE){
                girls.add(new Seniors(name, age, "Seniors"));
            } else if (age >= AMBASSADORS_MIN_AGE && age <= AMBASSADORS_MAX_AGE){
                girls.add(new Ambassadors(name, age, "Ambassadors"));
            } else {
                System.out.println("Error: Age must be between 6 - 18.");
            }

        } while (!name.equals("quit"));
        try {
            File girlsFile = new File("cookieSales.txt");
            if (girlsFile.createNewFile()) {
                System.out.println("File created: " + girlsFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        /**
         * STEP 1: REQUEST NUMBER OF COOKIES FOR EACH GIRL
         * STEP 2: WRITE TO FILE
         */
        // Write File Header
        try (FileWriter header = new FileWriter("cookieSales.txt", true) ) {
                header.write("Name | Troop | Samoas | Tagalongs | Thin Mints | Total | Activity");
                header.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        // Write girl scout data file
        for (int i = 0; i < girls.size(); i++){
            System.out.print("Please enter the number of Samoas Cookies sold by " + girls.get(i).getName() + ": ");
            girls.get(i).setSamoasSold(input.nextInt());
            System.out.print("Please enter the number of Tagalongs Cookies sold by " + girls.get(i).getName() + ": ");
            girls.get(i).setTagalongsSold(input.nextInt());
            System.out.print("Please enter the number of Thin Mint Cookies sold by " + girls.get(i).getName() + ": ");
            girls.get(i).setThinMintsSold(input.nextInt());
            try (FileWriter save = new FileWriter("cookieSales.txt", true) ) {
                save.write(girls.get(i).getName() + " | " + girls.get(i).getTroop() + " | " + girls.get(i).getSamoasSold() + " | " + girls.get(i).getTagalongsSold() + " | " + girls.get(i).getThinMintsSold() + " | " + girls.get(i).calculateTotalCookiesSold() + " | " + girls.get(i).getReward());
                save.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        // open the file, display error msg if it cant be opened and terminate prog.
        try {
            //Create a scanner to read the file
            Scanner readFile = new Scanner("cookieSales.txt");

            // read the file and sum the values as the data is read in, display an
            // error msg if there is an error reading and terminate prog.
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine().trim();
                System.out.println(line);
            }
        } catch (Exception ex2) {
            System.out.println("An error occurred.");
            System.exit(1);
        }


    }
}
