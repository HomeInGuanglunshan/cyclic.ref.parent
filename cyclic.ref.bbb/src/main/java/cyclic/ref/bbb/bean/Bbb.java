package cyclic.ref.bbb.bean;

public class Bbb {

	Integer weight;

	Integer height;

	public Bbb(Integer weight, Integer height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Bbb [weight=" + weight + ", height=" + height + "]";
	}
}
