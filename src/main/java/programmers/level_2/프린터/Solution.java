package programmers.level_2.프린터;

import java.util.*;

public class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Item> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Item(i, priorities[i]));
        }

        int answer = 1;

        while (!queue.isEmpty()) {
            Item candidate = queue.poll();

            if (hasHigherPriority(queue, candidate)) {
                queue.offer(candidate);
            } else if (candidate.index == location) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }

    private boolean hasHigherPriority(Queue<Item> queue, Item poll) {
        for (Item item : queue) {
            if (item.priority > poll.priority) {
                return true;
            }
        }
        return false;
    }
}

class Item {
    int index;
    int priority;

    Item(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}
