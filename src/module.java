public class module
{
   private String name; // name of field of module
   private int capacity; // capacity

    public module(String aName, int capacity)
    {
        this.name = aName;
        this.capacity = capacity;
    }

    public String getName()
    {
        return this.name;
    }

    public int getCapacity()
    {
        return this.capacity;
    }


}
