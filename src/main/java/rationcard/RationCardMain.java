package rationcard;

public class RationCardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RationItems.update("wheat", "10 Kg");
		String items = RationItems.weight("wheat");
		System.out.println(items);
	}

}
