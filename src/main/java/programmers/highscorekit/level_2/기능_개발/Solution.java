package programmers.highscorekit.level_2.기능_개발;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Task> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.add(new Task(progresses[i], speeds[i]));
        }

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            queue.forEach(Task::work);

            int releasedTaskCount = 0;
            while (!queue.isEmpty() && queue.peek().progress >= 100) {
                queue.poll();
                releasedTaskCount++;
            }

            if (releasedTaskCount > 0) {
                answer.add(releasedTaskCount);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Task {
    int progress;
    private int speed;

    Task(int progress, int speed) {
        this.progress = progress;
        this.speed = speed;
    }

    void work() {
        progress += speed;
    }
}
