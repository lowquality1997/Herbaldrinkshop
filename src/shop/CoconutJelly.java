package shop;

public class CoconutJelly extends Topping {
	shop shop;
		public CoconutJelly (shop shop){
			 this.shop = shop;
		}
		
		@Override
		public String getDescription() {

			return  shop.getDescription()+", CoconutJelly ";
		}
		public double cost(){
			return 10 + shop.cost();
		}
		 
	}
