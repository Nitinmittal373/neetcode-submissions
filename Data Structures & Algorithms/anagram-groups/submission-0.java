class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] cou=new int[26];
            for(char c:strs[i].toCharArray()){
                cou[c-'a']++;
            }
            String key=Arrays.toString(cou);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        List<List<String>> list=new ArrayList<>();
        for(String s:map.keySet()){
            list.add(map.get(s));
        }
        return list;
    }
}
