package shop;

public class Chaokuai extends Topping {
    shop shop;
	
	public Chaokuai(shop shop){
		 this.shop = shop;
	}
	
	@Override
	public String getDescription() {

		return  shop.getDescription()+", Chaokuai";
	}
	public double cost(){
		return 10 + shop.cost();
	}
	 
}
