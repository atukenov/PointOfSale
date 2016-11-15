/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlmazTukenov
 */
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
