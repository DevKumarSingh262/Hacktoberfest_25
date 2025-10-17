class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        int majEle = 0;
        for(int num : nums){
            if(count == 0){
                majEle = num;
            }
        count += (num == majEle) ? 1 : -1;         // if(num == majEle)-> count = count + 1;  else-> count = count -1
        }
        return majEle;
    }
}
