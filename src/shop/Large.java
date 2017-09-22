package shop;

public class Large extends Size {
	
shop shop;
	
	public Large(shop shop){
		 this.shop = shop;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  shop.getDescription()+", Size Large ";
	}
	public double cost(){
		return 20 + shop.cost();
	}
}

