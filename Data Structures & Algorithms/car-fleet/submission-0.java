class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for(int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        int fleets = 0;
        double prevTime = 0.0;
        for(int i = 0; i < n; i++) {
            int curPos = cars[i][0];
            int curSpeed = cars[i][1];
            double curTime = (double) (target - curPos) / curSpeed;

            if(curTime > prevTime) {
                fleets++;
                prevTime = curTime;
            }
        }
        return fleets;
    }
}
