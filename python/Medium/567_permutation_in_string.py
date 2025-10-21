class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        s1_count = [0] * 26
        s2_count = [0] * 26

        for c in s1:
            s1_count[ord(c) - ord('a')] += 1

        for i in range(len(s1)):
            s2_count[ord(s2[i]) - ord('a')] += 1
        
        matches = 0
        for i in range(26):
            if s1_count[i] == s2_count[i]:
                matches += 1

        if matches == 26: return True

        for i in range(len(s1), len(s2)):
            r = ord(s2[i]) - ord('a')
            l = ord(s2[i - len(s1)]) - ord('a')

            if s1_count[r] == s2_count[r]:
                matches -= 1
            s2_count[r] += 1
            if s1_count[r] == s2_count[r]:
                matches += 1
            
            if s1_count[l] == s2_count[l]:
                matches -= 1
            s2_count[l] -= 1
            if s1_count[l] == s2_count[l]:
                matches += 1

            if matches == 26:
                return True

        return False


