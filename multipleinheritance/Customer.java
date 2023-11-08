package multipleinheritance;

public class Customer implements Bike,Car {
	
	@Override
    public void carspeed() {
        System.out.println("car Speed is 300kmph");
    }

    @Override
    public void bikespeed() {
        System.out.println(" bike Speed is 170 kmph");
    }
    
    public static void main(String[] args) {
        Customer x = new Customer();
        x.carspeed();
        x.bikespeed();

}
}
