class Solution {
  public int[] findErrorNums(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i] - 1;
      if (nums[correct] != nums[i])
        swap(nums, i, correct);
      else
        i++;
    }

    for (int idx = 0; idx < nums.length; idx++) {
      if (nums[idx] != idx + 1) {
        return new int[] { nums[idx],idx+1 };
      }
    }

    return new int[] { -1, -1 };
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}