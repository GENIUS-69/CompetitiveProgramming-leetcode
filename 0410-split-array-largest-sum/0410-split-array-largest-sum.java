class Solution {
  public int splitArray(int[] arr, int m) {
    int start = 0, end = 0;

    for (int i = 0; i < arr.length; i++) {
      start = Math.max(start, arr[i]);
      end += arr[i];
    }

    while (start < end) {
      // try middle as potential answer
      int mid = start + (end - start) / 2;

      // calculate how many piece we can divide
      int sum = 0, piece = 1;

      for (int num : arr) {
        if (sum + num > mid) {
          // new sub-array bcz the limit exceed

          sum = num;
          piece++;
        } else {
          sum += num;
        }
      }

      if (piece > m) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return end;
  }
}