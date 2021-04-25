class Solution {
    public int maxFrequency(int[] A, int k) {
        // int max=0, maxtotal=0;
        // for(int i =0; i<nums.length;i++){
        //     int num=nums[i];
        //     max=0;
        //     for(int j=0; j<nums.length;j++){
        //         if((nums[j]-num)<= k && (nums[j]-num )>=0)max++;
        //     }
        //     maxtotal = Math.max(maxtotal, max);
        // }
        // return maxtotal;
        int res = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(A);
        for (j = 0; j < A.length; ++j) {
            sum += A[j];
            while (sum + k < (long)A[j] * (j - i + 1)) {
                sum -= A[i];
                i += 1;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}

/*[9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966]
3056
exp 73
o/p 85*/