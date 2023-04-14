package classes;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     grocery myacc=new grocery();
    myacc.setCustomername("Tushar");
    myacc.setCustomerId("#226");
    myacc.setAccbal(500.0);
    myacc.setAddress("Ghaziabad");
    myacc.setCustomerphone("987654342");
    
    myacc.shop(498);
    myacc.recharge(100);
	myacc.shop(200);
	myacc.shop(300);
	myacc.recharge(500);
	}

}
