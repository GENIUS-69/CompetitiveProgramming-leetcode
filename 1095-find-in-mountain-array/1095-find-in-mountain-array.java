/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
  public int findInMountainArray(int target, MountainArray mountainArr) {

    int peak = peakIndexInMountainArray(mountainArr);
    int firstTry = binarySearch(mountainArr, target, 0, peak);
    if (firstTry != -1)
      return firstTry;

    return binarySearch(mountainArr, target, peak + 1, mountainArr.length()-1);

  }

  public int peakIndexInMountainArray(MountainArray arr) {
    int left = 0;
    int right = arr.length() - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (arr.get(mid) < arr.get(mid + 1)) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }

  static int binarySearch(MountainArray arr, int target, int s, int e) {

    boolean isAsc = arr.get(s) < arr.get(e);

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr.get(m) == target)
        return m;

      if (isAsc) {
        if (target < arr.get(m))
          e = m - 1;
        else if (target > arr.get(m))
          s = m + 1;
      } else {
        if (target > arr.get(m))
          e = m - 1;
        else if (target < arr.get(m))
          s = m + 1;
      }
    }
    return -1;
  }
}