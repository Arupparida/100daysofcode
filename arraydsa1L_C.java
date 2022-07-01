/*
Contains Duplicate Question - leetcode (Easy level) #DSA begins
Problem statemnet link - https://leetcode.com/problems/contains-duplicate/
My Possible solutions 

*/
 class Solution {
     public boolean containsDuplicate(int[] nums) {
         if(nums ==null || nums.length<2)
             return false;
         Arrays.sort(nums);

        
         for (int i = 1;i<nums.length;i++)
             
             if (nums[i-1] == nums[i])
                 return true;
           
        
        return false;
     }
     
 }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         if(nums == null || nums.length<2)
//             return false;
//         Arrays.sort(nums);
//         for (int i = 1;i<nums.length;i++)
//             
//             if (nums[i-1] == nums[i])
//                 return true;
            
        
//         return false;
//     }
//     
// }


