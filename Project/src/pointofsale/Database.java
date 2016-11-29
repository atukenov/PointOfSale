package pointofsale;


import java.util.*;

public class Database {
	List<itemList> db = new ArrayList<itemList>();
	
        public String sorting_type = "id";
        
        
	public Database() {
		db.add(new itemList(12345, 5, "MacPro", 1299.99));
		db.add(new itemList(25143, 1, "Alienware 17", 1799.99));
		db.add(new itemList(41532, 9, "iPhone 10", 999.00));
                Sort();
	}
	
	public void addItem(int ID, String itemName, int quantity, double price) {
            if (quantity < 1 || price <= 0.0 || ID <= 9999)
                return;
            db.add(new itemList(ID, quantity, itemName, price));
                //Sort();
                
	}
        
        public void Sort() {
            Collections.sort(db, new Comparator<itemList>(){
                public int compare(itemList o1, itemList o2){
                    if (sorting_type == "id") {
                        if(o1.ID == o2.ID)
                            return 0;
                        return o1.ID < o2.ID ? -1 : 1;
                    }
                    if (sorting_type == "name") {
                        if(o1.itemName == o2.itemName)
                            return 0;
                        return o1.itemName.compareTo(o2.itemName);
                    }
                    if (sorting_type == "quantity") {
                        if(o1.quantity == o2.quantity)
                            return 0;
                        return o1.quantity < o2.quantity ? -1 : 1;
                    }
                    if (sorting_type == "price") {
                        if(o1.price == o2.price)
                            return 0;
                        return o1.price < o2.price ? -1 : 1;
                    }
                    return 0;
                }
            });
            System.out.println(db);
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
	
        public void decreaseQuantity(int ID, int quantity)
        {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      itemList iL = iterator.next();
	      
	      if(iL.ID == ID){
                  iL.quantity -= quantity;
	      }
	    }
        }
        
        public ArrayList<Integer> getList()
        {
            ArrayList<Integer> list = new ArrayList<>();
            Iterator <itemList> it = db.iterator();
            
            while (it.hasNext())
            {
                itemList number = it.next();
                int id = number.ID;
                list.add(id);
            }
            return list;
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
        
        public int getID(String name) {
            Iterator<itemList> iterator = db.iterator();

	    while (iterator.hasNext()) {
	      itemList iL = iterator.next();
	      
	      if(iL.itemName.equals(name)){
	    	  return iL.ID;
	      }
	    }
	    
	    // Error ID not found.
            return -1;
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
        
        public int getSize() {
            return db.size();
        }

        
	public class itemList {
            private int ID;
            private int quantity;
            private String itemName;
            private double price;
            	
            itemList (int ID, int quantity, String itemName, double price) {
                this.ID = ID;
		this.quantity = quantity;
		this.itemName = itemName;
		this.price = price;
            }
            
            public int getID() {
                return this.ID;
            }
            
            public String toString() {
		String result = ID + " " + quantity + " " + itemName + " " + price;
		return result;
            }
	}
}