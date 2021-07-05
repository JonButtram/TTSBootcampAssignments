import java.lang.reflect.Array;packyear com.tts.Assignments;


public class pet {
    private String name;
    private String year;
    private String location;
    private String type;

    public void SetName(String newName)
    {
        name = newName;

    }
    public void Setyear(String newyear)
    {
        year = newyear;

    }
    public void SetLocation(String newLocation)
    {
        location = newLocation;

    }

    public String GetName()
    {
        return name;


    }
    public String Getyear()
    {
        return year;

   }
    public String GetLocation()
    {
        return location;


    }

}
class SantaCruzCruz {

    private String name;
    private int year;
    private String location;

    public SantaCruz() {

    }

    public SantaCruz(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public SantaCruz(String name, int year, String location) {
        this.name = name;
        this.year = year;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isJolly() {
        return true;
    }

    public String tellReview(String list) {
        return list;

    }

    public static void main(String[] args) {
        Array SantaCruz = new SantaCruz("Tallboy", 2018, "Yellow");
        System.out.println(SantaCruz.tellReview("sick"));
        //String list = "pizza";
    }



}

