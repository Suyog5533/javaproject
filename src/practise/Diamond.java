package practise;

public class Diamond implements Interface1,Interface2  {

	public static void main(String[] args) {
	
		Diamond d = new Diamond();
		d.songs();
		d.honey();
//		Interface1.money();
//		Interface2.money();
		d.money();

	
		
	}

	@Override
	public void songs() {
		System.out.println("my fav song is yo yo ");
		
	}

	@Override
	public void honey() {
		System.out.println("yo yo honey");
		
	}
	
	public void money() {
		
		System.out.println("i have 10 lakhs");
		Interface1.super.money();
        Interface2.super.money();
	}

}
