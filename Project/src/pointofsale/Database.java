package pointofsale;


import java.util.*;

public class Database {
	List<itemList> db = new ArrayList<itemList>();
	
	public Database() {
		db.add(new itemList(12345, 5, "MacPro", 1299.99));
		db.add(new itemList(25143, 1, "Alienware 17", 1799.99));
		db.add(new itemList(41532, 9, "iPhone 10", 999.00));
	}
	
	public void addItem(int ID, int quantity, String itemName, double price) {
		db.add(new itemList(ID, quantity, itemName, price));
	}
	
	public int removeItem(int ID) {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      if(iterator.next().ID == ID){
	    	  iterator.remove();
	    	  
	    	  // Successfully removed the item.
	    	  return 0;
	      }
	    }
	    
	    // Error ID not found.
            return -1;
	}
	
	public int getQuantity(int ID) {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      itemList iL = iterator.next();
	      
	      if(iL.ID == ID){
	    	  return iL.quantity;
	      }
	    }
	    
	    // Error ID not found.
            return -1;
	}
	
	public int setQuantity(int ID, int quantity) {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      itemList iL = iterator.next();
	      
	      if(iL.ID == ID){
	    	  iL.quantity = quantity;
	    	  
	    	  // Successfully replaced item's quantity.
	    	  return 0;
	      }
	    }
	    
	    // Error ID not found.
	    return -1;
	}
	
	public String getItemName(int ID) {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      itemList iL = iterator.next();
	      
	      if(iL.ID == ID){
	    	  return iL.itemName;
	      }
	    }
	    
	    // Error ID not found.
            return "-1";
	}
	
	public int setItemName(int ID, String itemName) {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      itemList iL = iterator.next();
	      
	      if(iL.ID == ID){
	    	  iL.itemName = itemName;
	    	  
	    	  // Successfully replaced item's name.
	    	  return 0;
	      }
	    }
	    
	    // Error ID not found.
	    return -1;
	}
	
	public double getPrice(int ID) {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      itemList iL = iterator.next();
	      
	      if(iL.ID == ID){
	    	  return iL.price;
	      }
	    }
	    
	    // Error ID not found.
            return -1;
	}
	
	public int setPrice(int ID, double price) {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      itemList iL = iterator.next();
	      
	      if(iL.ID == ID){
	    	  iL.price = price;
	    	  
	    	  // Successfully replaced item's price.
	    	  return 0;
	      }
	    }
	    
	    // Error ID not found.
	    return -1;
	}
	
	public String toString() {
            Iterator<?> iterator = db.iterator();
            String result = "";
		
            while (iterator.hasNext()) {
                result += iterator.next() + "\n";
            }
		
            return result;
	}
	
	private static class itemList {
            int ID;
            int quantity;
            String itemName;
            double price;
		
            itemList (int ID, int quantity, String itemName, double price) {
                this.ID = ID;
		this.quantity = quantity;
		this.itemName = itemName;
		this.price = price;
            }
		
            public String toString() {
		String result = ID + " " + quantity + " " + itemName + " " + price;
		return result;
            }
	}
}