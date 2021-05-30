class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length + 1;
        int[] res = new int[n];
        if(n == 1){
            return new int[0];
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        
        for(int[] arr : adjacentPairs){
            if(!map.containsKey(arr[0])){
                map.put(arr[0], new ArrayList<Integer>());
            }
            map.get(arr[0]).add(arr[1]);
            if(!map.containsKey(arr[1])){
                map.put(arr[1], new ArrayList<Integer>());
            }
            map.get(arr[1]).add(arr[0]);
        }
        
        int curr = 0;
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            if(entry.getValue().size() == 1){
                curr = entry.getKey();
            }
        }
        
        res[0] = curr;
        visited.add(curr);
        int i = 0;
        while(i < n){
            res[i] = curr;
            visited.add(curr);
            for(int x : map.get(curr)){
                if(!visited.contains(x)){
                    curr = x;
                    break;
                }
            }
            i++;
            
        }
        return res;
    }
}