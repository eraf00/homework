package javaoop1;

public class Box {
	private float width, height, depth;

	Box() {
		this.width = -1;
		this.height = -1;
		this.depth = -1;
		System.out.println("I am aBox");
	}

	Box(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// -----------------------------
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

}
