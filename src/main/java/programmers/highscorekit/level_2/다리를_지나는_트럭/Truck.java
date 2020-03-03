package programmers.highscorekit.level_2.다리를_지나는_트럭;

import java.util.*;

public class Truck {
    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Integer> trucks = new LinkedList<>();
        Arrays.stream(truckWeights).forEach(trucks::offer);

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < bridgeLength; i++) {
            bridge.add(0);
        }

        int totalWeightOfTrucksOnBridge = 0;
        int crossedTrucksCount = 0;
        int elapsedTime = 0;

        while (crossedTrucksCount < truckWeights.length) {
            Integer truckWeight = Optional.ofNullable(bridge.poll()).orElse(0);
            totalWeightOfTrucksOnBridge -= truckWeight;

            if (truckWeight != 0) {
                crossedTrucksCount++;
            }

            if (!trucks.isEmpty() && totalWeightOfTrucksOnBridge + trucks.peek() <= weight) {
                Integer nextTruckWeight = trucks.poll();
                bridge.offer(nextTruckWeight);
                totalWeightOfTrucksOnBridge += nextTruckWeight;
            } else {
                bridge.offer(0);
            }

            elapsedTime++;
        }

        return elapsedTime;
    }
}
