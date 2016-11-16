package pointofsale;


public class itemList {
		int ID;
		int quantity;
		String itemName;
		double price;
		
		itemList (int ID, String itemName, int quantity, double price) {
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