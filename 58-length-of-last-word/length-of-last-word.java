class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String a=s.trim();
        for(int i=a.length()-1;i>=0;i--){
            char c=a.charAt(i);
            if(c==' '){
                return count;
            }
            count++;
        }
        return count;
    }
}