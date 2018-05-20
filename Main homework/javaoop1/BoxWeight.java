package javaoop1;

public class BoxWeight extends Box {
	private float weight;

	BoxWeight(float width, float height, float depth, float weight) {
		super(width, height, depth);
		this.setWeight(weight);
	}

	// ---------------------------------
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
