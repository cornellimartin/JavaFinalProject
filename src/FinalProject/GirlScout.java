package FinalProject;

public class GirlScout {

    // ***********  DECLARE VARIABLES  ***********
    private String name = "none";
    private int age = 6;
    private int samoasSold = 0;
    private int tagalongsSold = 0;
    private int thinMintsSold = 0;
    private int totalCookiesSold = 0;
    private boolean qualified;
    private String reward = "a candybar";


    // ***********  CONSTRUCTORS  ***********
    /** Construct a default GirlScout object */
    public GirlScout() {
    }

    /** Construct a GirlScout object with the specified variables. */
    public GirlScout(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // ***********  GETTERS AND SETTERS  ************
    /** Return NAME */
    public String getName() {
        return name;
    }

    /** Set a new NAME */
    public void setName(String name) {
        this.name = name;
    }

    /** Return AGE. */
    public int getAge() {
        return age;
    }

    /** Set a new AGE */
    public void setAge(int age) {

        this.age = age;
    }

    /** Return SAMOAS SOLD. */
    public int getSamoasSold() {
        return samoasSold;
    }

    /** Set new SAMOAS SOLD. */
    public void setSamoasSold(int samoasSold) {
        this.samoasSold = samoasSold;
    }

    /** Return TAGALONGS SOLD. */
    public int getTagalongsSold() {
        return tagalongsSold;
    }

    /** Set new TAGALONGS SOLD. */
    public void setTagalongsSold(int tagalongsSold) {
        this.tagalongsSold = tagalongsSold;
    }

    /** Return THIN MINTS SOLD. */
    public int getThinMintsSold() {
        return thinMintsSold;
    }

    /** Set new THIN MINTS SOLD. */
    public void setThinMintsSold(int thinMintsSold) {
        this.thinMintsSold = thinMintsSold;
    }

    /** Return QUALIFIED. */
    public boolean isQualified() {
        return qualified;
    }

    /** Set a new QUALIFIED */
    public void setQualified(boolean qualified) {
        this.qualified = qualified;
    }


    // ***********  OTHER METHODS  ***********
    /** Calculate and return the total amount of boxes sold */
    public int calculateTotalCookiesSold() {
        return totalCookiesSold;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "A STRING";
    }

    /** Return REWARD */
    public String getReward() {
        return reward;
    }

}
