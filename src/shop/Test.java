package shop;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shop A1 = new Rosellejuice();
		A1 = new Mediem(A1);
		A1 = new Chaokuai(A1);
		A1 = new CoconutJelly(A1);
        System.out.println(A1.getDescription()+ " $ = "+ A1.cost() );
		
		shop A2 = new Herbalcoollingtea();
		A2 = new Mediem(A2);
		A2 = new Chaokuai(A2);
		A2 = new CoconutJelly(A2);
		System.out.println(A2.getDescription()+ " $ = "+ A2.cost() );
		
		shop A3 = new Chrysanthemujuice();
		A3 = new Mediem(A3);
		A3 = new Chaokuai(A3);
		A3 = new CoconutJelly(A3);
		System.out.println(A3.getDescription()+ " $ = "+ A3.cost() );
		
		shop A4 = new Pennywort();
		A4 = new Mediem(A4);
		A4 = new Chaokuai(A4);
		A4 = new CoconutJelly(A4);
		System.out.println(A4.getDescription()+ " $ = "+ A4.cost() );
		
		shop A5 = new Rosellejuice();
		A5 = new Large(A5);
		A5 = new Chaokuai(A5);
		A5 = new CoconutJelly(A5);
        System.out.println(A5.getDescription()+ " $ = "+ A5.cost() );
		
		shop A6 = new Herbalcoollingtea();
		A6 = new Large(A6);
		A6 = new Chaokuai(A6);
		A6 = new CoconutJelly(A6);
		System.out.println(A6.getDescription()+ " $ = "+ A6.cost() );
		
		shop A7 = new Chrysanthemujuice();
		A7 = new Large(A7);
		A7 = new Chaokuai(A7);
		A7 = new CoconutJelly(A7);
		System.out.println(A7.getDescription()+ " $ = "+ A7.cost() );
		
		shop A8 = new Pennywort();
		A8 = new Large(A8);
		A8 = new Chaokuai(A8);
		A8 = new CoconutJelly(A8);
		System.out.println(A8.getDescription()+ " $ = "+ A8.cost() );
		
	}
}
