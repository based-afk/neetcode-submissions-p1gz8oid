class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        Deque<Double> stk = new ArrayDeque<>();
        for (int i = 0; i < pairs.length; i++) {
            double timeToReach = (double) (target - pairs[i][0]) / pairs[i][1];
            if (stk.isEmpty()) {
                stk.push(timeToReach);
            } else if (timeToReach > stk.peek()) {
                stk.push(timeToReach);

            }

        }
        return stk.size();
    }
}
