//https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int current = m+n-1;
        int i = m-1;
        int j = n-1;
        
        while (i != -1 && j != -1)
        {
            if (nums1[i] > nums2[j])
                nums1[current--] = nums1[i--];
            else
                nums1[current--] = nums2[j--];
        }
        
        while (i != -1)
            nums1[current--] = nums1[i--];
        while (j != -1)
            nums1[current--] = nums2[j--];
        
    }
}
/*

1 2 3 4 0 0 0
5 6 7


1 6 8 0 0 0
2 3 7


1 6 83 6 7 8



-1 6 3 6 7 8
2 3 7












*/
