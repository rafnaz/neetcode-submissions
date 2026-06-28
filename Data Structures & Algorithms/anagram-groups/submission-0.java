class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagraMap = new HashMap<>();
        
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(anagraMap.containsKey(sorted)) {
                anagraMap.get(sorted).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str); 
                anagraMap.put(sorted, list);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(List list : anagraMap.values()) {
            result.add(list);
        }

        return result;
    }
}
