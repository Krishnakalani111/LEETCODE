class Solution {
    static int arr[][] = new int[500][500];
    public int uniquePaths(int m, int n) {
        if(m==1&&n==1){
            return arr[m][n]=1;
            }
        if(m==0 || n==0){
            return arr[m][n]=0;
        }
        
        if (arr[m][n] == 0){
            arr[m][n] = uniquePaths(m - 1, n)
                       + uniquePaths(m, n - 1);
        }
        return arr[m][n];
    
    }
}