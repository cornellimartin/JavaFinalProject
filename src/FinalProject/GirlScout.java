package FinalProject;

public class GirlScout {

    // ***********  DECLARE VARIABLES  ***********
    private String name = "none";
    private int age = 6;
    private int samoasSold = 0;
    private int tagalongsSold = 0;
    private int thinMintsSold = 0;
    private final int totalCookiesSold = 0;
    protected boolean qualified;
    protected String troop = "none";


    // ***********  CONSTRUCTORS  ***********
    /** Construct a default GirlScout object */
    public GirlScout() {
    }

    /** Construct a GirlScout object with the specified variables. */
    public GirlScout(String name, int age, String troop) {
        this.name = name;
        this.age = age;
        this.troop = troop;
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

    /** Get Troop */
    public String getTroop() {
        return troop;
    }

    /** Set Troop */
    public void setTroop(String troop) {
        this.troop = troop;
    }
    // ***********  OTHER METHODS  ***********
    /** Calculate and return the total amount of boxes sold */
    public int calculateTotalCookiesSold() {
        return samoasSold + tagalongsSold + thinMintsSold;
    }

    /** Return REWARD */
    public String getReward() {
        return "You've earned a reward!";
    }
}
