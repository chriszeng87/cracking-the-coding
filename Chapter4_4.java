/**
Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
*/

LinkedList<LinkedList<ListNode>> getListOfEachDep(TreeNode root) {
	LinkedList<LinkedList<TreeNode>> lists = new LinkedList<LinkedList<TreeNode>>();
	if (root == null) {
		return lists;
	}
	
	LinkedList<TreeNode> firstLevel = new LinkedList<TreeNode>();
	firstLevel.add(root);
	lists.add(firstLevel);
	while(true) {
		LinkedList<TreeNode> lastDepth = lists.get(lists.size() - 1);
		LinkedList<TreeNode> newDepth = new LinkedLIst<TreeNode>();
		for (TreeNode node: lastDepth) {
			if (node.left != null) {
				newDepth.add(node.left);
			}
			if (node.right != null) {
				newDepth.add(node.right);
			}
		}
		if (newDepth.size() > 0) {
			lists.add(newDepth);
		} else {
			break;
		}
	}
	return lists;
}
