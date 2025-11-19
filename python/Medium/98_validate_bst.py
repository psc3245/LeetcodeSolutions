from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        if root.left:
            if root.left.val >= root.val:
                return False
            if not self.isValidWithBounds(root.left, -sys.maxsize, root.val):
                return False
        if root.right:
            if root.right.val <= root.val:
                return False
            if not self.isValidWithBounds(root.right, root.val, sys.maxsize):
                return False
        return True

    def isValidWithBounds(self, root, minVal, maxVal):
        if not (minVal < root.val < maxVal):
            return False
        if root.left:
            if root.left.val <= minVal or root.left.val >= maxVal:
                return False
            if not self.isValidWithBounds(root.left, minVal, root.val):
                return False
        if root.right:
            if root.right.val <= minVal or root.right.val >= maxVal:
                return False
            if not self.isValidWithBounds(root.right, root.val, maxVal):
                return False
        return True