class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length() || s.length()==0){
            return false;
        }

        String temp = s + s;
        return temp.contains(goal);
    }
}