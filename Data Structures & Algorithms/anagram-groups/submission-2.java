class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hash = new HashMap<>();

        for(String s: strs){

            int[] count = new int[26];

            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;

            }
            String key = Arrays.toString(count);
            if(!hash.containsKey(key)){
                hash.put(key,new ArrayList<>());
            }

            hash.get(key).add(s);
            

        }
        return new ArrayList<>(hash.values());
        
    }
}
