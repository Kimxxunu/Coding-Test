import java.util.*;

class Solution {

    public List<Integer> solution(int[] progresses, int[] speeds) {
        Deque<Task> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            queue.add(new Task(progresses[i], speeds[i]));
        }

        while (!queue.isEmpty()) {
            // 모든 작업 하루 진행
            for (Task task : queue) {
                task.workOneDay();
            }

            // 앞에서부터 완료된 작업 카운트
            int count = 0;
            while (!queue.isEmpty() && queue.peek().isDone()) {
                queue.poll();
                count++;
            }

            if (count > 0) result.add(count);
        }

        return result;
    }

    class Task {
        int progress;
        int speed;

        Task(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        void workOneDay() {
            this.progress += this.speed;
        }

        boolean isDone() {
            return this.progress >= 100;
        }
    }
}
