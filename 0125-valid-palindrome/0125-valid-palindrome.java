class Solution {
  public boolean isPalindrome(String s) {
    if(s==null) return false;
    String ans = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    int left = 0,right=ans.length()-1;
    while(left<right){
      if(ans.charAt(left)!=ans.charAt(right)) return false;
      left++;
      right--;
    }
    return true;
  }
}