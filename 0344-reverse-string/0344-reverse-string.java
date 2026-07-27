class Solution {
  public void reverseString(char[] arr) {
    for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
      if (start == end)
        break;
      else
        swap(start, end, arr);
    }
  }

  static void swap(int x, int y, char[] arr) {
    char temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
}