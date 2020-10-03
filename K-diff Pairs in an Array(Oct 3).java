class Solution {
    public int findPairs(int[] nums, int k) {
       Arrays.sort(nums); // O(nlogn)
        List<List<Integer>> list = new ArrayList<>(); //to keep track of repeating pairs
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                List<Integer> temp = new ArrayList<>();//every iteration refresh temp
                temp.add(nums[j]);
                temp.add(nums[i]);
                if(nums[j]-nums[i]==k){
                    if(!list.contains(temp)){
                        list.add(temp);
                        count++;
                    }
                    break;
                //since array is sorted, if I find nums[i],nums[j] pair, I can break
                //since any other option might just be a repition
                }
            }
        }
        
        return count;
    }
}
