import java.util.ArrayList  ;   
public class ContigousSubsequences {
    private static void Contisubseq(int idx,int []a,ArrayList<Integer>d)
    {
        if(idx == a.length)
        {
            for(int i : d)
            {
                System.out.print( i +" ");
            } 
             System.out.println();
            return ;
          
        }

        // Pick function to Take elements 
         d.add(a[idx]);
         Contisubseq(idx+1,a,d);
         d.remove(d.size()-1);
        // Not to pick 
         Contisubseq(idx+1,a,d);
    }
    public static void main(String [] args)
    {
        
        ArrayList<Integer> d = new ArrayList<>();
        int [] a = {1,2,3,4};
        int idx = 0;

        Contisubseq(idx,a,d);
    }
}
