package diamond_ambiquity;

public class BikeQuotations implements Interface_hero_bike,Interface_honda_bike {

	public static void main(String[] args) {
		BikeQuotations obj = new BikeQuotations();
        obj.quotation();
        obj.money();

	}
	 public void quotation()
{
		Interface_honda_bike.super.quotation();
		Interface_hero_bike.super.quotation();
}
	@Override
	public void money() {
		System.out.println("cost is too high");
		
	}
}
