class AddTwoMatrix
{
   public static void main(String args[])
   {
        int firstmatrix[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int secondmatrix[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int row=3;
        int col=3;
        int addmatrix[][]=new int[row][col];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    addmatrix[i][j]=firstmatrix[i][j]+secondmatrix[i][j];
                    System.out.print(" "+addmatrix[i][j]+" ");
                }
              System.out.println();
            }
         
    } 
}
