import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> v = new ArrayList<>();
        int oc=0;
        int cc=0;
        helper(v,n,oc,cc,"");
        return v;
    }
    public void helper(List<String> v, int n, int oc, int cc, String s){
        //base case
        if(cc==n && oc==n){
            v.add(s);
            return;
        }
        if(oc<n){
            helper(v,n,oc+1,cc,s+"(");
        }
        if(cc<oc){
            helper(v,n,oc,cc+1,s+")");
        }
    }
} {
    
}
