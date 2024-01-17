class Solution {
    public int max(int [][]mat,int n,int col){
        int maxValue=-1;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>maxValue){
                maxValue=mat[i][col];
                idx=i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            // Getting the max Value from the row
            int row=max(mat,n,mid);
            // Hence we get the max Value from the row then we have to check the 
            //adjacent colums left and right if it is at the leftmost or        
            //rightmost then we take the -1 as the value
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid+1<m ?mat[row][mid+1]:-1;
            //If the value is greater than the left and right then we return that value beacuse it is already greater then the top and bottom element of the column
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            //if the value of the element is less than the left element then we assume that the greater vakue present in the left side of the matrix then we check the left side only 
            else if(mat[row][mid]<left)high=mid-1;
            //else right side
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }
}