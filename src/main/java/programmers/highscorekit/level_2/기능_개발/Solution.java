package programmers.highscorekit.level_2.기능_개발;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            tasks.add(new Task(progresses[i], speeds[i]));
        }

        Queue<Task> queue = new LinkedList<>(tasks);
        Queue<Integer> answer = new LinkedList<>();

        while (!queue.isEmpty()) {
            tasks.forEach(Task::work);

            int releasedTaskCount = 0;
            while (!queue.isEmpty() && queue.peek().progress >= 100) {
                queue.poll();
                releasedTaskCount++;
            }

            if (releasedTaskCount > 0) {
                answer.offer(releasedTaskCount);
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
