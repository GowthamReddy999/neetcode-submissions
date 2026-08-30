from typing import List
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        s1={}
        final=[]
        for i in nums:
            s1[i]=s1.get(i,0)+1
        for i in range(k):
            max_key=max(s1,key=s1.get)
            final.append(max_key)
            del s1[max_key]

            if len(final)==k:
                return final
        # else:
        #     return nums[:k]
        
            

            
        