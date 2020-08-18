class Solution {
    public String reverseLeftWords(String s, int n) {
    //    return s.substring(n)+ s.substring(0,n);
    String str ="";
    for(int i = n; i < n+s.length(); i++){
        str += s.charAt(i % s.length()); 
    }
    return str;
    }
}