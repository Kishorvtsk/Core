class Access {
	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		id = i;
	}
}

public class GetSet {

	public static void main(String[] args) {
		Access ac = new Access();
		ac.setId(5);
		System.out.println("The id is :" + ac.getId());
		ac.setName("kishor");
		System.out.println("The name is :" + ac.getName());

	}

}
