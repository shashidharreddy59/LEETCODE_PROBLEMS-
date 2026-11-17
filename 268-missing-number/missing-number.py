class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n=len(nums)
        sum1=n*(n+1)//2
        sum2=sum(nums)
        return sum1-sum2