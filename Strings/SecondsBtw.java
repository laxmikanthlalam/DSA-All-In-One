class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        int t1 = Integer.parseInt(startTime.substring(0, 2)) * 3600
               + Integer.parseInt(startTime.substring(3, 5)) * 60
               + Integer.parseInt(startTime.substring(6, 8));

        int t2 = Integer.parseInt(endTime.substring(0, 2)) * 3600
               + Integer.parseInt(endTime.substring(3, 5)) * 60
               + Integer.parseInt(endTime.substring(6, 8));

        return Math.abs(t1 - t2);
    }
}
