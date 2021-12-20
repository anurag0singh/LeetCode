class Solution(object):
    def findSubsets(self, nums):
        if len(nums) == 1:
            subsets = [[]]
            subsets.append(nums)
            return subsets
        else:
            subsets = self.findSubsets(nums[1:])
            res = []
            for sets in subsets:
                res.append(sets)
                res.append([nums[0]] + sets)
            return res
    
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        return self.findSubsets(nums)