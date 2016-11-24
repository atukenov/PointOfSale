package pointofsale;


public class itemList {
		int ID;
		int quantity;
		String itemName;
		double price;
                String username;
                String password;
		
		itemList (int ID, String itemName, int quantity, double price) {
			this.ID = ID;
			this.quantity = quantity;
			this.itemName = itemName;
			this.price = price;
		}
                
                itemList (String username, String password)
                {
                    this.password = password;
                    this.username = username;
                }
		
		public String toString() {
			String result = ID + " " + quantity + " " + itemName + " " + price;
			return result;
		}
}