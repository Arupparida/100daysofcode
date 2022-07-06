
//Problem statement :  https://leetcode.com/problems/merge-sorted-array/ 
//Topic tagged : sorting and two pointer method

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for(int i =0;i<nums1.length;i++){
//             if (nums1[i] == 0 ){
//                 for(int j =0;j<nums2.length;j++){
//                     nums1[i] = nums2[j];
//                     i++;
//                     j++;
//                     //Arrays.sort(nums1);
//                 }
//                 Arrays.sort(nums1);
                
//             }
            //Arrays.sort(nums1);
       // }
        
        
        for (int a = m,b =0; a<m+n; a++,b++){
            nums1[a] = nums2[b];
        }
        Arrays.sort(nums1);
    }
}
