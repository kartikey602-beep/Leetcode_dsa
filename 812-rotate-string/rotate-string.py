class Solution:
    def rotateString(self, s: str, goal: str) -> bool:

        if len(s) != len(goal) or len(s) == 0:
            return False
        
        temp = s + s
        return goal in temp
        