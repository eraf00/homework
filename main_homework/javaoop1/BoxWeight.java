package javaoop1;

public class BoxWeight extends Box {
	private float weight;

	BoxWeight() {
		setWeight(0);
	}

	BoxWeight(float width, float height, float depth) {
		super(width, height, depth);
	}

	BoxWeight(float width, float height, float depth, float weight) {
		super(width, height, depth);
		setWeight(weight);
	}

	// ---------------------------------
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
