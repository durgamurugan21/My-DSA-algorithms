class FindFourElements  
{ 
    void findFourElements(int A[], int n, int X)  
    { 
        
        for (int i = 0; i < n - 3; i++)  
        { 
            
            for (int j = i + 1; j < n - 2; j++)  
            { 
                
                for (int k = j + 1; k < n - 1; k++)  
                { 
                    
                    for (int l = k + 1; l < n; l++)  
                    { 
                        if (A[i] + A[j] + A[k] + A[l] == X)  
                            System.out.print(A[i]+" "+A[j]+" "+A[k]  
                                                                 +" "+A[l]); 
                    } 
                } 
            } 
        } 
    }   
    public static void main(String[] args)  
    { 
        FindFourElements findfour = new FindFourElements(); 
        int A[] = {10, 20, 30, 40, 1, 2,5}; 
        int n = A.length; 
        int X = 73; 
        findfour.findFourElements(A, n, X); 
    } 
} 