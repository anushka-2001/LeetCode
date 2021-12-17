/*
// Definition for an Interval.
class Interval {
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};
*/

class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> allIntervals = new ArrayList<>();
        List<Interval> freeTimes = new ArrayList<>();
        
        if(schedule.size() == 0){
            return freeTimes;
        }
        // add all intervals to allIntervals list
        for (List<Interval> list : schedule) {
            allIntervals.addAll(list);
        }
        
        // sort all intervals based on start time
        Collections.sort(allIntervals, (a, b) -> a.start- b.start);

        
        Interval  lastInterval = allIntervals.get(0);
        
        for(int i = 1; i< allIntervals.size(); i++){
            
            Interval current = allIntervals.get(i);
            
            
            // no overalp
            if(current.start > lastInterval.end){
                
                freeTimes.add(new Interval(lastInterval.end, current.start));
                
                lastInterval = current;
                
                
        
            }else{
                lastInterval.end = Math.max(lastInterval.end, current.end);
            }
            
            
        }
        
        return freeTimes;
        
        
    }
}