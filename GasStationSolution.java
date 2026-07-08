class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
          int totalgas = 0, totalcost=0;
          for(int i=0;i<gas.length;i++){
            totalgas = totalgas + gas[i];
            totalcost = totalcost + cost[i];
          }
           if(totalgas < totalcost){
            return -1;
            }
          
            int currentgas =0 , startIndex =0;
            for(int j=0;j<gas.length;j++){
                currentgas = currentgas + gas[j] -cost[j];
                if(currentgas < 0){
                    startIndex = j+1;
                    currentgas = 0;
                }
            }
            
            return startIndex;
            }
}
          