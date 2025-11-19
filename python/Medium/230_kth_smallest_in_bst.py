from typing import Optional
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        elements = []
        self.traverse(root, elements)
        elements.sort()
        return elements[k - 1]

    def traverse(self, node, elements):
        elements.append(node.val)
        if (node.left):
            self.traverse(node.left, elements)
        if (node.right):
            self.traverse(node.right, elements)
        return elements
        