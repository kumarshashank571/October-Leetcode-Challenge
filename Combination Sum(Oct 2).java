class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> smallans = new ArrayList<>();
        combinationinfi(candidates,0,target,ans,smallans);
        return ans;
    }
    public void combinationinfi(int[] arr,int idx,int tar,List<List<Integer>> ans,List<Integer> smallans){
        if(tar==0){
    ans.add(new ArrayList(smallans));
        }
        for(int i=idx;i<arr.length;i++){
            if(tar-arr[i]>=0){
                smallans.add(arr[i]);
                combinationinfi(arr,i,tar-arr[i],ans,smallans);
                smallans.remove(smallans.size()-1);
            }
        }
    }
}
