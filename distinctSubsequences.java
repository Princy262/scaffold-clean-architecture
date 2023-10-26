class Solution 

{

    int t=1000000007;

    int distinctSubsequences(String S) 

    {

        // code here

        

        int n=S.length();

        long a[]=new long[26];

        Arrays.fill(a,-1);

        

        long ans=0;

        long d = 0;

        

        for(int i=0;i<n;i++)

        {

          int x=S.charAt(i)-'a';

          if(i==0)

          {

            ans =1;

            a[x]=1;

            continue;

          }

          

          d=1+ans;

          if(a[x]==-1)

          {

            ans=(ans+d)%t;  

          }

          else

          {

            ans=(ans+d-a[x])%t; 

          }

          a[x]=d;

        }

        

        ans+=1;

        

        return (int)(ans<0?ans+t:ans);

        

    }

}
