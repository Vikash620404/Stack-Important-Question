public static long[] nextLargerElement(long[] arr, int n)
    { 
   
        long[] ans=new long[n];
        Stack<Long>s=new Stack<>();
        s.push(arr[n-1]);
        ans[n-1]=-1;
        
        for(int i=n-2;i>=0;i--){
            while(s.size()>0&&arr[i]>=s.peek())
            {
                s.pop();
                
            }
            if(s.size()==0) ans[i]=-1;
            else
            ans[i]=s.peek();
            s.push(arr[i]);
            
        }
        return ans;
        // Your code here
    } 



//O(N)
//O(N)
