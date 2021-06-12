class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
       Set<Integer> covers = new HashSet<>();
		for (int[] range: ranges) {
			for (int i = range[0]; i < range[1] + 1; i ++) {
				covers.add(i);
			}
		}
		for (int i = left; i < right + 1; i ++) {
			if (!covers.contains(i)) {
				return false;
			}
		}
		return true;
    }
}