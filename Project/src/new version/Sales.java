package pointofsale;


public class Sales {
    
    private String name = "";
    private int quantity = 0;
    private int price = 0;
    
    public Sales(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }
    
    @Override
    public String toString()
    {
        return name + "\t" + quantity + "\t";
    }
}