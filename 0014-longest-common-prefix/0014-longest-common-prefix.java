class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //if array lenght is zero i.e is no strings in it the common prefix would be            zero
        
        if(strs.length==0) return "" ;
        
        //now intializing the first string as the prefix 
        String prefix = strs[0];
        
        //The indexOf() method returns the position of the first occurrence of                  specified character(s) in a string.
        for(int i=1;i<strs.length;i++){
           while(strs[i].indexOf(prefix)!=0){
               // taking the while till zero to find the prefix 
               prefix = prefix.substring(0,prefix.length()-1);
           }
        }
        return prefix;
    }
}