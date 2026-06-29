class Solution {
  public int findMin(int[] nums) {
    int p = findPivot(nums);
    int fp = Minval(nums,0,p);
    int sp = Minval(nums,p+1,nums.length);
    return fp<sp ? fp:sp;
  }

  static int findPivot(int[] arr) {
    int s = 0, e = arr.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (m < e && arr[m] > arr[m + 1])
        return m;
      if (m > s && arr[m] < arr[m - 1])
        return m - 1;

      if (arr[m] >= arr[s]) {
        s = m + 1;
      } else {
        e = m - 1;
      }
    }
    return -1;
  }

  static int Minval(int[] arr,int s,int e) {

    int min= arr[s];
    for(int i = s+1;i<e;i++){
      if(min>arr[i]) min=arr[i];
    }
    return min;
  }

}