package programmers.highscorekit.level_2.다리를_지나는_트럭;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

public class Truck {
    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Integer> waitingTrucks = Arrays.stream(truckWeights).boxed().collect(toCollection(LinkedList::new));
        Queue<Integer> bridge = Stream.generate(() -> 0).limit(bridgeLength).collect(toCollection(LinkedList::new));

        int totalWeightOfTrucksOnBridge = 0;
        int crossedTrucksCount = 0;
        int elapsedTime = 0;

        while (crossedTrucksCount < truckWeights.length) {
            Integer crossedTruckWeight = Optional.ofNullable(bridge.poll()).orElse(0);
            totalWeightOfTrucksOnBridge -= crossedTruckWeight;

            if (crossedTruckWeight != 0) {
                crossedTrucksCount++;
            }

            if (!waitingTrucks.isEmpty() && totalWeightOfTrucksOnBridge + waitingTrucks.peek() <= weight) {
                Integer nextTruckWeight = waitingTrucks.poll();
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
