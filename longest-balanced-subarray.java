public int findMaxLength(int[] nums){
  Map<Integer, Integer> freq = new HashMap<>();
  freq.put(0, -1);
  int balance =0;
  int maxLength =0;

  for(int i=0 ; i<nums.length; i++){
    balance += (nums[i]==1)? 1: -1;
    if (freq.contains(balance)){
      maxLength = Math.max(maxLength ,i - freq.get(balance));
    }else{
      freq.put(balance, i);
    }
  }

  return maxLength;
}
