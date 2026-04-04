class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chrs = str.toCharArray();
            Arrays.sort(chrs);
            String sorted = new String(chrs);
            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }else{
                ArrayList<String> ls = new ArrayList<>();
                ls.add(str);
                map.put(sorted,ls);
            }
        }
        return new ArrayList<>(map.values());
    }
}
