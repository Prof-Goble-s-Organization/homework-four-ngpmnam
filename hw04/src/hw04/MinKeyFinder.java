package hw04;

/**
 * Find the key associated with the minimum value in a tree.
 */
public class MinKeyFinder implements CS232Visitor<String, Integer> {
	
	private String minKey;
	private Integer minValue;

	public MinKeyFinder() {
		this.minKey = null;
		this.minValue = null;
	}

	/**
	 * {@inheritDoc}
	 */
	public void visit(String key, Integer value) {
		if( minValue == null || minValue > value) {
			minValue = value;
			minKey = key;
		}
	}

	/**
	 * Get the key associated with the minimum value in the tree.
	 * 
	 * @return the key associated with the minimum value.
	 */
	public String getMinKey() {
		return minKey;
	}
	
	public static void main(String[] args) {
		String[] keys = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		Integer[] vals = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		CS232LinkedBinaryTree tree = new CS232LinkedBinaryTree(keys, vals);
		MinKeyFinder mfk = new MinKeyFinder();
		tree.visitPreOrder(mfk);
		System.out.println(mfk.getMinKey());
	}
}
