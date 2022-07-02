/*Two sum question leetcode
Link - https://leetcode.com/problems/two-sum/
Possible solution along with some assumptions
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            for (int j = 0;j!=i && j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    //Arrays.sort[arr];
                    break;
                }
                else{
                    continue;
                }
            }
        }
        return arr;
        
    }
}
//currently I am using brute force method 
// later to improve space and time complexity we can use hashmap as well to fasten the result
//also here we are assuming that the output will have exactly two elements in the array.
