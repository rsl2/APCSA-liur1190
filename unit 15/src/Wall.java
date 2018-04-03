public class Wall {
	private int left;
	private int right;
	private int top;
	private int bottom;
	
	public Wall(int l, int r, int t, int b) {
		setLeft(l);
		setRight(r);
		setTop(t);
		setBottom(b);
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public int getTop() {
		return top;
	}

	public int getBottom() {
		return bottom;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
}