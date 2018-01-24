public class testing {
	public static void main(String ar[]){
		BTN root = new BTN(354);
		BTN node1 = new BTN(3246);
		BTN node2 = new BTN(546);
		BTN node3 = new BTN(579832);


		root.left = node1;
		root.right = node2;
		root.left.right = node3;
		root.left.left = null;

		System.out.println(root.left.right.tulostus());
		   
	}
}
