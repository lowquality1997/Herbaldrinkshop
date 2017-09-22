package shop;

public class Mediem extends Size {
	shop shop;
			
			public Mediem(shop shop){
				 this.shop = shop;
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return  shop.getDescription()+", Size Mediem ";
			}
			public double cost(){
				return 10 + shop.cost();
			}
		}


