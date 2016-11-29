/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

import javax.swing.JTable;

/**
 *
 * @author AlmazTukenov
 */
public class Base {
    
    public static Database db;
    
    public static void main(String[] args)
    {
        db = new Database();
        MainPage.main(null);
    }
}
