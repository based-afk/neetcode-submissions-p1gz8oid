class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];
        int index = 0;
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        while(k>0){
            int toAdd = helper(map);
            result [index++] = toAdd;
            k--;
        }

        return result;


    }
    static int helper(HashMap<Integer,Integer> map){
        int toAdd = 0;
        int greatest = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue() > greatest){

                greatest = entry.getValue();
                toAdd = entry.getKey();
            }
        }
        map.remove(toAdd);
        return toAdd;
    }
}
