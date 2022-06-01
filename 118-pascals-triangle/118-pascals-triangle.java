class Solution {
    public List<List<Integer>> generate(int numRows) {
          int numIndentations = numRows-1;
        List<List<Integer>> result = new ArrayList();
        
        if (numRows == 0)
            return result;
        
        result.add(new ArrayList(Arrays.asList(1)));
        if (numRows == 1)
            return result;
        
        for (int i=1; i< numRows; i++) {
            List<Integer> collector = new ArrayList();
            collector.add(1);
            List<Integer> prev = result.get(i-1);
            for (int j=0; j<i-1; j++) {
                collector.add(prev.get(j) + prev.get(j+1));
            }
            collector.add(1);
            result.add(collector);
        }
        
        return result;
    }
}