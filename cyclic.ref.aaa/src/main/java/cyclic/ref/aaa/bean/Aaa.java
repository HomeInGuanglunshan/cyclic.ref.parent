package cyclic.ref.aaa.bean;

public class Aaa {

	String name;

	String id;

	public Aaa(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Aaa [name=" + name + ", id=" + id + "]";
	}

}
