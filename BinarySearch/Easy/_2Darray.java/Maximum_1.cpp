int rowWithMax1s(vector<vector<int>> &matrix, int n, int m)
{
       int max=-1;
      int idx=-1;
      for(int i=0;i<n;i++){
          int count=0;
          for(int j=0;j<n;j++){
             if(matrix[i][j]==1){
                 count++;
             }
          }
          if(count>max){
              max=count;
              idx=i;
          }
      }
      return idx;
}