class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double carsTimePair[][] = new double[n][2];

        //compute time to reach target
        for(int i=0;i<n;i++){
            double time = (double)(target-position[i])/speed[i];
            carsTimePair[i][0]=position[i];
            carsTimePair[i][1]=time;
        }
        //Sort by position descending order
        Arrays.sort(carsTimePair,(a,b)->Double.compare(b[0],a[0]));
        int fleet = 0;
        double lastTime = 0;
        for(int i=0;i<n;i++){
            if(carsTimePair[i][1]>lastTime){
                fleet++;
                lastTime=carsTimePair[i][1];
            }
        }

        return fleet;
    }
}
