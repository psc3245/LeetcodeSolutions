class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        if len(s) < 2:
            return len(s)
        dic = {}
        dic[s[0]] = 1

        maxlen = 0

        l, r = 0, 1
        while r < len(s):
            if s[r] not in dic: dic[s[r]] = 0
            dic[s[r]] += 1

            app = max(dic.values())

            while (r - l + 1) - app > k:
                dic[s[l]] -= 1
                l += 1
                
            maxlen = max(r - l + 1, maxlen)

            r += 1
        return maxlen