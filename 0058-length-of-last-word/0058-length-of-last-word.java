class Solution {
    public int lengthOfLastWord(String s) {
       int size=0;
       String word="";
       
       String parts[] = s.split(" ");
       word=parts[parts.length-1];
       size=word.length();
       return size;
        
    }
}