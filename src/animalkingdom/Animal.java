package animalkingdom;

public abstract class Animal
{
    //fields
    private static int maxId = 0; 
    private int id;
    private String name;
    private int yearDiscovered;

    //constructor
    public Animal(String name, int yearDiscovered)
    {
        this.id = maxId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    //method 
    public String consume() 
    {
        return "eat";
    }

    //methods that vary by animal type
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    
}