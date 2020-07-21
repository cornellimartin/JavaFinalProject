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
        int samoas;
        int tagalongs;
        int thinMints;
        int counter = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Create an ArrayList
        ArrayList<GirlScout> girls = new ArrayList<>();


        // Explanation
        System.out.println("This program allows the user to input Girl Scouts names, ages, and\n" +
                "cookies sold, and tells them if they have sold enough boxes to earn a reward,\n" +
                "and what that reward is.\nIt saves the information to a file, and displays it at the end.\n");

        /**
         * STEP 1: USER INFO
         * REQUESTING USER INPUT & DISPLAY AN ERROR IF ITS NOT WITHIN THE RANGES
         * AND RE-PROMPT.
         */

        do {
            System.out.print("Please enter the name of the girl \n" +
                    "or type \"quit\" if you want to exit: ");
            name = input.nextLine();
            if (name.equals("quit")) {
                continue;
            }

            System.out.print("Please enter the age of the girl: ");
            age = input.nextInt();
            input.nextLine();

            /**
             * ASSIGN TO PROPER TROOP BASED ON AGE
             */
            if (age >= DAISIES_MIN_AGE && age <= DAISIES_MAX_AGE) {
                girls.add(new Daisies(name, age, "Daisies"));
            } else if (age >= BROWNIES_MIN_AGE && age <= BROWNIES_MAX_AGE) {
                girls.add(new Brownies(name, age, "Brownies"));
            } else if (age >= JUNIORS_MIN_AGE && age <= JUNIORS_MAX_AGE) {
                girls.add(new Juniors(name, age, "Juniors"));
            } else if (age >= CADETTES_MIN_AGE && age <= CADETTES_MAX_AGE) {
                girls.add(new Cadettes(name, age, "Cadettes"));
            } else if (age >= SENIORS_MIN_AGE && age <= SENIORS_MAX_AGE) {
                girls.add(new Seniors(name, age, "Seniors"));
            } else if (age >= AMBASSADORS_MIN_AGE && age <= AMBASSADORS_MAX_AGE) {
                girls.add(new Ambassadors(name, age, "Ambassadors"));
            } else {
                System.out.println("Error: Age must be between 6 - 18.\n");
                continue;
            }

            System.out.print("Please enter the number of Samoas Cookies sold by " + name + ": ");
            samoas = input.nextInt();
            System.out.print("Please enter the number of Tagalongs Cookies sold by " + name + ": ");
            tagalongs = input.nextInt();
            System.out.print("Please enter the number of Thin Mints Cookies sold by " + name + ": ");
            thinMints = input.nextInt();
            System.out.println();
            input.nextLine();

            girls.get(counter).setSamoasSold(samoas);
            girls.get(counter).setTagalongsSold(tagalongs);
            girls.get(counter).setThinMintsSold(thinMints);
            girls.get(counter).setQualified();
            counter++;

        } while (!name.equals("quit"));


        /** STEP 2: WRITE TO FILE */
        // Open or create file
        File girlsFile = new File("cookieSales.txt");
        try {
            if (girlsFile.createNewFile()) {
                System.out.println("File created: " + girlsFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Write girl scout data to file
        try {
            FileWriter save = new FileWriter(girlsFile, true);
            // Write File Header
            String headerLine = String.format("%-20s | %-15s | %-6s | %-9s | %-10s | %-5s | %-20s %n" +
                            "---------------------------------------------------------------------------------" +
                            "----------------------%n","NAME", "TROOP", "SAMOAS", "TAGALONGS", "THIN MINTS",
                            "TOTAL","ACTIVITY");
            save.write(headerLine);

            // Write user input data
            for (int i = 0; i < girls.size(); i++) {
                String girl_data = String.format("%-20s | %-15s | %-6s | %-9s | %-10s | %-5s | %-20s %n",
                        girls.get(i).getName(), girls.get(i).getTroop(), girls.get(i).getSamoasSold(),
                        girls.get(i).getTagalongsSold(), girls.get(i).getThinMintsSold(),
                        girls.get(i).calculateTotalCookiesSold(), girls.get(i).getReward());
                save.write(girl_data);
            }
            save.write("\n\n");
            save.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        /** STEP 3: READ FROM THE FILE AND DISPLAY */
        // open the file, display error msg if it cant be opened and terminate prog.
        try {
            //Create a scanner to read the file
            Scanner readFile = new Scanner(girlsFile);

            // read the file, display an error msg
            // if there is an error reading and terminate prog.
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine().trim();
                System.out.print(line + "\n");
            }
        } catch (IOException ex2) {
            System.out.println("An error occurred.");
            System.exit(1);
        }
    }
}
