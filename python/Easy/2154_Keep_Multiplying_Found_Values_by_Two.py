

class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        if original in nums:
            original *= 2
            return self.findFinalValue(nums, original)
        return original